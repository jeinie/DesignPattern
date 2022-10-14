package prac05;

public class EnoughMoneyState implements State{
    private VendingMachine machine;
    public EnoughMoneyState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void button_pushed(int price) {
        machine.getMoneyBox().dispense(price);
        machine.getDrinking().dispense(); // 음료수 구입
        System.out.println("음료수가 나왔습니다.");

        if (machine.getDrinking().getStock() == 0) {
            machine.setState(machine.getSoldOutState()); // 매진 상태로 변경
        } else if (machine.getMoneyBox().getMoney() < machine.getDrinking().getPrice()) {
            // 잔액이 부족한 경우
            machine.setState(machine.getNoEnoughMoneyState());
        } else if (machine.getMoneyBox().getMoney() == 0) {
            // 잔액이 없는 경우
            machine.setState(machine.getNoMoneyState());
        }
    }

    @Override
    public void money_pushed(int money) {
        machine.getMoneyBox().insert(money);
        System.out.println(money + "원을 넣었습니다.");
        System.out.println("현재 금액은 " + machine.getMoneyBox().getMoney() + "원 입니다.");
    }

    @Override
    public void returned() {
        int tmp = machine.getMoneyBox().returnMoney();
        System.out.println(tmp + "원이 반환되었습니다.");
        machine.setState(machine.getNoMoneyState());
    }
}
