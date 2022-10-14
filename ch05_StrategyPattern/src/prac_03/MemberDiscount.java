package prac_03;

public class MemberDiscount implements PricePolicy{
    @Override
    public void discount() {
        System.out.println("회원 할인입니다.");
    }
}
