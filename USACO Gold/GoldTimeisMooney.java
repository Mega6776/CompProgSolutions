import java.util.*;
import java.io.*;
public class TimeisMooney
{
  static ArrayList<Integer>[]adj;
    public static void main(String[] args) throws IOException
    {
      BufferedReader br=new BufferedReader(new FileReader("time.in"));
      PrintWriter pw=new PrintWriter("time.out");
      StringTokenizer st=new StringTokenizer(br.readLine());
      int n=Integer.parseInt(st.nextToken());
      int m=Integer.parseInt(st.nextToken());
      int c=Integer.parseInt(st.nextToken());
      int[]arr=new int[n];
      st=new StringTokenizer(br.readLine());
      for(int i=0;i<n;i++)
      arr[i]=Integer.parseInt(st.nextToken());
      adj=new ArrayList[n];
      for(int i=0;i<n;i++)
      adj[i]=new ArrayList<>();
      for(int i=0;i<m;i++)
      {
        st=new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken())-1;
        int b=Integer.parseInt(st.nextToken())-1;
        adj[a].add(b);
      }
      long[][]dp=new long[1000][n];
      for(long[]x:dp)
      Arrays.fill(x,-1);
      dp[0][0]=0;
      for(int i=0;i<1000;i++)
      {
        for(int j=0;j<n;j++)
        {
          if(dp[i][j]==-1)
          continue;
          for(int next:adj[j])
          {
            if(i+1<1000)
            dp[i+1][next]=Math.max(dp[i+1][next],dp[i][j]+arr[j]);
          }
        }
      }
      long res=0;
      for(int i=0;i<1000;i++)
      res=Math.max(res,dp[i][0]-(long)c*i*i);
      pw.println(res);
      pw.close();
    }
}
