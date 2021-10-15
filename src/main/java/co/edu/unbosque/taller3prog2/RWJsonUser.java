package co.edu.unbosque.taller3prog2;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.*;
import java.util.*;

public final class RWJsonUser {
    private static final String FILE_PATH = "C:\\Users\\ACER\\git\\Taller3-Prog2\\src\\main\\resources\\json\\usuarios.json";

    public static void writeToJson(List<User> users) throws IOException {
        try (JsonWriter writer = new JsonWriter(new BufferedWriter(new FileWriter(FILE_PATH)))) {
            writer.setIndent("    ");
            writer.beginArray();
            for (User user : users) {
                writer.beginObject();
                writer.name("email").value(user.getEmail());
                writer.name("password").value(user.getPassword());
                writer.name("rol").value(user.getRol());
                writer.endObject();
            }
            writer.endArray();
        }
    }

    public static List<User> readJson() throws FileNotFoundException {
        return new Gson().fromJson(new JsonReader(new BufferedReader(new FileReader(FILE_PATH))),
                new TypeToken<List<User>>(){}.getType());
    }
}
