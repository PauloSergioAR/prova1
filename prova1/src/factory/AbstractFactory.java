package factory;

import vo.Animal;
import vo.AnimalType;

public interface AbstractFactory {
	Animal getAnimal(AnimalType animalType);
}
