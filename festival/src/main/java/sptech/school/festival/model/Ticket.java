package sptech.school.festival.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @ManyToOne
    private Festival festival;

    @NotNull
    @ManyToOne
    private Usuario dono;

    public long getId() {
        return id;
    }

    public Festival getFestival() {
        return festival;
    }

    public Usuario getDono() {
        return dono;
    }
}
