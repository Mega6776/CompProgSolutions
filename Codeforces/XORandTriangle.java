import java.util.*;
import java.io.*;
public class XORandTriangle
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
        int x=Integer.parseInt(st.nextToken());
        String bitX=Integer.toBinaryString(x);
        if(!bitX.substring(1).contains("1")||!bitX.contains("0"))
        pw.println(-1);
        else 
        {
          int y=1;
          while(y<x)
          y*=2;
          y/=2;
          y--;
          pw.println(y);
        }
        
        
      }
      pw.close();
    }
}
