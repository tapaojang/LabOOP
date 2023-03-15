import java.util.Arrays;
public class Lab5FunctionalInterface  {
    static int[] data = { 28, 58, 8, 77, 48, 39 };
    static ArrayProcessor q1NumberOfEvenElement; // 4
    static ArrayProcessor q2IndexOfLargestEvenValue; // 1
    static ArrayProcessor myMedian; // n/2th element of sorted = 48
    public static void main(String[] args) {
        q1(); // 4
        q2(); // 1
        oneline(); // 48
    }

    static void q1(){
        q1NumberOfEvenElement = (arr) -> {
            int sum = 0;
            for(int i : arr){
                if(i%2 ==0){
                    sum++;
                }
            }
            return sum;
        };
        System.out.println(q1NumberOfEvenElement.calculate(data));
    }

    static void q2(){
        q2IndexOfLargestEvenValue = (arr) -> {
            int max = Integer.MIN_VALUE;
            int idx = 0;
            for(int i =0; i< arr.length; i++){
                if(arr[i]%2==0 && arr[i]>max){
                    max = arr[i];
                    idx = i;
                }
            }
            return idx;
        };
        System.out.println(q2IndexOfLargestEvenValue.calculate(data));
    }

    static void oneline() {
        int[] tmp = Arrays.copyOf(data, data.length);
        Arrays.sort(tmp);
        /* q3 */ //one statement
        myMedian = (arr) -> tmp[tmp.length/2];
        System.out.println(myMedian.calculate(tmp)); 
    }
}
