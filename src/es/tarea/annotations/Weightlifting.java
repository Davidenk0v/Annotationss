package es.tarea.annotations;

import org.springframework.stereotype.Component;

@Component
public class Weightlifting implements Training {

	@Override
	public String getworkout() {
		// TODO Auto-generated method stub
		return "Entrenamiento de fuerza";
	}

}
