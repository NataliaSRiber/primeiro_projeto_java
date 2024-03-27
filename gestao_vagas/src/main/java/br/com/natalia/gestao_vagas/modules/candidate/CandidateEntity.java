package br.com.natalia.gestao_vagas.modules.candidate;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
// dependencia instalada para utilizar os get e set automaticamente devido ao private dos dados do candidate
import lombok.Data;

@Data
// para a criação da tabela candidate( h]jpa subentendem-se que cada uma destas informações será uma coluna no db)
@Entity(name = "candidate")
public class CandidateEntity {
  
  @Id
  @GeneratedValue(strategy = GenerationType. UUID)
  private UUID id;
  private String name;

  // sem espaços no username
  @Pattern(regexp = "^\\S+", message = "O campo [username] não deve conter espaço")
  private String username;

  @Email(message = "O campo (email) deve conter um e-mail válido")
  private String email;

  @Length(min= 8, max = 12, message = "O campo senha deve conter de (8) a (12) caracteres")
  private String password;
  private String description;
  private String curriculum;

  // coluna de createdAt
  @CreationTimestamp
  private LocalDateTime createdAt;
}
