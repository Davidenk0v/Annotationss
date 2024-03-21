package es.tarea.annotations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("myGymnastic")
public class Gymnastic implements Training {
	
	@Qualifier("myCoach")
	private Personal personal;

	@Override
	public String getworkout() {
		return "Entrenamientos de gimnasia deportiva";
	}

	@Override
	public String duration() {
		return "La duración es de 45 minutos";
	}

	@Override
	public String managerFOr() {
		return personal.getName();
	}

}
