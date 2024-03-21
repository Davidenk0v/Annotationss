package es.tarea.annotations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myCoach")
public class Coach implements Personal {
	

	@Qualifier("myWeightlifting")
	private Training nuevoEntreno;
	
	@Value("${coach}")
	public String name;
	
	public void setNuevoEntreno(Training nuevoEntreno) {
		this.nuevoEntreno = nuevoEntreno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String getWork() {
		return "Dar clases de crossfit";

	}


	@Override
	public String getFreeDays() {
		return "Sábados y domingos";
	}


	public String getTraining() {
		return nuevoEntreno.getworkout();
	}
	




}
