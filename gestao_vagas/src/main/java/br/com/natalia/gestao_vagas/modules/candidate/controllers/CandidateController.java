package br.com.natalia.gestao_vagas.modules.candidate.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.natalia.gestao_vagas.modules.candidate.CandidateEntity;
import br.com.natalia.gestao_vagas.modules.candidate.CandidateRepository;
import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/candidate")
public class CandidateController {
  
  @Autowired
  private CandidateRepository candidateRepository;

  @PostMapping("/")
  // as informações do candidato virão no body da requisição @requestBody
  // @valid informa ao controller que deve ser feita a validação dos dados
  public CandidateEntity create(@Valid @RequestBody CandidateEntity candidateEntity) {
    return this.candidateRepository.save(candidateEntity);
  }
}
