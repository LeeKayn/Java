public class GCD_LCM {
    static long GCD(int a,int b)
    {
        if(a==0) return b;
        return GCD(b%a,a);
    }
    static void LCM(int a,int b)
    {
        System.out.println("GCD= "+GCD(a,b)+" ; LCM= "+(a/GCD(a,b))*b);
    }
    public static void main(String[] args)
    {
        int a=5,b=15;
        LCM(a,b);
    }
}
