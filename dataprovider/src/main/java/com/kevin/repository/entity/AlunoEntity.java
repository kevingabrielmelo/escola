package com.kevin.repository.entity;

import com.kevin.aluno.entity.Aluno;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;
import java.util.UUID;

@Builder
@Getter
@Entity
@Table(name = "ALUNO")
public class AlunoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private UUID registrationNumber;
    private String name;

    public AlunoEntity(Long id, UUID registrationNumber, String name) {
        this(registrationNumber, name);
        this.id = id;
    }

    public AlunoEntity(UUID registrationNumber, String name) {
        this.registrationNumber = UUID.randomUUID();
        this.name = name;
    }

    public static AlunoEntity from(Aluno aluno) {
        return new AlunoEntity(aluno.getRegistrationNumber(), aluno.getName());
    }

    public AlunoEntity() {}
}
