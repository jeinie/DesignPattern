package prac02;

// 티켓 발행기
public class TicketMachine {
    private static TicketMachine ticketMachine;
    private int count; // 현재까지 발행된 티켓 수
    private int limits; // 발행할 수 있는 티켓 수

    public TicketMachine() {
        count = 0;
    }

    // 오직 하나의 티켓 발행기 생성
    public synchronized static TicketMachine getTicketMachine() {
        if (ticketMachine == null) {
            ticketMachine = new TicketMachine();
        }
        return ticketMachine;
    }

    public synchronized void setTicketLimits(int limits) {
        this.limits = limits;
    }

    public synchronized Ticket getTicket() {
        if (this.count < this.limits) {
            return new ValidTicket(++this.count);
        } else {
            return new InvalidTicket();
        }
    }
}
