package br.com.natalia.gestao_vagas.modules.candidate;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
// dependencia instalada para utilizar os get e set automaticamente devido ao private dos dados do candidate
import lombok.Data;

@Data
public class CandidateEntity {
  
  private UUID id;
  private String name;

  // sem espaços no username
  @Pattern(regexp = "^(?!\\s*$).+", message = "O campo [username] não deve conter espaço")
  private String username;

  @Email(message = "O campo (email) deve conter um e-mail válido")
  private String email;

  @Length(min= 8, max = 12)
  private String password;
  private String description;
  private String curriculum;

}
