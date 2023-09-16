import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double [] arrayNumbers = {3.25, -0.5, 6.75, -111.0, 7.25, -142.5, 3.75, -90.4, 12.25, -89.5, 5.75, -23.2, 98.25, -34.5, 55.75};
        boolean foundNegative = false;
        double sum = 0;
        int count = 0;
        for (double arrayNumber: arrayNumbers){
            if (foundNegative && arrayNumber > 0){
                sum += arrayNumber;
                count ++;
            } else if (arrayNumber < 0) {
                foundNegative = true;
            }
        }
        double avarage = count > 0 ? sum / count : 0;
        System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + avarage);


        int b = arrayNumbers.length;
        for (int i = 0; i <b -1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < b ; j++) {
                if(arrayNumbers[j] < arrayNumbers[minIndex]){
                    minIndex = j;
                }
            }
            double temp = arrayNumbers[minIndex];
            arrayNumbers[minIndex] = arrayNumbers[i];
            arrayNumbers[i] = temp;
            System.out.println("Отсортированный массив:");
            System.out.println(Arrays.toString(arrayNumbers));
        }


    }
    public static void printArray(double[] arr){
        for (double value: arr){
            System.out.println(value + " ");
        }
        System.out.println();
    }
}