package pe.edu.cibertec.app_client_oauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/public")
    public String publicApi() {
        return "Esta es una API pública.";
    }

    @GetMapping("/private")
    public String privateApi() {
        return "Esta es una API privada.";
    }
}
