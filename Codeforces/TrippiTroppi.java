import java.util.*;
import java.io.*;
public class TrippiTroppi
{
    public static void main(String[] args) throws IOException
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      PrintWriter pw=new PrintWriter(System.out);
      StringTokenizer st=new StringTokenizer(br.readLine());
      int t=Integer.parseInt(st.nextToken());
      while(t-->0)
      {
        //st=new StringTokenizer(br.readLine());
        String[]arr=br.readLine().split(" ");
        for(String x:arr)
        pw.print(x.substring(0,1));
        pw.println();
      }
      pw.close();
    }
}
