package desafiovet.pet.entity;

import desafiovet.pessoa.dono.entity.Dono;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Pet {
    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    private Dono dono;
    private String nome;
    private int idade;
    private double peso;

    public Pet(Dono dono, String nome, int idade, double peso) {
        this.dono = dono;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public Pet(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public Pet() {
    }
}
