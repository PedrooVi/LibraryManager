package com.projectLibrary.libraryManager.controller;

import com.projectLibrary.libraryManager.dto.LivroDTO;
import com.projectLibrary.libraryManager.dto.MenssagemRespostaDTO;
import com.projectLibrary.libraryManager.entity.Livro;
import com.projectLibrary.libraryManager.exception.LivroNaoEncontradoException;
import com.projectLibrary.libraryManager.repository.LivroRepository;
import com.projectLibrary.libraryManager.service.LivroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


// Vamos adicionar a anotacao "@RestController" para indicar para o spring que essa classe ira funcionar como o controller
@RestController
// Vamos agora usar a anotacao "@RequestMapping" para indicar o endpoint onde sera feito as requisicoes.
@RequestMapping("api/v1/livros")
public class LivroController {

    private LivroService livroService;

    @Autowired
    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    // Vamos marcar esse metodo com "@PostMapping" para indicar que este e um metodo POST
    // Usamos tambem a marcacao "@RequestBody" para indicar que o objeto Livro sera passado no corpo da requisicao.
    // Vamos usar no corpo a classe DTO que criamos, para tratar erros.
    @PostMapping
    public MenssagemRespostaDTO create(@RequestBody @Valid LivroDTO livroDTO){
        // Para criar um livro, vamos utilizar o metodo que criamos na classe LivroService
       return livroService.create(livroDTO);
    }

    @GetMapping ("/{id}")
    public LivroDTO buscarPorID(@PathVariable Long id) throws LivroNaoEncontradoException {
        return  livroService.buscarPorID(id);
    }
}
