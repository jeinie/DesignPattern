public class NewStrategy implements PayCalculationStrategy {
    @Override
    public int getPay(int workHours, int overtimeHours) {
        return 10*workHours + 20*overtimeHours;
    }
}
