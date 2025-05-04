import java.util.*;
import java.io.*;
public class HoofPaperScissors 
{
    public static void main(String[] args) throws IOException
    {
      BufferedReader br=new BufferedReader(new FileReader("hps.in"));
      PrintWriter pw=new PrintWriter("hps.out");
      StringTokenizer st=new StringTokenizer(br.readLine());
      int n=Integer.parseInt(st.nextToken());
      int k=Integer.parseInt(st.nextToken());
      int[]arr=new int[n];
      for(int i=0;i<n;i++)
      {
        String in=br.readLine();
        if(in.equals("H"))
        arr[i]=0;
        else if(in.equals("P"))
        arr[i]=1;
        else 
        arr[i]=2;
      }
      int[][][]dp=new int[n+1][k+2][3]; //games played, number of switches, current gesture
      int moveNum=1;
      int max=0;
      for(int move:arr)
      {
        for(int i=1;i<k+2;i++)
        {
          int add=0;
          if(move==2)
          add=1;
          dp[moveNum][i][0]=Math.max(dp[moveNum-1][i][0],Math.max(dp[moveNum-1][i-1][1],dp[moveNum-1][i-1][2]))+add;
          int add2=0;
          if(move==0)
          add2=1;
          dp[moveNum][i][1]=Math.max(dp[moveNum-1][i][1],Math.max(dp[moveNum-1][i-1][0],dp[moveNum-1][i-1][2]))+add2;
          int add3=0;
          if(move==1)
          add3=1;
          dp[moveNum][i][2]=Math.max(dp[moveNum-1][i][2],Math.max(dp[moveNum-1][i-1][0],dp[moveNum-1][i-1][1]))+add3;
          if(moveNum==n)
          max=Math.max(dp[n][i][0],Math.max(dp[n][i][1],dp[n][i][2]));
        }
        moveNum++;
      }
      pw.println(max);
      pw.close();
    }
}
