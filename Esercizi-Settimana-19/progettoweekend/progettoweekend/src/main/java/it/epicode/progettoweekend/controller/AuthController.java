package it.epicode.progettoweekend.controller;

import it.epicode.progettoweekend.DTO.LoginResponseDTO;
import it.epicode.progettoweekend.DTO.NewUserDTO;
import it.epicode.progettoweekend.DTO.UserLoginDTO;
import it.epicode.progettoweekend.entities.User;
import it.epicode.progettoweekend.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;


    @PostMapping("/login")
    public LoginResponseDTO login(@RequestBody UserLoginDTO payload) {
        return new LoginResponseDTO(authService.GenerateToken(payload));
    }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public User saveUser(@RequestBody NewUserDTO newUser) {
        return this.authService.saveUser(newUser);
    }
}
