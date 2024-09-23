package desafiovet.pet.controller;

import desafiovet.pet.entity.Pet;
import desafiovet.pet.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/pet")
public class PetController {
    @Autowired
    private PetService petService;

    @GetMapping
    public List<Pet> getPets(){
        return petService.getPets();
    }
    @DeleteMapping(path = "{petId}")
    public void deletePet(@PathVariable("petId")Long petId){
        petService.deletePet(petId);
    }
    @PostMapping
    public void addPet(@RequestBody Pet pet){
        petService.addNewPet(pet);
    }
}
