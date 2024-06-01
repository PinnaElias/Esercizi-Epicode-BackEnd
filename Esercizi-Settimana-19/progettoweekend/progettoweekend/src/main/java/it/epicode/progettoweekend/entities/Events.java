package it.epicode.progettoweekend.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.apache.catalina.User;

import java.util.List;
import java.util.UUID;

@Data
@Entity
public class Events {

    @Id
    @GeneratedValue
    private UUID id;
    private String title;
    private String description;
    private String date;
    private String place;
    private int maxPosti;

    @ManyToMany
    @JoinTable(
            name = "user_events",
            joinColumns = @JoinColumn(name = "events_id")
    )
    private List<User> users;
}
