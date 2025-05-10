import java.util.*;
import java.io.*;
public class FruitFeast 
{
    public static void main(String[] args) throws IOException
    {
      BufferedReader br=new BufferedReader(new FileReader("feast.in"));
      PrintWriter pw=new PrintWriter("feast.out");
      StringTokenizer st=new StringTokenizer(br.readLine());
      int t=Integer.parseInt(st.nextToken());
      int a=Integer.parseInt(st.nextToken());
      int b=Integer.parseInt(st.nextToken());
      boolean[][]dp=new boolean[t+1][2];
      Arrays.fill(dp[0],true);
      for(int i=0;i<dp.length;i++)
      {
        boolean noWater=dp[i][0];
        boolean water=dp[i][1];
        if(noWater)
        {
          if(i+a<dp.length)
          {
            dp[i+a][0]=true;
            dp[(i+a)/2][1]=true;
          }
          if(i+b<dp.length)
          {
            dp[i+b][0]=true;
            dp[(i+b)/2][1]=true;
          }
        }
        if(water)
        {
          if(i+a<dp.length)
          dp[i+a][1]=true;
          if(i+b<dp.length)
          dp[i+b][1]=true;
        }
      }
      for(int i=t;i>=0;i--)
      {
        if(dp[i][0]||dp[i][1])
        {
          pw.println(i);
          break;
        }
      }
      pw.close();
    }
}
