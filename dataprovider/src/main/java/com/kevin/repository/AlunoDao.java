package com.kevin.repository;

import com.kevin.repository.entity.AlunoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlunoDao extends JpaRepository<AlunoEntity, Long> {

    List<AlunoEntity> findAll();
}
