package co.edu.unbosque.taller3prog2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.*;
import java.util.*;

public final class RWJson {
    private static final String FILE_PATH = "C:\\Users\\ACER\\git\\Taller3-Prog2\\src\\main\\resources\\json\\usuarios.json";

    public static void writeToJson(String email, String password, String rol) throws IOException {
        try (Writer writer = new FileWriter(FILE_PATH, true)) {
            Gson write = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
            write.toJson(new User(email, password, rol), writer);
        }
    }

    public static HashMap<String, String> readJson() throws FileNotFoundException {
        return new Gson().fromJson(new JsonReader(new BufferedReader(new FileReader(FILE_PATH))), HashMap.class);
    }
}
