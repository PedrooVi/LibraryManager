package com.projectLibrary.libraryManager.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// Entity ou entidade se refere as entidades do nosso projeto, ou seja tudo que sera uma tabela no banco de dados.
// As entidades se encontram no package "Entity" do nosso projeto e precisam ser mapeadas usando anotacoes JPA "@Entity"
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nome;

    // Agora precisamos mapear o relacionamento com a tabela autor no banco de dados, e para isso usamos o mapeamento da propria entidade usando a anotacao "@ManyToOne" para dizer que este e um relacionamento muitos para um, oque indica que um livro tem apenas um autor, mas um autor pode ter varios livros
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE} )
    @JoinColumn(name = "autor_id")
    private Autor autor;
}
