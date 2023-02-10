public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightInMeters = 1.87;
        double weightInKilograms = 98;
        int bmi = service.calculate(heightInMeters, weightInKilograms);
        System.out.println(bmi);
    }
}