import java.util.Scanner;

public class ArrayNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int sum=0;
        double count =0;
        double average=0;

        int[] numbers = new int[10];
        for (int i=0; i < numbers.length;i++) {
            System.out.println("please input a number: ");
            //lets user to enter next int values
            numbers[i]= sc.nextInt();
            // summation
            sum = sum + numbers[i];
            count +=Double.valueOf(numbers[i]);
            average=(double) count/(double)numbers.length;


        }
        System.out.println(sum);

        System.out.println("Average is:" + average);
    }
}
