import java.util.*;
class P33
{
  public static void main(String[] args)
  {
      Scanner hr=new Scanner(System.in);
      System.out.print("Enter The Starting Number : ");
      int low=hr.nextInt();
     System.out.print("Enter The Ending Number : ");
      int high=hr.nextInt();
        while (low < high) {
            boolean flag = false;
            for(int i = 2; i <= low/2; ++i) {
                // condition for nonprime number
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.print(low + " ");
            ++low;
        }
  }
}