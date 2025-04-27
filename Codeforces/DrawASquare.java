import java.util.*;
import java.io.*;
public class DrawASquare 
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
        int l=Integer.parseInt(st.nextToken());
        int r=Integer.parseInt(st.nextToken());
        int d=Integer.parseInt(st.nextToken());
        int u=Integer.parseInt(st.nextToken());
        if(r==l&&l==d&&d==u)
        pw.println("Yes");
        else 
        pw.println("No");
      }
      pw.close();
    }
}
