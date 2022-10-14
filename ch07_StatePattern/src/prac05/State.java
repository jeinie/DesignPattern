package prac05;

public interface State {
    // 버튼 누르면
    public void button_pushed(int price);
    // 돈 넣으면
    public void money_pushed(int money);
    // 거스름돈 or 현재 넣은 돈 반환하면
    public void returned();
}
