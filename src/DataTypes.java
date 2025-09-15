public class DataTypes {
    public static long sum(int[] numbers) {
        long s = 0L;
        for (int x : numbers) {
            s += x;
        }
        return s;
    }
}
