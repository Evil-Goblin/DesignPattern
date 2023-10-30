package FactoryMethodPattern.v1;

import java.util.ArrayList;
import java.util.List;

public class ABSpareEngineStore implements EngineStore {

    private List<EngineA> engineAList = new ArrayList<>();
    private List<EngineB> engineBList = new ArrayList<>();

    public ABSpareEngineStore(int engineACount, int engineBCount) {
        for (int i = 0; i < engineACount; i++) {
            engineAList.add(new EngineA());
        }

        for (int i = 0; i < engineBCount; i++) {
            engineBList.add(new EngineB());
        }
    }

    @Override
    public Engine getEngine() {
        if (!engineAList.isEmpty()) {
            return engineAList.remove(0);
        } else if (!engineBList.isEmpty()) {
            return engineBList.remove(0);
        } else {
            return new SpareEngine();
        }
    }
}
