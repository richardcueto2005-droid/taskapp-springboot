package com.richard.taskapp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired private JwtUtil jwtUtil;

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        // Credenciales fijas para terminar el trabajo rápido
        if ("richard".equals(username) && "1234".equals(password)) {
            return jwtUtil.generateToken(username);
        }
        return "Error: Credenciales incorrectas";
    }
}