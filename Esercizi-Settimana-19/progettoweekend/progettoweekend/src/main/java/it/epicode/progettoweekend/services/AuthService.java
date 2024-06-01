package it.epicode.progettoweekend.services;
import it.epicode.progettoweekend.DAO.UserDAO;
import it.epicode.progettoweekend.DTO.NewUserDTO;
import it.epicode.progettoweekend.DTO.UserLoginDTO;
import it.epicode.progettoweekend.entities.User;
import it.epicode.progettoweekend.exception.BadRequestException;
import it.epicode.progettoweekend.exception.UnauthorizedException;
import it.epicode.progettoweekend.security.JWTTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserService usersService;

    @Autowired
    private PasswordEncoder bcrypt;

    @Autowired
    private UserDAO usersDAO;

    @Autowired
    private JWTTools jwtTools;

    public String GenerateToken(UserLoginDTO payload) {
        User user = usersService.findByEmail(payload.email());
        if (bcrypt.matches(payload.password(), user.getPassword())) {
            return jwtTools.createToken(user);
        } else {
            throw new UnauthorizedException("Credenziali sbagliate!");
        }
    }

    public User saveUser(NewUserDTO payload) {
        usersDAO.findByEmail(payload.email()).ifPresent(user -> {
            throw new BadRequestException("L'email " + user.getEmail() + " è stata già utilizzata.");
        });

        User newUser = new User();
        newUser.setEmail(payload.email());
        newUser.setName(payload.name());
        newUser.setSurname(payload.surname());
        newUser.setPassword(bcrypt.encode(payload.password()));

        return usersDAO.save(newUser);
    }
}
