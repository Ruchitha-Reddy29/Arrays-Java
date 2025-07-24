public class Transpose {

    public static void printmatrix(int matrix[][]){
        int m = matrix.length;

        for(int i=0;i<m;i++){
            for(int j=0;j<matrix[i].length;j++){
                 System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
    int row = 2, col = 3;
     int matrix[][] = {{1,2,3},{4,5,6}};
     printmatrix(matrix);

     int transpose[][] = new int[col][row];
     for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            transpose[j][i] = matrix[i][j];
        }
     }
     System.out.println();
     printmatrix(transpose);
    }
}
