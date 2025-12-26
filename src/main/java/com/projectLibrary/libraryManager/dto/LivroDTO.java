package com.projectLibrary.libraryManager.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotBlank;

// Criamos a classe DTO para tratar erros na nossa aplicacao deixando as menssagens de tratamento de erros, mais amigaveis pro nosso usuario

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LivroDTO {

    private Long id;

    @NotBlank
    @Size(max = 200)
    private String nome;

    @Valid
    @NotNull
    private AutorDTO autor;
}
