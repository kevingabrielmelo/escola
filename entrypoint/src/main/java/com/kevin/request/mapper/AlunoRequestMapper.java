package com.kevin.request.mapper;

import com.kevin.aluno.entity.Aluno;
import com.kevin.request.AlunoRequest;
import org.springframework.stereotype.Component;

@Component
public class AlunoRequestMapper {

    public Aluno toAluno(AlunoRequest request) {
        return new Aluno(request.getName());
    }
}
