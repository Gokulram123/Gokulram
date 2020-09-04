import java.util.*;
public class Hello {  
 public static void main(String args[]) {  
  Scanner in=new Scanner(System.in);
  int Num=in.nextInt();
  int count=0;
  for(int i=1;i<=Num;i++)
  {
    String r=String.valueOf(i);
    char c[]=r.toCharArray();
    for(Character q:c)
    {
        if(q=='1')
        {
            count++;
        }
    }
  }
  System.out.print(count);
 }  
}