public class Fibonacci {
    public static void Result(int n)
    {
        int a=0,b=1,c;
        if(n==0)
            {
                System.out.print("0");
                System.exit(0);
            }
        System.out.print(a+" "+b+" ");
        for(int i=2;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(b+" ");
        }
    }
    public static void main(String[] args) throws Exception
    {
        int n=13;
        Result(n);
    }
}
