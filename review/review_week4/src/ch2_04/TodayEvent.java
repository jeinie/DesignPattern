package ch2_04;

public class TodayEvent implements DiscountedMode{

    @Override
    public double getDiscountRate() {
        return 0.3;
    }
}
