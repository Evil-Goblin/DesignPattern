package FactoryMethodPattern.v1;

public class EngineB implements Engine {
    @Override
    public void sayProductName() {
        System.out.println("Engine: EngineB");
    }
}
