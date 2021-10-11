package co.edu.unbosque.taller3prog2;

import com.opencsv.bean.CsvBindByName;

public class User {
    @CsvBindByName
    private String email;
    @CsvBindByName
    private String password;
    @CsvBindByName
    private String rol;

    public User(String email, String password, String rol) {
        this.email = email;
        this.password = password;
        this.rol = rol;
    }

}
