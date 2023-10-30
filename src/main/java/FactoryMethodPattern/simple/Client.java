package FactoryMethodPattern.simple;

public class Client {

    public static void main(String[] args) {
        // simple implement
        Creator carCreator = new CarCreator();

        Product product = carCreator.factoryMethod();
    }
}
