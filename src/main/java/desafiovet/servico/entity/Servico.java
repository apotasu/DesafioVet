package desafiovet.servico.entity;

import desafiovet.pessoa.funcionario.entity.Funcionario;
import desafiovet.pet.entity.Pet;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.ArrayList;

@Entity
public class Servico {
    @Id
    @GeneratedValue
    private Long id;
    @OneToMany
    private ArrayList<Funcionario> funcionarios;
    @OneToOne
    private Pet pet;

    private double preco;
    private int duracao;

    public Servico(ArrayList<Funcionario> funcionarios, Pet pet, double preco, int duracao) {
        this.funcionarios = funcionarios;
        this.pet = pet;
        this.preco = preco;
        this.duracao = duracao;
    }

    public Servico(double preco, int duracao) {
        this.preco = preco;
        this.duracao = duracao;
    }

    public Servico() {

    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
