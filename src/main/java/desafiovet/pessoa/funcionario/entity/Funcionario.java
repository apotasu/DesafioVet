package desafiovet.pessoa.funcionario.entity;

import desafiovet.pessoa.entity.Pessoa;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Funcionario extends Pessoa {
    @Id
    @GeneratedValue
    private Long id;
    private double salario;

    public Funcionario(String nome,int idade, String documento, double salario) {
        super(nome, idade, documento);
        this.salario = salario;
    }

    public Funcionario() {

    }

}
