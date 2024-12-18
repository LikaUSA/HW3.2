public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int index = service.calculate(1.99, 88);
        System.out.println("Индекс Массы Тела " + index);
    }
}