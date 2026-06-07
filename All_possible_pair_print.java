import java.util.Scanner;

public class All_possible_pair_print {
    public static void main(String [] args){
        // 2,3,5,4,9 
        int arr[] = {2,3,5,4,9};

        int max_sum = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                int sum = 0;
                System.out.print("( ");
                for(int k = i; k<=j; k++){
                    System.out.print(arr[k] + " ");
                    sum = sum+arr[k];
                }


                if(sum > max_sum){
                    max_sum = sum;
                }
                System.out.print(")=" + sum +  ",  ");

            }
            System.out.println();
        }
        System.out.println("Max_ Sum = " + max_sum);
    }
    
}


//OUTPUT

// ( 2 )=2,  ( 2 3 )=5,  ( 2 3 5 )=10,  ( 2 3 5 4 )=14,  ( 2 3 5 4 9 )=23,  
// ( 3 )=3,  ( 3 5 )=8,  ( 3 5 4 )=12,  ( 3 5 4 9 )=21,  
// ( 5 )=5,  ( 5 4 )=9,  ( 5 4 9 )=18,  
// ( 4 )=4,  ( 4 9 )=13,  
// ( 9 )=9,  
// Max_ Sum = 23
