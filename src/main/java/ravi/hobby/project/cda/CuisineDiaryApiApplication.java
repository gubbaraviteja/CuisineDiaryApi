package ravi.hobby.project.cda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"ravi.hobby.project.cda"})
public class CuisineDiaryApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CuisineDiaryApiApplication.class, args);
    }
}

