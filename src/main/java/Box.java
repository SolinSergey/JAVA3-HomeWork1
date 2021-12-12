import java.util.ArrayList;
public class Box<T extends Fruit>{
     private final ArrayList<T> fruits = new ArrayList<>();

        public float getWeight(){
            if (fruits.size() == 0){
                return  0.0f;
            }
            if (fruits.get(0) instanceof Apple){
                return fruits.size()*1.0f;
            }
            else if (fruits.get(0) instanceof Orange){
                return fruits.size()*1.5f;
            }
            return 0.0f;
        }

        public Box(){

        }
        public boolean compareByWeight(Box <?> b2){
            return getWeight() == b2.getWeight();
        }

        public boolean compareByType(Box <?> b2){
            return this.fruits.get(0).getClass()==b2.fruits.get(0).getClass();
        }

        public void addFruit (T fruit){
            this.fruits.add(fruit);
        }

        public void pourTo (Box b2){
            for (int i=fruits.size()-1;i>=0;i--){
                b2.addFruit(fruits.remove(i));
            }
        }

        public String toString(){
            return fruits.toString();
    }
}

