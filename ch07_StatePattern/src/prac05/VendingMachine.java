package prac05;

public class VendingMachine {
    private State noMoneyState; // 돈이 없는 상태 (아직 돈을 넣지 않은 상태)
    private State noEnoughMoneyState; // 돈이 부족한 상태
    private State enoughMoneyState; // 돈이 충분한 상태
    private State soldOutState; // 음료가 매진된 상태
    private State state; // 현재 상태

    private MoneyBox moneyBox;
    private Drinking drinking;

    public VendingMachine(int price, int stock) {
        noMoneyState = new NoMoneyState(this);
        noEnoughMoneyState = new NoEnoughMoneyState(this);
        enoughMoneyState = new EnoughMoneyState(this);
        soldOutState = new SoldOutState(this);

        moneyBox = new MoneyBox();
        drinking = new Drinking(price, stock);

        // 재고가 있고, 돈이 없는 상태가 초기 상태
        if (drinking.getStock() > 0) {
            state = noMoneyState;
        } else { // 재고가 없으면 매진 상태
            state = soldOutState;
        }
    }

    // 현재 상태 설정
    public void setState(State state) {
        this.state = state;
    }

    // 버튼을 누르면, 상태에 따라 실행한다.
    public void button_pushed() {
        int price = drinking.getPrice();
        state.button_pushed(price);
    }
    // 돈을 넣으면, 상태에 따라 실행한다.
    public void money_pushed(int money) {
        state.money_pushed(money);
    }
    // 반환하면, 상태에 따라 실행한다.
    public void returned() {
        state.returned();
    }
    public MoneyBox getMoneyBox() {
        return moneyBox;
    }
    public Drinking getDrinking() {
        return drinking;
    }

    public State getNoMoneyState() {
        return noMoneyState;
    }

    public State getNoEnoughMoneyState() {
        return noEnoughMoneyState;
    }

    public State getEnoughMoneyState() {
        return enoughMoneyState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }
}
