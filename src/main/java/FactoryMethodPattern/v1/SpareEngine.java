package FactoryMethodPattern.v1;

public class SpareEngine implements Engine {
    @Override
    public void sayProductName() {
        System.out.println("Engine: SpareEngine");
    }
}
