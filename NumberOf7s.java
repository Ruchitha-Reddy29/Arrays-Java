public class NumberOf7s {

    public static int count(int matrix[][]){
        int count = 0;
        int n = matrix.length;
       
        for(int i=0;i<n;i++){
            for(int j=0;j<matrix[i].length;j++){
              if(matrix[i][j]==7){
                count++;
              }  
            }
        }
       return count; 
    }
    public static void main(String args[]){
       int matrix[][] = {{4,7,8,7},
                          {8,8,7,7}};
        System.out.println(count(matrix));
    }
}
