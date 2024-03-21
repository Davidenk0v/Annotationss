package es.tarea.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myHeadCoach")
public class HeadCoach implements Personal {

	@Qualifier("myGymnastic")
	private Training newTraining;

	@Autowired
	public HeadCoach(Training newTraining, String gymName, String localization, String name) {
		this.newTraining = newTraining;
		this.gymName = gymName;
		this.localization = localization;
		this.name = name;
	}
	
	public HeadCoach(Training endurance) {
		this.newTraining = endurance;
	}

	@Value("${gymName}")
	private String gymName;

	@Value("${localizacion}")
	private String localization;

	@Value("${boss}")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNewTraining() {
		return newTraining.getworkout();
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

	@Override
	public String getWork() {
		return "Gestionar a los entrenadores y clientes";
	}

	@Override
	public String getFreeDays() {

		return "Nunca";
	}

	public String getTraining() {
		return newTraining.getworkout();
	}

}
