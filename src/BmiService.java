public class BmiService {
    public int calculate(double heightM, int weightKg) {
        heightM = 1.87; // рост
        weightKg = 98; // вес
        int index = (int) (weightKg / (heightM * heightM));
        return index;
    }
}
