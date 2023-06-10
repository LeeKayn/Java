import java.util.Arrays;

public class List_Prime {
   public static void Result(int n) 
   {
       int nNew=(n-1)/2;
       boolean marked[]=new boolean[nNew+1];
       Arrays.fill(marked, true);
       for(int i=1;i<nNew;i++)
        for(int j=i;(i+j+2*i*j)<=nNew;j++)
            marked[i+j+2*i*j]=false;
        if(n>2)
            System.out.print(2+" ");
        for(int i=1;i<=nNew;i++)
            if(marked[i]==true)
                System.out.print(2*i+1+" ");
   }
   public static void main(String[] args) throws Exception
   {
       int n=20;
       Result(n);
   }
}
