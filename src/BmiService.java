public class BmiService {
    public int calculate(double height, double weight) {
        height = 1.87; // рост
        weight = 98; // вес
        int index = (int) (weight / (height * height));
        return index;
    }
}
