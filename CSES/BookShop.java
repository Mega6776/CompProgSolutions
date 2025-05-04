import java.util.*;
import java.io.*;
public class BookShop
{
    public static void main(String[] args) throws IOException
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      PrintWriter pw=new PrintWriter(System.out);
      StringTokenizer st=new StringTokenizer(br.readLine());
      int n=Integer.parseInt(st.nextToken());
      int x=Integer.parseInt(st.nextToken());
      int[]prices=new int[n+1];
      st=new StringTokenizer(br.readLine());
      for(int i=1;i<=n;i++)
      prices[i]=Integer.parseInt(st.nextToken());
      int[]pages=new int[n+1];
      st=new StringTokenizer(br.readLine());
      for(int i=1;i<=n;i++)
      pages[i]=Integer.parseInt(st.nextToken());
      int[][]dp=new int[n+1][x+1]; //dp[i][j]=max num of pages when capped at price j and only considering the first i books
      for(int i=1;i<=n;i++)
      {
        for(int j=0;j<=x;j++)
        {
            dp[i][j]=dp[i-1][j]; //we don't buy book i
            if(j-prices[i]>=0) //i since we are 1-indexed
            dp[i][j]=Math.max(dp[i][j],dp[i-1][j-prices[i]]+pages[i]);
        }
      }
      pw.println(dp[n][x]);
      pw.close();
    }
}