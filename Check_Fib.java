public class Check_Fib {
    static boolean Check_Perfect(int n)
    {
        if(Math.ceil((double)Math.sqrt(n))==Math.floor((double)Math.sqrt(n)))
            return true;
        else return false;
    }
    static boolean Check_Fibs(int n)
    {
        return Check_Perfect(5*n*n-4) || Check_Perfect(5*n*n+4);
    }
    public static void Kth(int n)
    {
        if(Check_Fibs(n))
            {
                double phi=(1+Math.sqrt(5))/2;
                double FP=n*Math.sqrt(5);
                int K=(int) Math.round(Math.log(FP)/Math.log(phi));
                System.out.println("Yes,"+n+" is a Fib number ,and it's "+K+"th");
            }
        else System.out.println("It's not a Fib number");
    }
    public static void main(String[] args) throws Exception
    {
        int n=233;
        Kth(n);
    }
}
