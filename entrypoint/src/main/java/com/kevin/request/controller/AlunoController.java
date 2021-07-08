package com.kevin.request.controller;

import com.kevin.aluno.entity.Aluno;
import com.kevin.aluno.usecase.BuscaAluno;
import com.kevin.aluno.usecase.RegistroAluno;
import com.kevin.request.AlunoRequest;
import com.kevin.request.mapper.AlunoRequestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {

    @Autowired
    private RegistroAluno registroAluno;

    @Autowired
    private BuscaAluno buscaAluno;

    @Autowired
    private AlunoRequestMapper requestMapper;

    @GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<Object> findAll() {
        List<Aluno> alunoList = buscaAluno.findAll();
        return new ResponseEntity<Object>(alunoList, HttpStatus.OK);
    }

    @PostMapping
    public void save(@RequestBody AlunoRequest request) {
        registroAluno.save(requestMapper.toAluno(request));
    }
}
