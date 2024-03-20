package es.tarea.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseGym {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TrainingConfig.class);
		
		Personal David = context.getBean("Coach", Personal.class);
		
		Personal headCoach = context.getBean("headCoach", Personal.class);
		
		HeadCoach boss = context.getBean("headCoach", HeadCoach.class);
		
		System.out.println(David.getFreeDays());
		System.out.println(David.getWork());
		
		System.out.println(headCoach.getTraining());
		System.out.println(headCoach.getWork());
		
		System.out.println("Nombre del gym: " + boss.getGymName());
		System.out.println("Localización del gym: " + boss.getLocalization());
		
		context.close();
	}

}
