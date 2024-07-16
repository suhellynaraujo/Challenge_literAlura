package br.com.alura.challenge_literAlura.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ResponseDTO (
        List<LivroDTO>results
){

}
