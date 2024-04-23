package entities;

import java.time.LocalDate;
import java.util.Date;

public class Client {

    private String name;
    private String email;
    private LocalDate birthDate;

    public Client() {
    }

    public Client(String name, String email, LocalDate birthDate){
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getEmail() {
        return email;
    }
}
