package subsystems;

public class Shooter extends Subsystem {
    private static Shooter instance;

    private double motorSpeed = 0.0;

    public static Shooter getInstance() {
        if (instance == null) {
            instance = new Shooter();
        }
        return instance;
    }

    private double getMotorSpeed() {
        return this.motorSpeed;
    }

    private Shooter() {
        this.firstCycle();
    }

    @Override
    public void firstCycle() {
        motorSpeed = 0.1;
    }

    @Override
    public void calculate() {
        motorSpeed = 1.0;
    }

    @Override
    public void disable() {
        motorSpeed = 0.0;
    }

}
