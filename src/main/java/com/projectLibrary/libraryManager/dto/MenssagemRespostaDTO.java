package com.projectLibrary.libraryManager.dto;

import lombok.Builder;
import lombok.Data;


//Criamos ess classe para retornar as menssagens do nosso metodo
// Vamos utilizar o Lombok para a implementacao da classe
@Data
@Builder
public class MenssagemRespostaDTO {
    private String menssagem;
}
