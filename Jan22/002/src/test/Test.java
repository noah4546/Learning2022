package test;

public class Test {
    
    public enum Level {
        LOW,
        MEDIUM,
        HIGH,
        REALLY_HIGH,
        REALLY_LOW
    }

    private Level level = Level.LOW;

    public Test() {

    }

    public void test(boolean a) {

        if (a) {
            // do something spectacular
            return;
        }

        // do something different

        return;
    }

    public void calculate() {

        switch (level) {
            case LOW:
                System.out.println("LOW!");
                break;
            case MEDIUM:
            case HIGH:
                System.out.println("MEDIUM or HIGH!");
                break;
            default:
                System.out.println("DEFAULT");
                break;
        }

    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

}
