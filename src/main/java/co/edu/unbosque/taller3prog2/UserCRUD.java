package co.edu.unbosque.taller3prog2;

import java.util.ArrayList;
import java.util.List;

public class UserCRUD {
    private static List<User> userList = new ArrayList<>();

    public static void createUser(User user) {
        userList.add(user);
    }

    public static List<User> readUser(){
        return userList;
    }
}
