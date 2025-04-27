import java.util.*;
import java.io.*;
public class SequenceConstruction
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
        int m=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        String[]kBinary=Integer.toBinaryString(k).split("");
        int currBit=1;
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=kBinary.length-1;i>=0;i--)
        {
          if(kBinary[i].equals("1"))
          {
            res.add((int)Math.pow(2,currBit)-1);
            m-=(int)Math.pow(2,currBit)-1;
          }
          currBit*=2;
        }
        if(m<0)
        pw.println(-1); 
        else if(m==1)
        {
          if(!res.contains(1))
          pw.println(-1);
          else 
          {
            res.add(2);
            res.remove(new Integer(1));
            pw.println(res.size());
            for(int i=0;i<res.size()-1;i++)
            pw.print(res.get(i)+" ");
            pw.println(res.get(res.size()-1));
          }
        }
        else 
        {
          String[]mBinary=Integer.toBinaryString(m).split("");
          currBit=1;
          if(Integer.bitCount(m)%2==0)
          {
            for(int i=mBinary.length-1;i>=0;i--)
            {
              if(mBinary[i].equals("1"))
              res.add(currBit);
              currBit*=2;
            }
          }
          else 
          {
            boolean done=false;
            for(int i=mBinary.length-1;i>=0;i--)
            {
              if(mBinary[i].equals("1"))
              {
                if(!done&&currBit!=1)
                {
                  res.add(currBit/2);
                  res.add(currBit/2);
                  done=true;
                }
                else
                res.add(currBit);
              }
              currBit*=2;
            }
          }
          pw.println(res.size());
          for(int i=0;i<res.size()-1;i++)
          pw.print(res.get(i)+" ");
          pw.println(res.get(res.size()-1));
        }
      }
      pw.close();
    }
}
