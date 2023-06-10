public class IsPrime {
    public static boolean isPrime(int m)
    {
        if(m<2)
            return false;
        for(int i=2;i<=Math.sqrt(m);i++)
            if(m%i==0)
                return false;
        return true;
    }
    public static void main(String[] args) throws Exception
    {
        int m=11;
        if(isPrime(m)==true)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
