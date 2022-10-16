package ch2_04;

public class OnSale implements DiscountedMode{

    @Override
    public double getDiscountRate() {
        return 0.1;
    }
}
