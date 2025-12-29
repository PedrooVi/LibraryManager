package com.projectLibrary.libraryManager.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class LivroNaoEncontradoException extends  Exception {
    public LivroNaoEncontradoException(Long id) {
        super(String.format("Livro com o ID nao encontrado", id));
    }
}
