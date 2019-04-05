// Program by Githin Koshy Manesh 41031

import java.util.Scanner;
 
class Sum extends Thread
{
    private int[][] A;
    private int[][] B;
    private int[][] sum;
    private int row,col;
 
    public Sum(int[][] A, int[][] B, int[][] sum, int row, int col)
    {
         this.A=A;    
         this.B=B;
         this.sum=sum;
         this.row=row;    
         this.col=col;    
    }
 
    public void run()
    {
         for(int i=0;i<col;i++)
         {
               sum[row][i]+=A[row][i]+B[row][i];        
         }      
         System.out.println("Thread "+row+" complete.");        
    }
}
 
public class MatSum
{
    public static void main(String[] args)
    {
        Scanner In = new Scanner(System.in);
 
        System.out.print("Row of Matrix A: ");    
        int rA=In.nextInt();
        System.out.print("Column of Matrix A: ");
        int cA=In.nextInt();
        System.out.print("Row of Matrix B: ");    
        int rB=In.nextInt();
        System.out.print("Column of Matrix B: ");
        int cB=In.nextInt();
        System.out.println();
       
        if(cA!=cB || rA!=rB)
        {
             System.out.println("Cannot find Sum!");
             System.exit(-1);
        }
 
        int[][] A = new int[rA][cA];
        int[][] B = new int[rB][cB];
        int[][] sum = new int[rA][cA];
       
        Sum[] thrd = new Sum[rA];
 
        System.out.println("Insert A:");
        System.out.println();
        for(int i=0;i<rA;i++)
        {
            for(int j=0;j<cA;j++)
            {
                System.out.print(i+","+j+" = ");
                A[i][j]=In.nextInt();
            }
        }        
        System.out.println();    
        System.out.println("Insert B:");
        System.out.println();
        for(int i=0;i<rB;i++)
        {
            for(int j=0;j<cB;j++)
            {
                System.out.print(i+","+j+" = ");
                B[i][j]=In.nextInt();
            }        
        }
        System.out.println();
 
 
        for(int i=0;i<rA;i++)
        {
          	thrd[i]=new Sum(A,B,sum,i,cA);
          	thrd[i].start();
        }
 
        for(int i=0;i<rA;i++)
        {
            	try
            	{
                	thrd[i].join();
            	}
            	catch(InterruptedException e){}
        }

	System.out.println();
        System.out.println("Result");
        System.out.println();
        for(int i=0;i<rA;i++)
        {
            for(int j=0;j<cB;j++)
            {
                System.out.print(sum[i][j]+" ");
            }    
            System.out.println();            
        }       

    }
}
