package co.edu.unbosque.taller3prog2;

import com.google.gson.Gson;

import java.io.*;
import java.util.Objects;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "mainPage", value = "/main-page")
public class MainPage extends HttpServlet {
    public void init() {}

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String rol = request.getParameter("rol");

        Cookie emailCookie = new Cookie("email", email);
        emailCookie.setMaxAge(60*60);
        response.addCookie(emailCookie);
        Cookie rolCookie = new Cookie("rol", rol);
        rolCookie.setMaxAge(60*60);
        response.addCookie(rolCookie);
        UserCRUD.createUser(new User(email, password, rol));

        if (Objects.equals(rol, "propietario")) response.sendRedirect(request.getContextPath()+"/propietario.html");
        else response.sendRedirect(request.getContextPath()+"/funcionario.html");

        RWJson.writeToJson(UserCRUD.readUser());
        out.println(new Gson().toJson(RWJson.readJson()));
    }

    public void destroy() {}
}