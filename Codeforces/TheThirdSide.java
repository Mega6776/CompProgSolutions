import java.util.*;
import java.io.*;
public class TheThirdSide
{
    public static void main(String[] args) throws IOException
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      PrintWriter pw=new PrintWriter(System.out);
      StringTokenizer st=new StringTokenizer(br.readLine());
      int t=Integer.parseInt(st.nextToken());
      while(t-->0)
      {
        st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int[]arr=new int[n];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++)
        arr[i]=Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        int curr=arr[0];
        for(int i=1;i<n;i++)
        curr=curr+arr[i]-1;
        pw.println(curr);
      }
      pw.close();
    }
}
