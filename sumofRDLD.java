import java.util.*;
public class sumofRDLD {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows and columns of the matrix: ");
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] arr = new int[n][m];
            System.out.println("Enter the elements of the matrix: ");
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            int sum = 0;
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    if(i==j || i+j==n-1){
                        sum += arr[i][j];
                    }
                }
            }
            System.out.println("The sum of the right diagonal and left diagonal elements of the matrix is: "+sum);
        }
    }
}
