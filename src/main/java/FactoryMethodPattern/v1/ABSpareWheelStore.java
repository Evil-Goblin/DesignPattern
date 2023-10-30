package FactoryMethodPattern.v1;

import java.util.ArrayList;
import java.util.List;

public class ABSpareWheelStore implements WheelStore {

    private List<WheelA> wheelAList = new ArrayList<>();
    private List<WheelB> wheelBList = new ArrayList<>();

    public ABSpareWheelStore(int wheelACount, int wheelBCount) {
        for (int i = 0; i < wheelACount; i++) {
            wheelAList.add(new WheelA());
        }

        for (int i = 0; i < wheelBCount; i++) {
            wheelBList.add(new WheelB());
        }
    }

    @Override
    public Wheel getWheel() {
        if (!wheelAList.isEmpty()) {
            return wheelAList.remove(0);
        } else if (!wheelBList.isEmpty()) {
            return wheelBList.remove(0);
        } else {
            return new SpareWheel();
        }
    }
}
