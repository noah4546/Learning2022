package interfaces;

public interface IAnimal {
    public void animalSound();
    public void sleep();
}

class Pig implements IAnimal {

    @Override
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }

    @Override
    public void sleep() {
        System.out.println("Zzz");
    }
    
}

class Dog implements IAnimal {

    @Override
    public void animalSound() {
        System.out.println("The pig says: woof woof");
    }

    @Override
    public void sleep() {
        System.out.println("Snore");
    }



}