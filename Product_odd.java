import java.math.BigInteger;
public class Product_odd {
    static BigInteger Result(int n)
    {
        BigInteger F=new BigInteger("1");
        if(n%2==0)
        {
            for(int i=2;i<=n;i+=2)
                F=F.multiply(BigInteger.valueOf(i));
        }
        else
        {
            for(int i=1;i<=n;i+=2)
                F=F.multiply(BigInteger.valueOf(i));
        }
        return F;
    }
    public static void main(String[] args) throws Exception
    {
        int N=20;
        System.out.println("Product: "+Result(N));
    }
}
