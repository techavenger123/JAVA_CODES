import java.util.Random;
public class Program
{
    public static void main(String[] args) {
        Random a=new Random();
        int n=a.nextInt(38);
        int[] arr=new int[38];
        for(int i=1;i<=38;i++)
        {
            arr[i-1]=i;
        }
        System.out.println(arr[n]);
		
	}
}
