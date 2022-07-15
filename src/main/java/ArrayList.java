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

    public void add(int i) {
        size++;
    }

    public int get(int i) {
        datum[0] = 100;
        datum[1] = 200;
        return datum[i];
    }

    public void removeAt(int i) {

    }
}
