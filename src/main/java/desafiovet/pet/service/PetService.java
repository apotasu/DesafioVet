package desafiovet.pet.service;

import desafiovet.pet.entity.Pet;
import desafiovet.pet.repository.PetRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    private static final Logger logger = LoggerFactory.getLogger(PetService.class);

    @Autowired
    private PetRepository petRepository;

    public int getPetsSize() {
        int size = petRepository.findAll().size();
        logger.info("Total de pets: {}", size);
        return size;
    }

    public List<Pet> getPets() {
        List<Pet> pets = petRepository.findAll();
        logger.info("Pets recuperados: {}", pets.size());
        return pets;
    }

    public void addNewPet(Pet pet) {
        petRepository.save(pet);
        logger.info("Novo pet adicionado: {}", pet);
    }

    public void deletePet(Long id) {
        Pet pet = petRepository.findPetById(id);
        if (pet != null) {
            petRepository.delete(pet);
            logger.info("Pet deletado com ID: {}", id);
        } else {
            logger.warn("Tentativa de deletar pet com ID não encontrado: {}", id);
        }
    }
}
