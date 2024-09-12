public class Program
{
    public static void main(String[] args) 
    {
        int[] arr1={1,2,3,4,5,6,7,8,9,10};
        int[] arr2=new int[10];
        for(int i=0;i<10;i++)
        {
            arr2[i]=arr1[i];
            System.out.println(arr2[i]);
        }
	}
} 
