public class BmiService {
    public int calculate(int kg, double mm){

        double result = kg / mm;
        return (int) result;
    }
}
