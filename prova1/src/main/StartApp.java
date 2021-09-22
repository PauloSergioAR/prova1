package main;

import java.util.Scanner;

import factory.AbstractFactory;
import factory.FactoryProvider;
import vo.Animal;
import vo.AnimalFactoryType;
import vo.AnimalType;
import vo.Ant;
import vo.Bee;
import vo.Elephant;
import vo.Shark;



public class StartApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		AbstractFactory vertabrateFactory = FactoryProvider.getFactory(AnimalFactoryType.VERTEBRADO);
		AbstractFactory invertabrateFactory = FactoryProvider.getFactory(AnimalFactoryType.INVERTEBRADO);
		
		System.out.println("***ANIMAIS***");
		System.out.println("1 - Vertebrados");
		System.out.println("2 - Invertebrados");
		System.out.println("Digite sua opção:");
		
		int option = scanner.nextInt();
		
		if (option == 1) {
			Animal elephant = vertabrateFactory.getAnimal(AnimalType.Elephant);
			elephant.eat();
			
			Animal shark = vertabrateFactory.getAnimal(AnimalType.SHARK);
			shark.eat();

		} else if (option == 2) {
			Animal bee = invertabrateFactory.getAnimal(AnimalType.BEE);
			bee.eat();
			
			Animal ant = invertabrateFactory.getAnimal(AnimalType.ANT);
			ant.eat();
		}
		
		scanner.close();
	}
}
