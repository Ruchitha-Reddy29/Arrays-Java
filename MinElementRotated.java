public class MinElementRotated {

    public static int min(int num[]){
        int left = 0;
        int right = num.length-1;
        while(left<right){
            int mid = left +(right-left)/2;
            if(mid>0 && num[mid-1]>num[mid]){
                return num[mid];
            }
            if(num[left]<num[mid]&&num[mid]>num[right]){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return num[left];

    }
    public static void main(String args[]){
      int num[] ={4,5,6,7,0,1,2};
      int min = min(num);
      System.out.println(min);
    }
}
