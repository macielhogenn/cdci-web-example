package br.udesc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ResourceBundle;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping(value = "/ping", consumes = "*/*", produces = "text/plain")
    public String ping(){
        return "OK";
    }

    @RequestMapping(value = "/version", consumes = "*/*", produces = "text/plain")
    public String version(){
        ResourceBundle rb = ResourceBundle.getBundle("version");
        Object version = rb.getObject("version");
        Object buildNumber = rb.getObject("build_number");

        return String.join(" ", "Version", version.toString(), "build", buildNumber.toString());
    }

}
