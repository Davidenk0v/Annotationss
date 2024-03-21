package es.tarea.annotations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("myEndurance")
public class Endurance implements Training {
	
	@Qualifier("myHeadCoach")
	private Personal personal;

	@Override
	public String getworkout() {
		return "Entrenamiento de cardio de larga duración";
	}

	@Override
	public String duration() {
		return "La duración es de 90 minutos";
	}

	@Override
	public String managerFOr() {
		return personal.getName();
	}

}
