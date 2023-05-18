package lesson16.lesson18;

public class App {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        int max =0;
        int result = 0;
        int min = 0;

        for (int i = 0; i <numbers.length ; i++) {
             numbers[i] = (int) (Math.random()*55);
             if (max < numbers[i]){
                 max = numbers[i];
             }else if (min > numbers[i]){
                 min = numbers[i];
             }
             result += numbers[i];

        }
        int average = result /20;
        System.out.println("Minimum:" +min);
        System.out.println("Maximum:" + max);
        System.out.println("Average" +average);
    }
}
