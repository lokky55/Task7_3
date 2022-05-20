package ru.netology.checkstyle;

public class StatsService {
    public int sumSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageSale(long[] sales) {
        long sum = sumSales(sales);
        return sum / 12;
    }

    public int maxSaleMonth(long[] sales) {
        int maxi = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxi])
                maxi = i;
        }
        return maxi + 1;
    }

    public int minSaleMonth(long[] sales) {
        int mini = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[mini])
                mini = i;
        }
        return mini + 1;
    }

    public int underAverage(long[] sales) {
        long sum = sumSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < sum / 12)
                count++;
        }
        return count;
    }

    public int aboveAverage(long[] sales) {
        long sum = sumSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > sum / 12)
                count++;
        }
        return count;
    }
}
