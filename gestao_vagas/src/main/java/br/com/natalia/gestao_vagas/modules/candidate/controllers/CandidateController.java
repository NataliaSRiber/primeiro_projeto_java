package br.com.natalia.gestao_vagas.modules.candidate.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.natalia.gestao_vagas.modules.candidate.CandidateEntity;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/candidate")
public class CandidateController {
  
  @PostMapping("/")
  // as informações do candidato virão no body da requisição @requestBody
  // @valid informa ao controller que deve ser feita a validação dos dados
  public void create(@Valid @RequestBody CandidateEntity candidateEntity) {
    System.out.println("Candidato");
    System.out.println(candidateEntity.getEmail());
  }
}
