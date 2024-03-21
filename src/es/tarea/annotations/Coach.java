package es.tarea.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Coach")
public class Coach implements Personal {
	
	@Autowired
	@Qualifier("weightlifting")
	private Training nuevoEntreno;
	

	@Override
	public String getWork() {
		// TODO Auto-generated method stub
		return "Dar clases de crossfit";

	}


	@Override
	public String getFreeDays() {
		// TODO Auto-generated method stub
		return "Sábados y domingos";
	}


	public String getTraining() {
		// TODO Auto-generated method stub
		return nuevoEntreno.getworkout();
	}
	




}
