package prac02;

public class ValidTicket implements Ticket{
    private int serialNum;

    public ValidTicket(int serialNum) {
        this.serialNum = serialNum;
    }
    @Override
    public int getSerialNum() {
        return serialNum;
    }
}
