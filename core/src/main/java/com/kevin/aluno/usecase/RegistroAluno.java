package com.kevin.aluno.usecase;

import com.kevin.aluno.entity.Aluno;
import com.kevin.aluno.gateway.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistroAluno {

    @Autowired
    AlunoRepository alunoRepository;

    public void save(Aluno aluno) {
        alunoRepository.save(aluno);
    }
}
