public class BmiService {
    public int calculate(double height, double weight) {
        height = 1.99; // рост
        weight = 88; // вес
        int index = (int) (weight / (height * height));
        return index;
    }
}
