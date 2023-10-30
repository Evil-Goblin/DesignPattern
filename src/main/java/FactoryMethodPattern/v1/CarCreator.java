package FactoryMethodPattern.v1;

public class CarCreator implements Creator {

    private WheelStore wheelStore = new DefaultWheelStore();
    private EngineStore engineStore = new DefaultEngineStore();

    public void setWheelStore(WheelStore wheelStore) {
        this.wheelStore = wheelStore;
    }

    public void setEngineStore(EngineStore engineStore) {
        this.engineStore = engineStore;
    }

    @Override
    public Product factoryMethod() {
        return new Car(wheelStore::getWheel, engineStore::getEngine);
    }
}
