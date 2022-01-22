
public class Animal {

    public Animal() {

    }

    public void animalSound() {
        System.out.println("The animal makes a sound");
    }

}

class Pig extends Animal {

    public Pig() {

    }

    @Override
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }

}

class Dog extends Animal {

    public Dog() {

    }

    @Override
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }

}