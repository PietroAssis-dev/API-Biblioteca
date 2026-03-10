package com.estudo.biblioteca.controller;


import com.estudo.biblioteca.entity.LibraryEntity;
import com.estudo.biblioteca.services.LibraryService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")


public class LibraryController {
    private final LibraryService libraryService;

    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @PostMapping
    public LibraryEntity cadastrar(@RequestBody LibraryEntity libraryEntity){
        return libraryService.cadastrarLivros(libraryEntity);
    }


    @GetMapping
    public List<LibraryEntity> listarLivros(){
        return libraryService.ListarLivros();
    }

    @PutMapping("/{id}/retirar")
    public LibraryEntity retirar(@PathVariable Long id){
        return libraryService.retirar(id);
    }
    @PutMapping("/{id}/devolver")
    public LibraryEntity devolver(@PathVariable Long id){
        return libraryService.devolver(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id ){
        libraryService.deletar(id);

    }
}
