package com.estudo.biblioteca.services;


import com.estudo.biblioteca.entity.LibraryEntity;
import com.estudo.biblioteca.repository.LibraryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService {

    private final LibraryRepository libraryRepository;

    public LibraryService(LibraryRepository libraryRepository){
        this.libraryRepository = libraryRepository;
    }
    public LibraryEntity cadastrarLivros(LibraryEntity livro){
        return libraryRepository.save(livro);
    }

    public List<LibraryEntity> ListarLivros(){
        return libraryRepository.findAll();
    }

    public void deletar(Long id ){
        libraryRepository.deleteById(id);
    }

    public LibraryEntity retirar(Long idLivro){
        LibraryEntity livro = libraryRepository.findById(idLivro)
                .orElseThrow(() -> new RuntimeException("Livro não encontrado"));
                if (!livro.isDisponivel()){
                    throw new RuntimeException("Livro ja emprestado");
                }
                livro.setDisponivel(false);
                return libraryRepository.save(livro);
    }
    public LibraryEntity devolver(Long idLivro){
        LibraryEntity livro = libraryRepository.findById(idLivro)
                .orElseThrow(() -> new RuntimeException("livro não encontrado"));
        livro.setDisponivel(true);
        return libraryRepository.save(livro);

    }
}
