package com.kevin.repository;

import com.kevin.aluno.entity.Aluno;
import com.kevin.aluno.gateway.AlunoRepository;
import com.kevin.repository.entity.AlunoEntity;
import com.kevin.repository.mapper.AlunoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class AlunoRepositoryImpl implements AlunoRepository {

    @Autowired
    AlunoDao alunoDao;

    @Override
    public void save(Aluno aluno) {
        alunoDao.save(AlunoEntity.from(aluno));

    }

    @Override
    public List<Aluno> findAll() {
       return AlunoMapper.converteToAlunoDomain(alunoDao.findAll());
    }
}
