package factory;

import vo.Animal;
import vo.AnimalType;
import vo.Elephant;
import vo.Shark;

public class InvertabrateFactory implements AbstractFactory {

	@Override
	public Animal getAnimal(AnimalType animal) {
		if(animal.equals(AnimalType.ANT)) {
			return new Elephant();
		} else if(animal.equals(AnimalType.BEE)) {
			return new Shark();
		} else {
			return null;
		}
	}

}
