package Interface;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Running> runningList = new ArrayList<>();
        runningList.add(new Students());
        runningList.add(new Animal());
        for (int i=0; i<runningList.size(); i++)
            runningList.get(i).running();
    }
}
