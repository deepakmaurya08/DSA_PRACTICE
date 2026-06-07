import java.nio.channels.Pipe.SourceChannel;

public class Trapping_rain_water {
    public static void main (String[]args){

        //arr = {4,2,0,6,3,2,5}

        int arr[] = {4,2,0,6,3,2,5};

        //left helping array
        int [] arr_left = new int[arr.length];
        arr_left[0] = arr[0];
        for(int i = 1; i<arr.length; i++){
            arr_left[i] = Math.max(arr[i], arr_left[i-1]);         //{4,4,4,6,6,6,6}
        }

        //right helping array
        int [] arr_right = new int[arr.length];
        arr_right[arr.length-1] = arr[arr.length-1];
        for(int i = arr.length-2; i>=0; i--){
            arr_right[i] = Math.max(arr[i], arr_right[i+1]);       //{6,6,6,6,5,5,5}
        }

        //width = 1 (constant)
        int result = 0;
        for(int i = 0; i<arr.length; i++){
            int temp = Math.min(arr_left[i],arr_right[i]);         //{4,4,4,6,5,5,5}

            int water_above_column = temp - arr[i];                //{0,2,4,0,2,3,0} 
            result = result+water_above_column;                    //width = 1, (0+2+4+0+2+3+0) = 11
        }

        System.out.println("the total water stored = "+ result);
    }
    
}

//output

//the total water stored = 11
