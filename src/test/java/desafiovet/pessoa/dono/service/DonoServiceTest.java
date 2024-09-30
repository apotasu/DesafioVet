package desafiovet.pessoa.dono.service;

import desafiovet.pessoa.dono.entity.Dono;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class DonoServiceTest {

    @Mock
    DonoService donoService;
    @Test
    void getDonosWhenEmpty() {
        //Arrange
        Mockito.doReturn(0).when(donoService).getDonosSize();
        //Act
        donoService.getDonosSize();
        //Arrange
        Mockito.verify(donoService,Mockito.times(1)).getDonosSize();
    }
    @Test
    void getDonosWhenNotEmpty() {
        //Arrange
        Dono exemplo = new Dono();
        Mockito.doNothing().when(donoService).addNewDono(exemplo);
        Mockito.doReturn(1).when(donoService).getDonosSize();
        //Act
        donoService.addNewDono(exemplo);
        donoService.getDonosSize();
        //Assert
        Mockito.verify(donoService,Mockito.times(1)).addNewDono(exemplo);
        Mockito.verify(donoService,Mockito.times(1)).getDonosSize();
    }
    @Test
    void addNewDono() {
        //Arrange
        Dono exemplo = new Dono();
        Mockito.doNothing().when(donoService).addNewDono(exemplo);
        //Act
        donoService.addNewDono(exemplo);
        //Assert
        Mockito.verify(donoService,Mockito.times(1)).addNewDono(exemplo);
    }

    @Test
    void deleteDonoWhenValidIdProvided() {
        //Arrange
        Dono exemplo = new Dono();
        Mockito.doNothing().when(donoService).addNewDono(exemplo);
        Mockito.doNothing().when(donoService).deleteDono(1L);
        //Act
        donoService.addNewDono(exemplo);
        donoService.deleteDono(1L);
        //Assert
        Mockito.verify(donoService, Mockito.times(1)).addNewDono(exemplo);
        Mockito.verify(donoService, Mockito.times(1)).deleteDono(1L);
    }
    @Test
    void deleteDonoWhenInvalidIdProvided() {
        //Arrange
        Mockito.doNothing().when(donoService).deleteDono(1L);
        //Act
        donoService.deleteDono(1L);
        //Assert
        Mockito.verify(donoService, Mockito.times(1)).deleteDono(1L);
    }
}