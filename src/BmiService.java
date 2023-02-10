public class BmiService {
    public int calculate(double heightInMeters, double weightInKilograms) {
        int bmiIndex = (int) (weightInKilograms / (heightInMeters * heightInMeters));
        return bmiIndex;
    }
}
