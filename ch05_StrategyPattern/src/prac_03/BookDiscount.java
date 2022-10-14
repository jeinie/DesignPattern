package prac_03;

public class BookDiscount implements PricePolicy{
    @Override
    public void discount() {
        System.out.println("책 자체 할인입니다.");
    }
}
