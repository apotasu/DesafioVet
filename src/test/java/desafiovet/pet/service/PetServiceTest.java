package desafiovet.pet.service;

import desafiovet.pet.entity.Pet;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class PetServiceTest {
    @Mock
    PetService petService;
    @Test
    void getPetsWhenEmpty() {
        //Arrange
        Mockito.doReturn(0).when(petService).getPetsSize();
        //Act
        petService.getPetsSize();
        //Assert
        Mockito.verify(petService, Mockito.times(1)).getPetsSize();
    }
    @Test
    void getPetsWhenNotEmpty() {
        //Arrange
        Pet exemplo = new Pet();
        Mockito.doNothing().when(petService).addNewPet(exemplo);
        Mockito.doReturn(0).when(petService).getPetsSize();
        //Act
        petService.addNewPet(exemplo);
        petService.getPetsSize();
        //Assert
        Mockito.verify(petService,Mockito.times(1)).addNewPet(exemplo);
        Mockito.verify(petService, Mockito.times(1)).getPetsSize();
    }

    @Test
    void addNewPet() {
        //Arrange
        Pet exemplo = new Pet();
        Mockito.doNothing().when(petService).addNewPet(exemplo);
        //Act
        petService.addNewPet(exemplo);
        //Assert
        Mockito.verify(petService,Mockito.times(1)).addNewPet(exemplo);
    }

    @Test
    void deletePetWhenValidIdProvided() {
        //Arrange
        Pet exemplo = new Pet();
        Mockito.doNothing().when(petService).addNewPet(exemplo);
        Mockito.doNothing().when(petService).deletePet(1L);
        //Act
        petService.addNewPet(exemplo);
        petService.deletePet(1L);
        //Assert
        Mockito.verify(petService,Mockito.times(1)).addNewPet(exemplo);
        Mockito.verify(petService,Mockito.times(1)).deletePet(1L);
    }
    @Test
    void dontDeletePetWhenInvalidIdProvided() {
        //Arrange
        Mockito.doNothing().when(petService).deletePet(1L);
        //Act
        petService.deletePet(1L);
        //Assert
        Mockito.verify(petService,Mockito.times(1)).deletePet(1L);
    }
}