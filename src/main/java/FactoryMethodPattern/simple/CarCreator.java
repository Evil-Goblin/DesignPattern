package FactoryMethodPattern.simple;

public class CarCreator implements Creator {
    @Override
    public Product factoryMethod() {
        return new Car();
    }
}
