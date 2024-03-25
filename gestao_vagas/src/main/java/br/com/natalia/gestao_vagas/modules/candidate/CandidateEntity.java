package br.com.natalia.gestao_vagas.modules.candidate;

import java.util.UUID;

// dependencia instalada para utilizar os get e set automaticamente devido ao private dos dados do candidate
import lombok.Data;

@Data
public class CandidateEntity {
  
  private UUID id;
  private String name;
  private String username;
  private String email;
  private String password;
  private String description;
  private String curriculum;

}
