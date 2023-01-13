package dev.claudioBessa.java.avancado.web.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Faculdade {

    @Id
    @GeneratedValue
    private Integer id;

    private String nome;

    private String descricao;

    private String localidade;

}
