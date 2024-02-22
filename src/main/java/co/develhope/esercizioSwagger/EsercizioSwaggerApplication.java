package co.develhope.esercizioSwagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "My API",
                version = "3.0",
                description = "this is my first api documentation",
                termsOfService = "Terms of Service",
                contact = @Contact(
                        name = "roccaldo",
                        email = "roccaldo@gmail.com",
                        url = "http://www.develhope.co"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.apache.org/licenses/LICENSE-2.0"
                )
        )
)

public class EsercizioSwaggerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EsercizioSwaggerApplication.class, args);
    }

}
