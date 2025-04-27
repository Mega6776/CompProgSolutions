import java.util.*;
import java.io.*;
public class CreatingStringsII
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
      String n=st.nextToken();
      int[]cnt=new int[26];
      for(int i=0;i<n.length();i++)
      cnt[n.charAt(i)-97]++;
      long[]fac=new long[1000001];
      fac[0]=1;
      for(int i=1;i<fac.length;i++)
      fac[i]=i*fac[i-1]%MOD;
      long[]modFac=new long[1000001];
      modFac[1000000]=exp(fac[1000000],MOD-2);
      for(int i=modFac.length-1;i>=1;i--)
      modFac[i-1]=modFac[i]*i%MOD;
      long res=fac[n.length()];
      for(int x:cnt)
      res=res*modFac[x]%MOD;
      pw.println(res);
      pw.close();
    }
}
