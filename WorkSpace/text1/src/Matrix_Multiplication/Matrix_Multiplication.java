package Matrix_Multiplication;

import java.util.Scanner;
public class Matrix_Multiplication {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int m;
        int n;
        int x;
        int y;
        Scanner input = new Scanner(System.in);
        System.out.println("��ֱ���������������к�������");
        m = input.nextInt();
        n = input.nextInt();
        x = input.nextInt();
        y = input.nextInt();
        if(n!=x)
        {

            System.out.println("��������!!!");
            System.exit(-1);
        }


        int MatrixA[][] = new int[m][n];
        int MatrixB[][] = new int[x][y];
        int MatrixC[][] = new int[m][y];
        Matrix.Matrix(m,n,x,y,MatrixA,MatrixB);
        Matrix.Multplication(m, n, x, y, MatrixA, MatrixB, MatrixC);
        Matrix.Matrix_show(m,y,MatrixC);
        input.close();
    }

}
