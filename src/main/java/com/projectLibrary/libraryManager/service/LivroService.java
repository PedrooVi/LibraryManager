package com.projectLibrary.libraryManager.service;

import com.projectLibrary.libraryManager.dto.LivroDTO;
import com.projectLibrary.libraryManager.dto.MenssagemRespostaDTO;
import com.projectLibrary.libraryManager.entity.Livro;
import com.projectLibrary.libraryManager.mapper.LivroMapper;
import com.projectLibrary.libraryManager.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
// Vamos utilizar a anotacao "@Service" para indicar que essa classe e um service
// A classe service e responsvel pela regra de negocio e logica de toda a minha aplicacao. Nela devem ser atribuidos os metodos de CRUD da nossa entidade, e esse metodos serao mapeados e utilizados para requisicao na classe controller
@Service
public class LivroService {
    private LivroRepository livroRepository;

    private final LivroMapper livroMapper = LivroMapper.INSTANCE;

    @Autowired
    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    // Vamos agora criar uma classe para retornar as nossas respostas das requisicoes.
    // Criamos uma clase DTO para controlar a menssagem da nossa requisicao. Usamos o lombak com a anotacao "@Build" para criacao da classe
    public MenssagemRespostaDTO create( LivroDTO livroDTO){
        Livro livroParaSalvar = livroMapper.toModel(livroDTO);

        Livro livroSalvo = livroRepository.save(livroParaSalvar);
        return MenssagemRespostaDTO.builder()
                .menssagem("livro criado com o ID: " + livroSalvo.getId())
                .build();
    }
}
