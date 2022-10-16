package ch2_04;

public class NonDiscounted implements DiscountedMode{

    @Override
    public double getDiscountRate() {
        return 0;
    }
}
