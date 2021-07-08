package com.kevin.aluno.usecase;

import com.kevin.aluno.entity.Aluno;
import com.kevin.aluno.gateway.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuscaAluno {

    @Autowired
    AlunoRepository alunoRepository;

    public List<Aluno> findAll() {
       return alunoRepository.findAll();
    }
}
