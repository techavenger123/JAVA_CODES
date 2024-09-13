import java.util.Scanner;
public class Program
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n;
        n=s.nextInt();
        switch(n)
        {
            case 1:
            System.out.println("january");
            break;
            case 2:
            System.out.println("febuary");
            break;
            case 3:
            System.out.println("march");
            break;
            case 4:
            System.out.println("april");
            break;
            case 5:
            System.out.println("may");
            break;
            case 6:
            System.out.println("june");
            break;
            case 7:
            System.out.println("july");
            break;
            case 8:
            System.out.println("august");
            break;
            case 9:
            System.out.println("september");
            break;
            case 10:
            System.out.println("octomber");
            break;
            case 11:
            System.out.println("november");
            break;
            case 12:
            System.out.println("december");
            break;
            default :
            System.out.println("Enter a valid number");
        }
	}
}
