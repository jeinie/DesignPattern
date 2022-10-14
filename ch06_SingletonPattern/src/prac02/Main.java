package prac02;

import prac.User;

public class Main {
    private static final int THREAD_NUM = 15;

    public static void main(String[] args) {
        TicketMachine ticketMachine = TicketMachine.getTicketMachine();
        ticketMachine.setTicketLimits(5); // 발행할 수 있는 티켓 5장으로 제한
        UserThread[] user = new UserThread[THREAD_NUM]; // 15장의 티켓을 요구하는 사용자 스레드

        for (int i=0; i<THREAD_NUM; i++) {
            user[i] = new UserThread((i + 1) + "-thread");
            user[i].start();
        }

        for (int i=0; i<THREAD_NUM; i++) {
            try {
                user[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i=0; i<THREAD_NUM; i++) {
            if (user[i].getMyTicket().getSerialNum() != 0) { // 유효한 티켓이면
                System.out.println("User" + i + "-th Thread get ticket" + user[i].getMyTicket().getSerialNum());
            }
        }
    }
}
