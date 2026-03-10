package com.estudo.biblioteca.repository;

import com.estudo.biblioteca.entity.LibraryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface LibraryRepository extends JpaRepository<LibraryEntity, Long> {
}
