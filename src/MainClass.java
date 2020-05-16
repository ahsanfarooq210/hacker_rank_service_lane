import java.util.Scanner;

public class MainClass
{
  public static void main(String[] args)
  {
    int n,t;
    Scanner in=new Scanner(System.in);
    n=in.nextInt();
    t=in.nextInt();

    int arr[]=new int[n];

    for(int i=0;i<n;i++)
    {
      arr[i]=in.nextInt();
    }

    for (int i=0;i<t;i++)
    {
        int l,r;
        l=in.nextInt();
        r=in.nextInt();
        int ans=arr[l];
        while(l<=r)
        {
          ans=Math.min(ans,arr[l]);
          l++;
        }
      System.out.println(ans);
    }


  }
}
