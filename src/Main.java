//Program to find min and max element in array
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of array :");
        int size = input.nextInt();

        int[] numbers = new int[size];
        System.out.println("enter the elements of array : ");
        for(int i=0;i<size;i++){
            System.out.println((i+1) + ". element of array : ");
            numbers[i]=input.nextInt();
        }

        int min = numbers[0];
        int max = numbers[0];

        for(int i=1;i<size;i++){
            if(numbers[i]< min){
                min = numbers[i];
            }
            if(numbers[i]> max){
                max = numbers[i];
            }
        }

        System.out.println("minumum element in array is : " + min);
        System.out.println("maximum element in array is : " + max);
    }
}