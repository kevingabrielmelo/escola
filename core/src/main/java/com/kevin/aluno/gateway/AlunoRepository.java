package com.kevin.aluno.gateway;

import com.kevin.aluno.entity.Aluno;

import java.util.List;

public interface AlunoRepository {

    void save(Aluno aluno);

    List<Aluno> findAll();
}
