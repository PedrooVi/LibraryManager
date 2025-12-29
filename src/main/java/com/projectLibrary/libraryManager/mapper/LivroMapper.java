package com.projectLibrary.libraryManager.mapper;

import com.projectLibrary.libraryManager.dto.LivroDTO;
import com.projectLibrary.libraryManager.entity.Livro;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


// Vamos utilizar um mapper para realizar a conversao do modelo de livro para um DTO e vice versa
@Mapper(componentModel = "spring")
public interface LivroMapper {

    Livro toModel(LivroDTO livroDTO);
    LivroDTO toDTO(Livro livro);
}
