import java.util.*;
import java.io.*;
public class MinimizingCoins
{
    public static void main(String[] args) throws IOException
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      PrintWriter pw=new PrintWriter(System.out);
      StringTokenizer st=new StringTokenizer(br.readLine());
      int n=Integer.parseInt(st.nextToken());
      int x=Integer.parseInt(st.nextToken());
      int[]arr=new int[n];
      st=new StringTokenizer(br.readLine());
      for(int i=0;i<n;i++)
      arr[i]=Integer.parseInt(st.nextToken());
      int[]dp=new int[x+1]; //dp[i]=min number of coins needed to produce value i 
      Arrays.fill(dp,Integer.MAX_VALUE);
      dp[0]=0;
      for(int i=1;i<=x;i++)
      {
        for(int coin:arr)
        dp[i]=Math.min(dp[i],i-coin>=0?Math.min(dp[i-coin],Integer.MAX_VALUE-1)+1:Integer.MAX_VALUE);
        
      }
      pw.println(dp[x]==Integer.MAX_VALUE?-1:dp[x]);
      pw.close();
    }
}
