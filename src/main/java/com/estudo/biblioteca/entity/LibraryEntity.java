package com.estudo.biblioteca.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
@Setter
@Getter

public class LibraryEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long id ;
    private String titulo ;
    private String autor  ;
    private boolean disponivel = true;

}
