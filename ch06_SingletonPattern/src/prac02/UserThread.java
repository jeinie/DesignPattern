package prac02;

public class UserThread extends Thread{
    private Ticket myTicket;

    public UserThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        TicketMachine ticketMachine = TicketMachine.getTicketMachine();
        myTicket = ticketMachine.getTicket(); // 티켓 구입
    }

    public Ticket getMyTicket() {
        return myTicket;
    }
}
