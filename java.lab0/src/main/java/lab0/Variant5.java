package lab0;

public class Variant5 {

    // Array5: Перші N чисел Фібоначчі
    public static int[] fibonacciSequence(int N) {
        int[] fibonacci = new int[N];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < N; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }

    // Boolean5: Перевірка нерівностей для чисел A та B
    public static boolean checkInequalities(int A, int B) {
        return (A >= 0) || (B < -2);
    }

    // Case5: Арифметичні дії над числами
    public static double performOperation(int operation, double A, double B) {
        switch (operation) {
            case 1: return A + B;
            case 2: return A - B;
            case 3: return A * B;
            case 4: return A / B;
            default: throw new IllegalArgumentException("Невірний номер операції");
        }
    }

    // For5: Вартість 0.1, 0.2, ..., 1 кг цукерок
    public static double[] candyCost(double pricePerKg) {
        double[] costs = new double[10];
        for (int i = 1; i <= 10; i++) {
            costs[i - 1] = pricePerKg * (i / 10.0);
        }
        return costs;
    }

    // If5: Кількість позитивних і негативних чисел
    public static int[] countPositivesAndNegatives(int a, int b, int c) {
        int positives = 0, negatives = 0;
        int[] numbers = {a, b, c};
        for (int number : numbers) {
            if (number > 0) positives++;
            if (number < 0) negatives++;
        }
        return new int[]{positives, negatives};
    }

    // Integer5: Довжина незайнятої частини відрізка A довжиною B
    public static int unusedSegmentLength(int A, int B) {
        return A % B;
    }

    // Matrix5: Формування матриці з арифметичною прогресією в рядках
    public static int[][] createArithmeticProgressionMatrix(int M, int N, int D, int[] firstColumn) {
        int[][] matrix = new int[M][N];
        for (int i = 0; i < M; i++) {
            matrix[i][0] = firstColumn[i];
            for (int j = 1; j < N; j++) {
                matrix[i][j] = matrix[i][j - 1] + D;
            }
        }
        return matrix;
    }

    // While5: Знаходження показника ступеня числа 2 для N
    public static int findPowerOfTwoExponent(int N) {
        int K = 0;
        while (N > 1) {
            N /= 2;
            K++;
        }
        return K;
    }
}
