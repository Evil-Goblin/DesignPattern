package FactoryMethodPattern.v1;

public class DefaultWheelStore implements WheelStore {
    @Override
    public Wheel getWheel() {
        return new SpareWheel();
    }
}
