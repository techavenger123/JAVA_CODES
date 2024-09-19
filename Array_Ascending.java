public class Program
{
    public static void main(String[] args) 
    {
        int temp=0;
        int[] arr={10,20,30,40,60,50,70,80,90,100};
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                if(arr[j]<arr[i])
                {
                   temp=arr[j];
                   arr[j]=arr[i];
                   arr[i]=temp; 
                }
                else
                {
                    continue;
                }
            }
        }
        for(int k=0;k<10;k++)
        {
            System.out.println(arr[k]);
        }
	}
}
