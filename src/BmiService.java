public class BmiService {
    public double calculate(double mass, double height) {

        double Bmi = mass / (height * height);
        return Bmi;
    }
}
