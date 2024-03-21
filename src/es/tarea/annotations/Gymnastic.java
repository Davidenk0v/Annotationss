package es.tarea.annotations;

import org.springframework.stereotype.Component;

@Component
public class Gymnastic implements Training {

	@Override
	public String getworkout() {
		// TODO Auto-generated method stub
		return "Entrenamientos de gimnasia deportiva";
	}

	@Override
	public String duration() {
		// TODO Auto-generated method stub
		return "La duración es de 45 minutos";
	}

}
