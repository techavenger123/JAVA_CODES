import java.util.Scanner;
public class Program
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter radius : ");
        int r=s.nextInt();
        System.out.println("enter triangle lengths : ");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        System.out.println("enter length : ");
        int l=s.nextInt();
        circle(r);
        triangle(a,b,c);
        square(l);
	}
    public static void circle(int r)
    {
        System.out.println("enter parameter of circle is  :"+2*3.14*r);
    }
    public static void triangle(int a,int b,int c)
    {
        System.out.println("enter parameter of triangle is  :"+a+b+c);
    }
    public static void square(int l)
    {
        System.out.println("enter parameter of square is  :"+4*l);
    }
}
