package it.epicode.esercizioDay86.services;

import it.epicode.esercizioDay86.exceptions.NotFoundException;
import it.epicode.esercizioDay86.models.Autore;
import it.epicode.esercizioDay86.models.Post;
import it.epicode.esercizioDay86.repositories.AutoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class AutoreService {

    @Autowired
    private AutoreRepository autoreRepo;

    public Page<Autore> getAllAutori(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return autoreRepo.findAll(pageable);
    }

    public Autore getAutoreById(UUID id){
        return autoreRepo.findById(id).orElseThrow(() ->
                new NotFoundException("Autore non trovato con id: " + id));
    }

}
