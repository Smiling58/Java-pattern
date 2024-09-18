import java.util.Scanner;
public class K_shape {
    public static void printPattern(int N)
    {
        int i, j;
        //outer loop to handle rows
        //outer loop starts from 1 and goes until the desired number
        //increment everytime
        for(i = 0; i <N; i++){
            for(j = 1; j <= N - i; j++){
                //j also starts from zero, because there are no elements in the column initially
                //goes until N - i to print an inverted right triangle shape
                //increments after each iteration
               System.out.print(j + " ");
            }
            System.out.println();
            //newline after every iteration of i
        }
        //lower half of pattern(right triangle)
        for(i = 1; i < N; i++){
            for(j = 1; j <= i + 1; j++){
                System.out.print(j + " ");
                //j needs to increment the number of values to be printed
                //first line has one value, second had two column of values and so on
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows you want for your pattern: ");
        int N = scan.nextInt();
        System.out.println();
        printPattern(N);
    }
}
