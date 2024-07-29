public class RewardValue {
    private final double cashValue;
    public static final double M2C_Conversion_Rate = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / M2C_Conversion_Rate);
    }

    private static double convertToCash(int milesValue) {
        return milesValue * M2C_Conversion_Rate;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }
}
