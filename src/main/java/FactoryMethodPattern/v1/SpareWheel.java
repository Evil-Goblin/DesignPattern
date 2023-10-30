package FactoryMethodPattern.v1;

public class SpareWheel implements Wheel {
    @Override
    public void sayProductName() {
        System.out.println("Wheel: SpareWheel");
    }
}
