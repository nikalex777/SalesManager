public class Main {

    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[]{9, 2, 5, 17, 23, 34, 14});
        System.out.println("Максимум: " + salesManager.max());
        System.out.println("Среднее: " + salesManager.average());
    }
}
