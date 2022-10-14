package prac05;

public class NoMoneyState implements State{
    private VendingMachine machine;

    public NoMoneyState(VendingMachine machine) {
        this.machine = machine;
    }
    // 돈을 넣지 않은 상태에서
    @Override
    public void button_pushed(int price) { // 버튼을 누르면
        // 에러 메시지 출력
        System.out.println("동전을 넣어주세요");
    }

    @Override
    public void money_pushed(int money) { // 돈을 넣으면
        machine.getMoneyBox().insert(money); // 돈을 넣고
        System.out.println(money + "원을 넣었습니다");

        // 음료를 사기에 충분한 돈을 투입한 경우
        if (money >= machine.getDrinking().getPrice()) {
            machine.setState(machine.getEnoughMoneyState()); // EnoughMoneyState 로 변경
        } else {
            machine.setState(machine.getNoEnoughMoneyState());
        }
        System.out.println("현재 금액은 " + machine.getMoneyBox().getMoney());
    }

    @Override
    public void returned() {
        // 반환할 동전이 없음
        System.out.println("반환할 동전이 없습니다.");
    }
}
