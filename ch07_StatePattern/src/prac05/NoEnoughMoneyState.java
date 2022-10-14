package prac05;

public class NoEnoughMoneyState implements State{
    private VendingMachine machine;
    public NoEnoughMoneyState(VendingMachine machine) {
        this.machine = machine;
    }

    // 동전이 충분하지 않은 경우
    @Override
    public void button_pushed(int price) {
        // 에러 메시지 출력
        System.out.println("동전이 부족합니다.");
    }

    @Override
    public void money_pushed(int money) {
        machine.getMoneyBox().insert(money);
        System.out.println(money + "원을 넣었습니다.");

        // 음료를 살 정도로 충분한 돈을 넣은 경우
        if (machine.getMoneyBox().getMoney() >= machine.getDrinking().getPrice()) {
            machine.setState(machine.getEnoughMoneyState());
        }
        // 아니면 기존 상태 그대로
    }

    @Override
    public void returned() {
        int tmp = machine.getMoneyBox().returnMoney();
        System.out.println(tmp + "원이 반환되었습니다.");
        machine.setState(machine.getNoMoneyState());
    }
}
