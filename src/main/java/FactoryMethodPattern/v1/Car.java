package FactoryMethodPattern.v1;

import java.util.function.Supplier;

public class Car implements Product {

    private final Wheel wheel;
    private final Engine engine;

    public Car(Supplier<Wheel> wheelSupplier, Supplier<Engine> engineSupplier) {
        this.wheel = wheelSupplier.get();
        this.engine = engineSupplier.get();
    }

    @Override
    public void sayProductName() {
        System.out.println("Car: Car");
        wheel.sayProductName();
        engine.sayProductName();
        System.out.println("=================");
    }
}
