public class HyundaiMotor extends Motor {
    private Door door;
    private MotorStatus motorStatus;
    public HyundaiMotor(Door door) {
        this.door = door;
        motorStatus = MotorStatus.STOPPED;
    }

    public void moveHyndaiMotor(Direction direction) {

    }

    public MotorStatus getMotorStatus() { return motorStatus; }
    private void setMotorStatus(MotorStatus motorStatus) { this.motorStatus = motorStatus; }
    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();
        if (motorStatus == MotorStatus.MOVING) return;

        DoorStatus doorStatus = door.getDoorStatus();
        if (doorStatus == DoorStatus.OPENED) door.close();

        moveHyndaiMotor(direction);
        setMotorStatus(MotorStatus.MOVING);
    }
}
