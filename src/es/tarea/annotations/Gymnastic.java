package es.tarea.annotations;

import org.springframework.stereotype.Component;

@Component
public class Gymnastic implements Training {

	@Override
	public String getworkout() {
		// TODO Auto-generated method stub
		return "Entrenamientos de gimnasia deportiva";
	}

}
