package hello;

/**
 * Created by Dinesh Pandey on 2/8/2015.
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan
@EnableAutoConfiguration
public class Application {

    @RequestMapping("/")
    public String hello() {
        return "Hello World";
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

