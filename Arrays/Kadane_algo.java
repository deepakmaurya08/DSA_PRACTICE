public class Kadane_algo {
    public static void main (String [] args){
        int arr[] = {2,3,5,4,9};

        int max_sum = arr[0];
        int curr = arr[0];

        for(int i = 1; i<arr.length; i++){
            curr = Math.max(curr+arr[i], arr[i]);
            max_sum = Math.max(max_sum, curr);
        }

        System.out.println("Max Subarray = "+ max_sum);
    }
    
}


//OUTPUT

// Max Subarray = 23