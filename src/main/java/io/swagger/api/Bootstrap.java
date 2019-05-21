package io.swagger.api;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@OpenAPIDefinition(
    info = @Info(
        title = "Swagger Server", 
        version = "1.0", 
        description = "Esta API provee los servicios necesarios para gestionar proyectos de investigacion.",
        termsOfService = "http://spilab.es/",
        contact = @Contact(email = "dgarciajyz@alumnos.unex.es"),
        license = @License(
            name = "",
            url = "http://unlicense.org"
        )
    )
)
public class Bootstrap {
}
