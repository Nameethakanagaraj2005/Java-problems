import java.util.Scanner;
public class Transpose{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the rows");
        int rows=s.nextInt();
        System.out.println("Enter the columns");
        int column=s.nextInt();
        int[][] matrix1=new int[rows][column];
        int[][] transpose=new int[rows][column];
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                matrix1[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                transpose[j][i]=matrix1[i][j];
            }
        }
        System.out.println("Transpose of matrix");
	for(int i=0;i<column;i++){
	    for(int j=0;j<rows;j++){
	        System.out.print(transpose[i][j]+" ");
	    }
	}
        System.out.println();
	s.close();

        
    }
}