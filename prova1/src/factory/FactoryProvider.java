package factory;

import vo.AnimalFactoryType;

public class FactoryProvider {
	public static AbstractFactory getFactory(AnimalFactoryType factoryType) {
		if(factoryType == AnimalFactoryType.INVERTEBRADO) {
			return new InvertabrateFactory();
		} else if (factoryType == AnimalFactoryType.VERTEBRADO) {
			return new VertabrateFactory();
		} else {
			return null;
		}
	}
}
