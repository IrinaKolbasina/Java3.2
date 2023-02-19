public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int kg = 90;
        double m = 1.78;
        double mm = m * m;
        int Bmi = service.calculate(kg, mm);
        System.out.println("Индекс массы тела = " + Bmi);
    }
}