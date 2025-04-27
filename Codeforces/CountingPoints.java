import java.util.*;
import java.io.*;
public class CountingPoints
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
        int[]cent=new int[n];
        int[]rad=new int[n];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++)
        cent[i]=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++)
        rad[i]=Integer.parseInt(st.nextToken());
        TreeMap<Integer,ArrayList<pair>>map=new TreeMap<>();
        for(int i=0;i<n;i++)
        {
          int minX=cent[i]-rad[i];
          int maxX=cent[i]+rad[i];
          for(int j=minX;j<=maxX;j++)
          {
            int maxY=(int)Math.sqrt((long)rad[i]*rad[i]-(j-(long)cent[i])*(j-(long)cent[i]));
            if(!map.containsKey(j))
            map.put(j,new ArrayList<pair>());
            map.get(j).add(new pair(-maxY,maxY));
          }
        }
        long res=0;
        for(Map.Entry<Integer,ArrayList<pair>>entry:map.entrySet())
        {
          ArrayList<pair>list=entry.getValue();
          Collections.sort(list);
          //pw.println(entry.getKey()+" "+list);
        //  pw.println(res);
          int currEnd=list.get(0).max;
          long covered=list.get(0).max-list.get(0).min+1;
          for(int i=1;i<list.size();i++)
          {
            if(currEnd>=list.get(i).max)
            continue;
            covered+=((long)list.get(i).max-list.get(i).min)-(Math.max(0,currEnd-list.get(i).min));
            currEnd=list.get(i).max;
          }
          res+=covered;
        }
        pw.println(res);
      }
      pw.close();
    }
}
class pair implements Comparable<pair>
{
  int min;
  int max;
  public pair(int min,int max)
  {
    this.min=min;
    this.max=max;
  }
  public int compareTo(pair o)
  {
    return Integer.compare(min,o.min);
  }
  public String toString()
  {
    return min+" "+max;
  }
}
