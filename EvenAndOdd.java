import java.util.*;
class EvenAndOdd{
    public static void main (String args [])
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number %2== 0)
        {
            System.out.print("NO IS EVEN");
        } 
        else
        {
            System.out.print("NO IS ODD");
        }
    }
}