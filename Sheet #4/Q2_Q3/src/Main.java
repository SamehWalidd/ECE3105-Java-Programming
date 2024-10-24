import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {}

    public static Integer max(ArrayList<Integer> list){
        Integer max = list.get(0);
        for (Integer i : list) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static void sort(ArrayList<Integer> list){
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}