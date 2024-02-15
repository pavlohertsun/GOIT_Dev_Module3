package utils;

public class SumCalculator {
    /**
     * Метод обчислює суму чисел від 1 до n.
     * @param n Ціле число.
     * @return Сума чисел від 1 до n.
     */
    public int sum(int n){
        if (n <= 0) {
            throw new IllegalArgumentException("Incorrect value. N must be more than 0.");
        }
        int sum = 0;
        for (int i = n; i > 0; --i) {
            sum += i;
        }
        return sum;
    }

}
