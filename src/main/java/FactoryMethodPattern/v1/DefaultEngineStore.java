package FactoryMethodPattern.v1;

public class DefaultEngineStore implements EngineStore {
    @Override
    public Engine getEngine() {
        return new SpareEngine();
    }
}
