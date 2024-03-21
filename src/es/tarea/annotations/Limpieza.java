package es.tarea.annotations;

import org.springframework.stereotype.Component;

@Component
public class Limpieza implements Personal {

	@Override
	public String getWork() {
		// TODO Auto-generated method stub
		return "Limpiar el gym";
	}

	@Override
	public String getFreeDays() {
		// TODO Auto-generated method stub
		return "Sábados y domingos";
	}


}
