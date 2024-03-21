package es.tarea.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.logging.Logger;
public class UseGym {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TrainingConfig.class);
		
		Logger logger = Logger.getLogger(UseGym.class.getName());
		Personal david = context.getBean("myCoach", Personal.class);


		HeadCoach headCoach = context.getBean("myHeadCoach", HeadCoach.class);


		logger.info(david.getName() + " se encarga de los "+ david.getWork() +" tiene libres los " + david.getFreeDays());
		logger.info("=========================================================================");

		logger.info(headCoach.getName()+ " se encargar de "+ headCoach.getWork() + " y a veces " + headCoach.getNewTraining() + " y no libra " + headCoach.getFreeDays());
		logger.info("=========================================================================");
		logger.info("El gym es " + headCoach.getGymName() + " y se encuentra en " + headCoach.getLocalization());


		context.close();
	}

}
