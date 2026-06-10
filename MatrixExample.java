class MatrixExample{
    public static void main(String args[]){
        int[][] mat = {{10,20,30},{40,50,60},{70,80,90}};
         System.out.println(mat[1][2]);

         for(int i = 0;i<3;i++){
             for(int j = 0;j<3;j++){
             System.out.print(mat[i][j]+ " ");
         }
         System.out.println();
         }
        System.out.println("transpose of a matrix");
         for(int i = 0;i<3;i++){
             for(int j = 0;j<3;j++){
             System.out.print(mat[j][i]+ " ");
         }
         System.out.println();
         }
        System.out.println("sum of Elements row wise");
         for(int i = 0;i<3;i++){
            int sum=0;
             for(int j = 0;j<3;j++){
                sum+=mat[i][j];
         }
         System.out.println(sum);
         }
         System.out.println("sum of Elements col wise");
         for(int i = 0;i<3;i++){
            int sum1=0;
             for(int j = 0;j<3;j++){
                sum1+=mat[j][i];
         }
         System.out.println(sum1);
         }

          
    }
}