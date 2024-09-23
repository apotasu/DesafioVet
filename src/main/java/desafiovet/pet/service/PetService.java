package desafiovet.pet.service;


import desafiovet.pet.entity.Pet;
import desafiovet.pet.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {
    @Autowired
    private PetRepository petRepository;

    public List<Pet> getPets(){
        return petRepository.findAll();
    }
    public void addNewPet(Pet pet){
        petRepository.save(pet);
    }
    public void deletePet(Long id){
        petRepository.delete(petRepository.findPetById(id));
    }
}
