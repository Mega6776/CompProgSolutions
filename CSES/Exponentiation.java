import java.util.*;
import java.io.*;
public class Exponentation
{
  static long MOD=1000000000+7;
  static long exp(long a,long b)
  {
    long res=1;
    a%=MOD;
    while(b>0)
    {
      if(b%2==1)
      res=(res*a)%MOD;
      a=(a*a)%MOD;
      b/=2;
    }
    return res;
  }
    public static void main(String[] args) throws IOException
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      PrintWriter pw=new PrintWriter(System.out);
      StringTokenizer st=new StringTokenizer(br.readLine());
      int t=Integer.parseInt(st.nextToken());
      while(t-->0)
      {
        st=new StringTokenizer(br.readLine());
        long a=Long.parseLong(st.nextToken());
        long b=Long.parseLong(st.nextToken());
        long c=Long.parseLong(st.nextToken());
        MOD--;
        long res=exp(b,c);
        MOD++;
        pw.println(exp(a,res));
      }
      pw.close();
    }
}
