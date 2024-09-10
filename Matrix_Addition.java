import java.util.Scanner;
public class Program
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int arr1[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println("Enter arr1["+i+"]"+"["+j+"]");
                arr1[i][j]=s.nextInt();
            }
        }
        int arr2[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr2[i][j]=s.nextInt();
            }
        }
        int arr3[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println(arr3[i][j]);
            }
            System.out.println("\n");
        }
	}
}
