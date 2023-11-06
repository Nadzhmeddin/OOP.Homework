public class Homework4Main {
    public static void main(String[] args) {
        
        // Необходимо создать класс Box, описывающий коробку с фруктами. В одной коробке должны быть фрукты только одного типа. 
        // У коробки должны быть методы:
        // 1. Метод добавления нового фрукта в коробку. add(Fruit)
        // 2. Метод подсчета суммарного веса коробки. getWeight()
        // 3. Метод пересыпания фруктов одной коробки в другую move(Box, box)
        // 4. Реализовать итератор на коробке, то есть должно быть доступно описать foreach, который итерируется по фруктам в коробке.

        Box<Apple> appleBox = new Box<>();
        System.out.println(appleBox.getWeight());
        
        appleBox.add(new Apple(2));
        appleBox.add(new Apple(2));
        System.out.println(appleBox.getWeight());
        // appleBox.add(new Orange(4)); // не компилируется 
        appleBox.add(new GoldenApple(4));
        System.out.println(appleBox.getWeight());

        Box<Orange> orangeBox = new Box<>();
        // orangeBox.add(new Apple(2)); // не компилируется
        orangeBox.add(new Orange(8));
        System.out.println(orangeBox.getWeight());

        // orangeBox.move(appleBox); // не компилируется, так как разные виды фруктов.
        // appleBox.move(orangeBox); // не компилируется, аналогично

        Box<GoldenApple> goldenAppleBox = new Box<>();
        goldenAppleBox.add(new GoldenApple(20));
        // goldenAppleBox.add(new Apple(20)); не компилируется

        // appleBox.move(goldenAppleBox); // не компилируется 
        
        // goldenAppleBox.move(appleBox); 
        System.out.println(goldenAppleBox.getWeight()); 
        System.out.println(appleBox.getWeight()); 



    }

    
}
