package com.kevin.repository.mapper;

import com.kevin.aluno.entity.Aluno;
import com.kevin.repository.entity.AlunoEntity;

import java.util.ArrayList;
import java.util.List;

public class AlunoMapper {

    public static List<Aluno> converteToAlunoDomain(List<AlunoEntity> alunoEntities) {

        List<Aluno> alunoList = new ArrayList<>();

        alunoEntities.forEach(
                alunos -> alunoList.add(
                        Aluno.builder()
                                .name(alunos.getName())
                                .registrationNumber(alunos.getRegistrationNumber())
                                .build())
        );

        return alunoList;
    }
}
