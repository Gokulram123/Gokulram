/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    static int getMissingNumber(int a[], int n) 
    {
        int i,total;
        total = (n+1)*(n+2)/2;
        for (i = 0; i <= (n -1); i++)
        {
            
            total -= a[i];
        }
        return total;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr= new int[n];
        for(int i=0;i<=n-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(getMissingNumber(arr,n));
	}
}
