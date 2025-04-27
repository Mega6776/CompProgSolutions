import java.util.*;
import java.io.*;
public class BombrittoBandito 
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
        int m=Integer.parseInt(st.nextToken());
        int l=Integer.parseInt(st.nextToken());
        int r=Integer.parseInt(st.nextToken());
        int resL=0;
        int resR=0;
        while(m>0&&resR<r)
        {
        resR++;
        m--;
        }
        while(m>0)
        {
        resL--;
        m--;
        }
        pw.println(resL+" "+resR);
      }
      pw.close();
    }
}
