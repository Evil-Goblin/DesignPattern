package FactoryMethodPattern.v1;


public class Client {

    public static void main(String[] args) {

        CarCreator carCreator = new CarCreator();

        WheelStore wheelStore = new ABSpareWheelStore(1, 2);
        EngineStore engineStore = new ABSpareEngineStore(3, 5);

        carCreator.setWheelStore(wheelStore);
        carCreator.setEngineStore(engineStore);

        /**
         * Car: Car
         * Wheel: WheelA
         * Engine: EngineA
         * =================
         * Car: Car
         * Wheel: WheelB
         * Engine: EngineA
         * =================
         * Car: Car
         * Wheel: WheelB
         * Engine: EngineA
         * =================
         * Car: Car
         * Wheel: SpareWheel
         * Engine: EngineB
         * =================
         * Car: Car
         * Wheel: SpareWheel
         * Engine: EngineB
         * =================
         * Car: Car
         * Wheel: SpareWheel
         * Engine: EngineB
         * =================
         * Car: Car
         * Wheel: SpareWheel
         * Engine: EngineB
         * =================
         * Car: Car
         * Wheel: SpareWheel
         * Engine: EngineB
         * =================
         * Car: Car
         * Wheel: SpareWheel
         * Engine: SpareEngine
         * =================
         */
        Product product = carCreator.factoryMethod();
        product.sayProductName();

        product = carCreator.factoryMethod();
        product.sayProductName();

        product = carCreator.factoryMethod();
        product.sayProductName();

        product = carCreator.factoryMethod();
        product.sayProductName();

        product = carCreator.factoryMethod();
        product.sayProductName();

        product = carCreator.factoryMethod();
        product.sayProductName();

        product = carCreator.factoryMethod();
        product.sayProductName();

        product = carCreator.factoryMethod();
        product.sayProductName();

        product = carCreator.factoryMethod();
        product.sayProductName();
    }
}
