package prac;

public abstract class Robot {
    private String name;
    private MovingStrategy movingStrategy;
    private AttackStrategy attckStrategy;

    public Robot(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void move() {
        movingStrategy.move();
    }
    public void attack() {
        attckStrategy.attack();
    }
    public void setMovingStrategy(MovingStrategy movingStrategy) {
        this.movingStrategy = movingStrategy;
    }
    public void setAttackStrategy(AttackStrategy attckStrategy) {
        this.attckStrategy = attckStrategy;
    }
}
