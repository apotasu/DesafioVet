package desafiovet.pessoa.dono.entity;

import desafiovet.pessoa.entity.Pessoa;
import desafiovet.pet.entity.Pet;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Dono extends Pessoa {
    @OneToOne
    private Pet pet;
    private String documento;

    public Dono(String nome, int idade, String documento, Pet pet) {
        super(nome, idade, documento);
        this.pet = pet;
    }
    public Dono(String nome, int idade, String documento) {
        super(nome, idade, documento);
    }

    public Dono() {

    }
}

