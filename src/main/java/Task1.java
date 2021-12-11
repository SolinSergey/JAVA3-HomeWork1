import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String[] massiv1 = new String[]{"Петя", "Маша", "Даша"};
        System.out.println("Исходный массив: " + Arrays.toString(massiv1));
        correctionMassiv(massiv1,1,2);
        System.out.println("Массив после коррекции: " + Arrays.toString(massiv1));
        System.out.println();
        Integer[] massiv2 = new Integer[]{1,2,3,4,5};
        System.out.println("Исходный массив: " + Arrays.toString(massiv2));
        correctionMassiv(massiv2,0,2);
        System.out.println("Массив после коррекции: " + Arrays.toString(massiv2));

    }
    public static <T> void correctionMassiv(T[] massiv, int pos1, int pos2){
        if (pos1<0 || pos1>= massiv.length || pos2<0 || pos2>= massiv.length){
            System.out.println("Ошибка параметров!!! Некорректно указаны позиции для замены");
        }
        else{
            T tempElement = massiv[pos1];
            massiv[pos1]=massiv[pos2];
            massiv[pos2]=tempElement;
        }
    }

}
