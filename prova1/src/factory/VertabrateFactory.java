package factory;

import vo.Animal;
import vo.AnimalType;
import vo.Elephant;
import vo.Shark;

public class VertabrateFactory implements AbstractFactory {

	@Override
	public Animal getAnimal(AnimalType animal) {
		
		if(animal.equals(AnimalType.Elephant)) {
			return new Elephant();
		} else if(animal.equals(AnimalType.SHARK)) {
			return new Shark();
		} else {
			return null;
		}
	}

}
