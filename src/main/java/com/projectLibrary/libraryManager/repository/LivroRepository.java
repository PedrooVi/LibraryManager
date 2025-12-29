package com.projectLibrary.libraryManager.repository;

import com.projectLibrary.libraryManager.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Book;
// Essa interface ela sera utilizada para realizar o controle dos livros no nosso projeto
// Ela ira extender da interface "JPARepository" que e uma interface com alguns metodos de Crud ja prontos.
public interface LivroRepository extends JpaRepository<Livro, Long> {

}