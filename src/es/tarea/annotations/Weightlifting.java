package es.tarea.annotations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("myWeightlifting")
public class Weightlifting implements Training {

	@Qualifier("myHeadCoach")
	private Personal personal;

	@Override
	public String getworkout() {
		return "Entrenamiento de fuerza";
	}

	@Override
	public String duration() {
		return "La duración es de 1 hora";
	}

	@Override
	public String managerFOr() {
		return personal.getName();
	}

}
