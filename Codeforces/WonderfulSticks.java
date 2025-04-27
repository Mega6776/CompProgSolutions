import java.util.*;
import java.io.*;
public class Main 
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
        String[]arr=br.readLine().split("");
        int currMax=n;
        int currMin=1;
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--)
        {
          if(arr[i].equals("<"))
          {
            list.add(currMin);
            currMin++;
          }
          else 
          {
            list.add(currMax);
            currMax--;
          }
        }
        list.add(currMin);
        Collections.reverse(list);
        for(int x:list)
        pw.print(x+" ");
        pw.println();
      }
      pw.close();
    }
}

