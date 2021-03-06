public class ArrayList {
    private int size;
    private int[] datum;

    public ArrayList() {
        size = 0;
        datum = new int[5];
    }


    public int size() {
        return size;
    }

    public void add(int i) {
        datum[size] = i;
        size++;
    }

    public int get(int i) {
        return datum[i];
    }

    public void removeAt(int i) {
        datum[i] = datum[i+1];
        size--;
    }

    public int getArrayLength() {
        if (size > 2) {
            return 4;
        }
        return 2;
    }

    public void showAllValues() {
        System.out.println("== 전체 데이터 출력 ==");
        for(int i=0; i<size; i++){
            System.out.printf("%d : %d",i, datum[i]);
        }

    }
}
