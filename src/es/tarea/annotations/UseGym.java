package es.tarea.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseGym {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TrainingConfig.class);
		
		Personal David = context.getBean("Coach", Personal.class);
		
		Personal Mario = context.getBean("limpieza", Personal.class);

		
		Personal headCoach = context.getBean("headCoach", Personal.class);
		
		HeadCoach boss = context.getBean("headCoach", HeadCoach.class);
		
		System.out.println("David tiene libres los " + David.getFreeDays());
		System.out.println("El trabajo de David es " + David.getWork());
		
		System.out.println("El headcoach tiene libre " + headCoach.getFreeDays());
		System.out.println("El trabajo del headcoach es " + headCoach.getWork());
		
		System.out.println("Mario descansa los " + Mario.getFreeDays());
		System.out.println("El trabajo del headcoach es " + Mario.getWork());
		
		System.out.println("Nombre del gym: " + boss.getGymName());
		System.out.println("Localización del gym: " + boss.getLocalization());
		
		context.close();
	}

}
