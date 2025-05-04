import java.util.*;
import java.io.*;
public class CoinCombinationsII
{
  static final long MOD=1000000007l;
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
      long[]dp=new long[x+1];
      dp[0]=1;
      for(int coin:arr)
      {
        for(int i=1;i<=x;i++)
        {
          if(i-coin>=0)
          dp[i]+=dp[i-coin];
          if(dp[i]>MOD)
          dp[i]-=MOD;
        }
      }
      pw.println(dp[x]);
      pw.close();
    }
}