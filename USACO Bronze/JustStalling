import java.util.*;
import java.io.*;
public class JustStalling
{
  static int binarySearch(int tar,int[]arr)
  {
    int min=0;
    int max=arr.length-1;
    int res=-1;
    while(min<=max)
    {
      int mid=(min+max)/2;
      if(tar<=arr[mid])
      {
        res=mid;
        max=mid-1;
      }
      else 
      min=mid+1;
    }
    return res==-1?0:arr.length-res;
  }
    public static void main(String[] args) throws IOException
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      PrintWriter pw=new PrintWriter(System.out);
      StringTokenizer st=new StringTokenizer(br.readLine());
      int n=Integer.parseInt(st.nextToken());
      int[]arr=new int[n];
      st=new StringTokenizer(br.readLine());
      for(int i=0;i<n;i++)
      arr[i]=Integer.parseInt(st.nextToken());
      Arrays.sort(arr);
      int[]arr2=new int[n];
      st=new StringTokenizer(br.readLine());
      for(int i=0;i<n;i++)
      arr2[i]=Integer.parseInt(st.nextToken());
      Arrays.sort(arr2);
      long res=1;
      for(int i=n-1;i>=0;i--)
      res*=(long)binarySearch(arr[i],arr2)-(long)(n-i-1);
      pw.println(res);
      pw.close();
    }
}
