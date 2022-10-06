public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = 0;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public long min() {
        long min = 100;
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public long average() {
        long sum = 0;
        if (sales.length == 7) {
            for (long sale : sales) {
                sum += sale;
            }
        }
        return (sum - max() - min()) / 2;
    }

}
