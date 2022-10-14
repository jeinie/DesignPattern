package prac02;

public class InvalidTicket implements Ticket{

    @Override
    public int getSerialNum() {
        return 0;
    }
}
