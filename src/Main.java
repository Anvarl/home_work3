public class Main {
    public static void main(String[] args) {
        double sum = 0;
        int count = 0;
        double[] numbers = {5.4, -8.2, 20.5, -9.5, -7.3, 6.4, -48.5, 67.5, -43.3, 56.8, 86.6, -78.12, 98.4, -85.4, 37.5,};
        boolean negativeFound = false;
        for (double number : numbers) {
            if (negativeFound && number > 0) {
                sum += number;
                count++;
            }
            if (number < 0) {
                negativeFound = true;
            }
        }
        double average = sum / count;
        System.out.println("Среднее арифметическое положительных чисел после первого отрицательного " +average);
    }
}