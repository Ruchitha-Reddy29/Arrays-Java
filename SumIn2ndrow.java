public class SumIn2ndrow {

    public static int sum(int nums[][]){
        int sum =0;
        int m = nums.length;
        for(int i=0;i<m;i++){
            for(int j=0;j<nums[i].length;j++){
                if(i==1){
                    sum += nums[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String args[]){
        int nums[][] = {{1,4,9},{11,4,3},{2,2,3}};
        System.out.println(sum(nums)); 
    }
}
