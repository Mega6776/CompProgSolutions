import java.util.*;
import java.io.*;
public class BrrBrrPatapim
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
        int[][]arr=new int[n][n];
        for(int i=0;i<n;i++)
        {
          String[]temp=br.readLine().split(" ");
          for(int j=0;j<n;j++)
          arr[i][j]=Integer.parseInt(temp[j]);
        }
        int[]res=new int[2*n];
        TreeSet<Integer>set=new TreeSet<>();
        for(int i=1;i<=2*n;i++)
        set.add(i);
        for(int i=0;i<n;i++)
        {
          for(int j=0;j<n;j++)
          {
            res[i+j+1]=arr[i][j];
            set.remove(arr[i][j]);
          }
        }
        for(int x:res)
        {
          if(x==0)
          {
            pw.print(set.first()+" ");
            set.remove(set.first());
          }
          else 
          pw.print(x+" ");
        }
        pw.println();
      }
      pw.close();
    }
}
