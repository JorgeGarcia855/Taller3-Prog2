package co.edu.unbosque.taller3prog2;



public final class User {
    private final String email;
    private final String password;
    private final String rol;

    public User(String email, String password, String rol) {
        this.email = email;
        this.password = password;
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", rol='" + rol + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRol() {
        return rol;
    }
}
