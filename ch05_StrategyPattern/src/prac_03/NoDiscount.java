package prac_03;

public class NoDiscount implements PricePolicy{
    @Override
    public void discount() {
        System.out.println("할인이 불가합니다.");
    }
}
