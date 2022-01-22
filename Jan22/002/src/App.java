import java.util.ArrayList;

import interfaces.IAnimal;
import test.Test;
import test.Test.Level;

public class App {
    public static void main(String[] args) throws Exception {
        
        /*
        Animal animal = new Animal();
        animal.animalSound();

        Pig pig = new Pig();
        pig.animalSound();

        Dog dog = new Dog();
        dog.animalSound();
        */
        /*
        float result = Util.addTwoNumbers(10.0f, 20.0f);
        System.out.println(result);
        */

        /*
        ArrayList<Integer> intArrayList = new ArrayList<>();
        intArrayList.add(10);
        intArrayList.add(20);
        intArrayList.add(30);

        System.out.println(intArrayList);
        */
        /*
        Test test = new Test();
        test.setLevel(Level.LOW);
        System.out.println(test.getLevel());
        test.calculate();
        */

        for (int i = 0; i < 10; i++) {
            
            if (i == 4) continue;

            if (i == 8) break;
            
            System.out.println(i);
        }
    }
}
