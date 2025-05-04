import java.util.*;
import java.io.*;
public class BoncecaAmbalabu
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
        int[]setBits=new int[30];
        for(int x:arr)
        {
          for(int pow=0;pow<30;pow++)
          {
            if((x&(1<<pow))!=0)
            setBits[pow]++;
          }
        }
        long max=0;
        for(int x:arr)
        {
          long sum=0;
          for(int pow=0;pow<30;pow++)
          {
            if((x&(1<<pow))!=0)
            {
              long not=(long)n-setBits[pow];
              sum+=not*(1<<pow);
            }
            else 
            sum+=(long)setBits[pow]*(1<<pow);
          }
          max=Math.max(max,sum);
        }
        pw.println(max);
      }
      pw.close();
    }
}
