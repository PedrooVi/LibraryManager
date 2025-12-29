package com.projectLibrary.libraryManager.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// Entity ou entidade se refere as entidades do nosso projeto, ou seja tudo que sera uma tabela no banco de dados.
// As entidades se encontram no package "Entity" do nosso projeto e precisam ser mapeadas usando anotacoes JPA "@Entity"
@Entity
// Vamos utilizar tambem a biblioteca Lombok que serve para eliminar a repeticao de codigo dentro do noso projeto Java, como por exemplo os metodos getters e setters
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Autor {
    // Apos mapear nossa entidade precisamos tambem mapear nosso id para identificacao da nossa chave primaria
    @Id
    // Apos isso precisamos definir uma estrategia para geracao do nosso ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //Precisamos tambem mapear nosso atributos como colunas e definir algumas restricoes
    @Column(nullable = false, unique = true)
    private String nome;

    @Column(nullable = false)
    private int idade;

}
