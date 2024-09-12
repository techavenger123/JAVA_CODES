import java.util.Scanner;
public class Program
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n;
        n=s.nextInt();
        while(n>0)
        {
            System.out.println((n%10)+1);
            n=n/10;
        }
	}
}
