package com.kevin.request;

import lombok.Getter;

import java.util.UUID;

@Getter
public class AlunoRequest {

    private String name;

    private UUID registrationNumber;
}