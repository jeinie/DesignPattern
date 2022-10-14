package prac05;

public class SoldOutState implements State{
    private VendingMachine machine;
    public SoldOutState(VendingMachine machine) {
        this.machine = machine;
    }
    @Override
    public void button_pushed(int price) {
        // 동작 X
    }

    @Override
    public void money_pushed(int money) {
        System.out.println("재고가 없습니다.");
    }

    @Override
    public void returned() {
        int tmp = machine.getMoneyBox().returnMoney();
        System.out.println(tmp + "원이 반환되었습니다.");
        machine.setState(machine.getNoMoneyState());
    }
}
