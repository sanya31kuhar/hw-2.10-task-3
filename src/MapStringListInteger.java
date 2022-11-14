import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapStringListInteger {

    private final Map<String, List<Integer>> listMap = new HashMap<>(5);

    public MapStringListInteger() {
        for (int i = 0; i < 5; i++) {
            listMap.put("Строка " + i, List.of((int) (Math.random() * 1001), (int) (Math.random() * 1001),
                    (int) (Math.random() * 1001)));
        }
    }

    public Map<String, List<Integer>> getListMap() {
        return listMap;
    }

    public static void printMap(Map map) {
        for (Object o : map.entrySet()) {
            System.out.println(o);
        }
    }

    public Map<String, Integer> getTransformMap() {
        HashMap temp = new HashMap<String, Integer>();
        for (Map.Entry<String, List<Integer>> entry : listMap.entrySet()) {
            temp.put(entry.getKey(), entry.getValue().get(0) + entry.getValue().get(1) + entry.getValue().get(2));
        }
        return temp;
    }
}
