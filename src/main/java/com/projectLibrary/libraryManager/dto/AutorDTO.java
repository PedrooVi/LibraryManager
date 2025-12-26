package com.projectLibrary.libraryManager.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// Criamos a classe DTO para tratar erros na nossa aplicacao deixando as menssagens de tratamento de erros, mais amigaveis pro nosso usuario
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AutorDTO {
    private Long id;
    // Usamos a anotacao "@NotBlank" para informar que esse campo nao pode ser vazio
    @NotBlank
    // Usamos a anotacao "@Size(max =200)" para indicar que o tamanho maximo do nome deve ser de 200 caracteres
    @Size(max =200)
    private String nome;

    @NotNull
    @Min(0)
    @Max(100)
    private Integer idade;
}
