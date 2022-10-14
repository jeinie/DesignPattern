package prac05;

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(5, 1000);
        machine.money_pushed(1000);
        machine.money_pushed(500);
        machine.button_pushed();
        machine.returned();
        machine.money_pushed(1000);
        machine.money_pushed(1000);
        machine.button_pushed();
    }
}
