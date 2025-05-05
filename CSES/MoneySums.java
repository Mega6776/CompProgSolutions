import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class MoneySums
{
    public static void main(String[] args) throws IOException
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      PrintWriter pw=new PrintWriter(System.out);
      StringTokenizer st=new StringTokenizer(br.readLine());
      int n=Integer.parseInt(st.nextToken());
      int[]arr=new int[n+1];
      int sum=0;
      st=new StringTokenizer(br.readLine());
      for(int i=1;i<=n;i++)
      {
        arr[i]=Integer.parseInt(st.nextToken());
        sum+=arr[i];
      }
      boolean[][]dp=new boolean[n+1][sum+1]; //dp[i][j]=can make sum j using i coins
      dp[0][0]=true;
      for(int i=1;i<=n;i++)
      {
        int value=arr[i];
        for(int j=0;j<=sum;j++)
        {
          dp[i][j]=dp[i-1][j];
          if(j-value>=0&&dp[i-1][j-value])
          dp[i][j]=true;
        }
      } 
      TreeSet<Integer>set=new TreeSet<>();
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=sum;j++)
        {
          if(dp[i][j])
          set.add(j);
        }
      } 
      pw.println(set.size());
      for(int x:set)
      pw.print(x+" ");
      pw.close();
    }
}
