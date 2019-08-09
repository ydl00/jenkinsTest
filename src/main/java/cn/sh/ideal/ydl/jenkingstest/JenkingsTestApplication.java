package cn.sh.ideal.ydl.jenkingstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkingsTestApplication {

public static void main(String[] args) {
    SpringApplication.run(JenkingsTestApplication.class, args);
}

@GetMapping("/")
public String a() {


    return "success";

}

}
