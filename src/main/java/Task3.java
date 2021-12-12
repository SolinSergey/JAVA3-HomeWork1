public class Task3 {
    public static void main(String[] args) {
        Box<Apple> box1 = new Box<>();
        Box<Orange> box2 = new Box<>();
        Box<Apple> box3 = new Box<>();
        Apple apple = new Apple();
        Orange orange = new Orange();
        for (int i=0;i<10; i++){
            box1.addFruit(apple);
        }
        for (int i=0;i<7;i++){
            box2.addFruit(orange);
        }
        for (int i=0;i<3;i++){
            box3.addFruit(apple);
        }
        System.out.println(box1.toString());
        System.out.println("Вес коробки 1: " + box1.getWeight()+"\n");
        System.out.println(box2.toString());
        System.out.println("Вес коробки 2: " + box2.getWeight()+"\n");
        System.out.println(box3.toString());
        System.out.println("Вес коробки 3: " + box3.getWeight()+"\n");
        if (box1.compareByWeight(box2)){
            System.out.println("Коробка1 и коробка2 имеют одинаковый вес");
        }else{
            System.out.println("Коробка1 и коробка2 имеют разный вес");
            }
        System.out.println();
        if (box1.compareByType(box2)){
            System.out.println("Коробки 1 и 2 одинаковые");
        }
        else{
            System.out.println("Коробки 1 и 2 разные");
            System.out.println("Переложить из коробки 2 в коробку 1 невозможно\n");
        }

        if (box1.compareByType(box3)){
            System.out.println("Коробки 1 и 3 - одинаковые");
            System.out.println("Переложили фрукты из коробки 3 в коробку 1\n");
            box3.pourTo(box1);
            System.out.println(box1.toString());
            System.out.println("Вес коробки 1: " + box1.getWeight()+"\n");
            System.out.println(box2.toString());
            System.out.println("Вес коробки 2: " + box2.getWeight()+"\n");
            System.out.println(box3.toString());
            System.out.println("Вес коробки 3: " + box3.getWeight()+"\n");
        }
        else{
            System.out.println("Коробки разные");
            System.out.println("Переложить из коробки 3 в коробку 1 невозможно");
        }
    }
}
