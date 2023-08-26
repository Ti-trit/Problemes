
import java.util.Arrays;


/*
We define the middle of the array arr as follows:

 - if arr contains an odd number of elements, its middle is the element
    whose index number is the same when counting from the beginning
    of the array and from its end;
- if arr contains an even number of elements, its middle is the sum
    of the two elements whose index numbers when counting from the beginning
    and from the end of the array differ by one.

Given array arr, your task is to find its middle, and,
    if it consists of two elements, replace those elements with the value of middle.
    Return the resulting array as the answer.
 */
public class Replace_Middle {

    public void Start(){
        int [] tmp = {2, 4, 10, 1};
        System.out.println(Arrays.toString(solution(tmp)));
    }

    int[] solution(int[] arr) {

        if (arr.length%2!=0){
            return arr;
        }else{
            int n =(arr.length-1)/2;
            int [] tmp  = new int [arr.length-1];
            int sum = arr[n]+arr[n+1];

            for (int i = 0; i<arr.length; i++){
                if (i<n){
                    tmp[i]=arr[i];

                }else if (i==n){
                    tmp[i]=sum;
                } else if (i == n+1){
                    continue;

                }else{
                    tmp[i-1]=arr[i];
                }
            }
            return tmp;
        }
    }





    public static void main(String[] args) {
        (new Replace_Middle()).Start();  }







}