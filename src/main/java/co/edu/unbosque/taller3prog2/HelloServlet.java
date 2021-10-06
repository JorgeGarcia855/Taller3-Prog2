package co.edu.unbosque.taller3prog2;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello !";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String correo = request.getParameter("email");
        String contra = request.getParameter("password");
        String rol = request.getParameter("rol");

        Cookie correoCookie = new Cookie("email", correo);
        correoCookie.setMaxAge(60*60);
        response.addCookie(correoCookie);
        Cookie rolCookie = new Cookie("rol", rol);
        rolCookie.setMaxAge(60*60);
        response.addCookie(rolCookie);

        out.println("email: " + correo + " | password: " + contra + " | rol: " + rol);
    }

    public void destroy() {
    }
}