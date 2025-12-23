package com.projectLibrary.libraryManager.controller;

import com.projectLibrary.libraryManager.dto.MenssagemRespostaDTO;
import com.projectLibrary.libraryManager.entity.Livro;
import com.projectLibrary.libraryManager.repository.LivroRepository;
import com.projectLibrary.libraryManager.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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
    @PostMapping
    public MenssagemRespostaDTO create(@RequestBody Livro livro){
        // Para criar um livro, vamos utilizar o metodo que criamos na classe LivroService
       return livroService.create(livro);
    }
}
