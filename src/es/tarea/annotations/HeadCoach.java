package es.tarea.annotations;

import org.springframework.beans.factory.annotation.Value;

public class HeadCoach implements Personal{
	
	
	private Training newTraining;
	
	@Value("${gymName}")
	private String gymName;
	
	@Value("${localizacion}")
	private String localization;
	
	
	public Training getNewTraining() {
		return newTraining;
	}

	public void setNewTraining(Training newTraining) {
		this.newTraining = newTraining;
	}

	public String getGymName() {
		return gymName;
	}

	public void setGymName(String gymName) {
		this.gymName = gymName;
	}

	public String getLocalization() {
		return localization;
	}

	public void setLocalization(String localization) {
		this.localization = localization;
	}

	public HeadCoach(Training newTraining) {
		this.newTraining = newTraining;
	}

	@Override
	public String getWork() {
		// TODO Auto-generated method stub
		return "Gestionar a los entrenadores y clientes";
	}

	@Override
	public String getFreeDays() {
		// TODO Auto-generated method stub
		return "Nunca";
	}
	

	public String getTraining() {
		return newTraining.getworkout();
	}

}
