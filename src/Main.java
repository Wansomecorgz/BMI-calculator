public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
         double Bmi = service.calculate(90, 1.9);

        System.out.println("Индекс массы тела составляет: " + Bmi);
    }
}