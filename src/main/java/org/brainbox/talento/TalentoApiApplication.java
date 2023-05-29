package org.brainbox.talento;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@OpenAPIDefinition
public class TalentoApiApplication
{
    public static void main(String args[])
    {
        Logger logger = LoggerFactory.getLogger(TalentoApiApplication.class);
        logger.trace("About to started TalentoApiApplication ");
        SpringApplication.run(TalentoApiApplication.class,args);
    }

   /* @Bean
    public Docket swaggerConfiguration(){
        return new Docket(DocumentationTy)
    }*/
}
