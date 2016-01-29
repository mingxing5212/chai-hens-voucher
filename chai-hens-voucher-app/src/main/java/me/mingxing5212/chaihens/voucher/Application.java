package me.mingxing5212.chaihens.voucher;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.velocity.VelocityAutoConfiguration;

@SpringBootApplication 
@EnableAutoConfiguration(exclude = { VelocityAutoConfiguration.class })
@MapperScan("me.mingxing5212.chaihens.voucher.data")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
