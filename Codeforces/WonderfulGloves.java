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
        int k=Integer.parseInt(st.nextToken());
        int[]arr=new int[n];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++)
        arr[i]=Integer.parseInt(st.nextToken());
        int[]arr2=new int[n];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++)
        arr2[i]=Integer.parseInt(st.nextToken());
        ArrayList<Integer>list=new ArrayList<>();
        long res=0;
        for(int i=0;i<n;i++)
        {
          if(arr[i]>arr2[i])
          {
            res+=(long)arr[i];
            list.add(arr2[i]);
          }
          else 
          {
            res+=(long)arr2[i];
            list.add(arr[i]);
          }
        }
        Collections.sort(list);
        Collections.reverse(list);
        for(int i=0;i<k-1;i++)
        res+=(long)list.get(i);
        pw.println(res+1);
      }
      pw.close();
    }
}
