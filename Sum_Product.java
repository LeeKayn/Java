public class Sum_Product {
    public static void Result(int n)
    {
        int S=0,P=1;
        int Temp=0;
        while(n>=1)
        {
            Temp=n%10;
            S+=Temp;
            P*=Temp;
            n/=10;
        }
        System.out.println("Sum= "+S+" ; Product= "+P);
    }
    public static void main(String[] args)
    {
        int n=23456;
        Sum_Product.Result(n);
    }
}
