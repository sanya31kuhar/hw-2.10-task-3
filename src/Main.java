public class Main {

    public static void main(String[] args) {

        MapStringListInteger msli = new MapStringListInteger();
        MapStringListInteger.printMap(msli.getListMap());
        msli.getTransformMap();
        MapStringListInteger.printMap(msli.getTransformMap());
    }
}
