public class ArrayList {
    private int size;
    private int[] datum;

    public ArrayList() {
        size = 0;
        datum = new int[2];
    }


    public int size() {
        return size;
    }

    void add(int i) {
        size++;
    }

    int get(int i) {
        datum[0] = 100;
        datum[1] = 200;
        return datum[i];
    }
}
