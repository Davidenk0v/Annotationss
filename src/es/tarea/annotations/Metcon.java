package es.tarea.annotations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("myMetcon")
public class Metcon implements Training {

	@Qualifier("myCoach")
	private Personal personal;

	@Override
	public String getworkout() {
		return "Entrenamientos de alta intensidad";
	}

	@Override
	public String duration() {
		return "La duración es de 50 minutos";
	}

	@Override
	public String managerFOr() {
		return personal.getName();
	}

}
