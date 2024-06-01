package it.epicode.progettoweekend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import it.epicode.progettoweekend.enums.UserCategory;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String surname;
    private String email;
    private String password;

    @ManyToMany(mappedBy = "users")
    @JsonIgnore
    private List<Events> events;

    @Enumerated(EnumType.STRING)
    private UserCategory userCategory;

    public void addEvent(Events event){
        this.events.add(event);
    }


    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(this.userCategory.name()));
    }


    public String getUsername() {
        return this.email;
    }


    public boolean isAccountNonExpired() {
        return true;
    }


    public boolean isAccountNonLocked() {
        return true;
    }


    public boolean isCredentialsNonExpired() {
        return true;
    }


    public boolean isEnabled() {
        return true;
    }
}
