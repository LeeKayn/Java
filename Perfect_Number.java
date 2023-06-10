public class Perfect_Number {
    static void Result(int n)
    {
        int Sum=1;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
                if(i*i!=n)
                    Sum=Sum+i+n/i;
                else 
                    Sum=Sum+i;
        }
        if(Sum==n&& n!=1)
            System.out.println(n);
    }
    public static void main(String[] args) throws Exception
    {
        int n=1000;
        for(int i=2;i<=n;i++)
            Result(i);
    }
}
