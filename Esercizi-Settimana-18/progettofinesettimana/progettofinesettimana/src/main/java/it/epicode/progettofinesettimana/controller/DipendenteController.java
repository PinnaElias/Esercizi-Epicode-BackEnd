package it.epicode.progettofinesettimana.controller;


import it.epicode.progettofinesettimana.DTO.DipendenteDTO;
import it.epicode.progettofinesettimana.entities.Dipendente;
import it.epicode.progettofinesettimana.services.DipendenteService;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

@RestController
@RequestMapping("/dipendenti")
public class DipendenteController {

    @Autowired
    private DipendenteService dipendenteSer;

    @GetMapping
    public Page<Dipendente> getallDipendenti(@RequestParam(defaultValue = "1") int page,
                                             @RequestParam(defaultValue = "10") int size,
                                             @RequestParam(defaultValue = "id") String orderBy) {
        return dipendenteSer.getDipendenti(page, size, orderBy);
    }

    @GetMapping("/{id}")
    public Dipendente getSingleDipendente(@PathVariable UUID id) {
        return dipendenteSer.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Dipendente dipendenteSave(@RequestBody @Validated DipendenteDTO dipendenteDTO, BindingResult validation) {
        if (validation.hasErrors()) {
            throw new it.epicode.progettofinesettimana.exceptions.BadRequestException(validation.getAllErrors());
        }
        return dipendenteSer.save(dipendenteDTO);
    }

    @PutMapping("/{id}")
    public Dipendente findAndUpdate(@PathVariable UUID id, @RequestBody @Validated Dipendente dipendente, BindingResult validation) {
        if (validation.hasErrors()) {
            throw new it.epicode.progettofinesettimana.exceptions.BadRequestException(validation.getAllErrors());
        }
        return dipendenteSer.findAndUpdate(id, dipendente);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void findAndDelete(@PathVariable UUID id) {
        this.dipendenteSer.findAndDelete(id);
    }

    @PostMapping("/{id}/avatar")
    public String uploadCover(@PathVariable UUID id, @RequestParam("avatar") MultipartFile image) throws IOException {
        return this.dipendenteSer.findAndPostAvatar(id,image);
    }

    @PostMapping("/{id}/newdisp")
    public void uploadDispositivo(@PathVariable UUID id, @RequestParam("disp") UUID dispositivoId) throws IOException {
        this.dipendenteSer.findAndPostDisp(id,dispositivoId);
    }
}
