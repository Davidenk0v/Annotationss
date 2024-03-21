package es.tarea.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("es.tarea.annotations")
@PropertySource("classpath:gymData.property")
public class TrainingConfig {

	// Definir el bean para el Entrenamiento
	@Bean
	public Training myEndurance() {
		return new Endurance();
	}

	// Definir el bean para el headCoach
	@Bean
	public Personal myHeadCoach() {
		return new HeadCoach(myEndurance());
	}
}
