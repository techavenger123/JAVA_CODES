public class Program
{
    public static void main(String[] args) 
    {
        int[] arr={1,2,3,3,4,5,6,7,8,9};
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                if(i!=j)
                {
                    if(arr[i]==arr[j])
                    {
                        System.out.println(arr[j]);
                    }
                }
                else
                {
                    continue;
                }
            }
        }
	}
}
