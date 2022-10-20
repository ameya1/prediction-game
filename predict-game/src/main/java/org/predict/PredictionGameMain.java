package org.predict;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@Log4j2
@SpringBootApplication
@ComponentScan("org.predict")
public class PredictionGameMain {
    public static void main(String[] args) {
        SpringApplication.run(PredictionGameMain.class);
    }
}