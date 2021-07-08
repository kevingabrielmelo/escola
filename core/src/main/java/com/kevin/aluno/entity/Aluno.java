package com.kevin.aluno.entity;

import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Getter
public class Aluno {

    private UUID registrationNumber;
    private String name;

    @Builder
    public Aluno(String name, UUID registrationNumber) {
        this.name = name;
        this.registrationNumber = registrationNumber;
    }

    @Builder
    public Aluno(String name) {
        this.name = name;
    }
}