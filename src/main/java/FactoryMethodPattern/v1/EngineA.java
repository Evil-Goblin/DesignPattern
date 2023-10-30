package FactoryMethodPattern.v1;

public class EngineA implements Engine {
    @Override
    public void sayProductName() {
        System.out.println("Engine: EngineA");
    }
}
