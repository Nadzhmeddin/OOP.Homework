import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit>{
    

    
    private List<T> fruits;
    private double weight;

    public Box() {
        fruits = new ArrayList<>();
    }

    // узнать сколько веса в коробке.
    public double getWeight() {
        double sumWeight = 0;
        for(T fruit : fruits) {
            sumWeight += fruit.getWeight();
        }
        return sumWeight;
    }

    public void add(T fruit) {
        fruits.add(fruit);
    } 

    public void move(Box<T> box){
        for(T fruit : fruits) {
            box.add(fruit);
        }
        fruits.clear();
        weight = 0;
    }
}
