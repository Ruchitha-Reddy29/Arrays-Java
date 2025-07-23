public class SumofEvendigits {

    public static int sumEven(int num){
        if(num == 0) return 0;
        int digit = num%10;
        if(digit%2==0){
            digit = digit;
        }else{
            digit = 0;
        }
        return digit + sumEven(num/10);
    }
    public static void main(String args[]){
        System.out.println(sumEven(12324));
    }
}
