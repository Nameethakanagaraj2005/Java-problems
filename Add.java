import java.util.Scanner;
public class Add{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the rows");
        int rows=s.nextInt();
        System.out.println("Enter the columns");
        int column=s.nextInt();
        int[][] matrix1=new int[rows][column];
        int[][] matrix2=new int[rows][column];
        int[][] sum=new int[rows][column];
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                matrix1[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                matrix2[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                sum[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                System.out.print(sum[i][j]);
            }
        }
        System.out.println();
	s.close();

        
    }
}