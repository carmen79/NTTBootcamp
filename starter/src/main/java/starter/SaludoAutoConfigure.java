package starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(Saludo.class)
@EnableConfigurationProperties(SaludoProperties.class)
public class SaludoAutoConfigure {

    private final SaludoProperties properties;

    public SaludoAutoConfigure (SaludoProperties sp)
    {
        this.properties=sp;
    }

    @Bean
    public Saludo saludo()
    {
        System.out.println("Idioma "+properties.getIdioma());
        return new Saludo(properties.getIdioma());
    }


}

