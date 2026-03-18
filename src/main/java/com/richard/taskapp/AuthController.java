package com.richard.taskapp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthController {
    @Autowired private JwtUtil jwtUtil;

    @PostMapping("/login")
    public Map<String, String> login(@RequestParam String username, @RequestParam String password) {
        Map<String, String> tokens = new HashMap<>();
        if ("richard".equals(username) && "1234".equals(password)) {
            tokens.put("accessToken", jwtUtil.generateToken(username));
            tokens.put("refreshToken", jwtUtil.generateRefreshToken(username));
            return tokens;
        }
        tokens.put("error", "Credenciales incorrectas");
        return tokens;
    }

    @PostMapping("/refresh")
    public Map<String, String> refresh(@RequestParam String refreshToken) {
        Map<String, String> tokens = new HashMap<>();
        if (jwtUtil.validateToken(refreshToken)) {
            String username = jwtUtil.extractUsername(refreshToken);
            tokens.put("accessToken", jwtUtil.generateToken(username));
            return tokens;
        }
        tokens.put("error", "Refresh token invalido o expirado");
        return tokens;
    }
}