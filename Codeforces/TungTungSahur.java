import java.util.*;
import java.io.*;
public class TungTungSahur
{
    public static void main(String[] args) throws IOException
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      PrintWriter pw=new PrintWriter(System.out);
      StringTokenizer st=new StringTokenizer(br.readLine());
      int t=Integer.parseInt(st.nextToken());
      while(t-->0)
      {
        String[]p=br.readLine().split("");
        String[]s=br.readLine().split("");
        if(!p[0].equals(s[0]))
        {
          pw.println("NO");
          continue;
        }
        ArrayList<Integer>s1=new ArrayList<>();
        ArrayList<Integer>s2=new ArrayList<>();
        int l=1;
        for(int i=1;i<p.length;i++)
        {
          if(p[i].equals(p[i-1]))
          l++;
          else 
          {
            s1.add(l);
            l=1;
          }
        }
        s1.add(l);
        l=1;
        for(int i=1;i<s.length;i++)
        {
          if(s[i].equals(s[i-1]))
          l++;
          else 
          {
            s2.add(l);
            l=1;
          }
        }
        s2.add(l);
        if(s1.size()!=s2.size())
        {
          pw.println("NO");
          continue;
        }
        boolean good=true;
        for(int i=0;i<s1.size();i++)
        {
          if(!(s2.get(i)>=s1.get(i)&&s2.get(i)<=s1.get(i)*2))
          {
            good=false;
            break;
          }
        }
        pw.println(good?"YES":"NO");
      }
      pw.close();
    }
}
