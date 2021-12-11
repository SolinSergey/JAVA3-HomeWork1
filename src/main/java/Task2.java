import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        Integer[] mass = new Integer[] {1,3,4,5,6,7,8,9,0,0,0,65,6,6,6};
        System.out.println(massivToArrayList(mass));

    }

    public static <T> ArrayList<T> massivToArrayList(T[] massiv){
        ArrayList<T> list = new ArrayList<>(massiv.length);
        int i=0;
        for (T t:massiv) {
            list.add(massiv[i]);
            i++;
        }
        return list;
    }
}
