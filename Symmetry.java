public class Symmetry {
    // public static void Result(int n)
    // {
    //     String Check=String.valueOf(n);
    //     int K=Check.length();
    //     int Mid=(K%2==0)?K/2:(K+1)/2;
    //     for(int i=0,j=K;i<=Mid;i++,j--)
    //     {
    //         int num=Character.getNumericValue(Check.charAt(i));
    //         int num2=Character.getNumericValue(Check.charAt(j));
    //         if(num == num2)
    //             {
    //                 System.out.println("False");
    //             }
    //         else
    //             System.out.println("True");
    //     }
    // }
    public static void Result(int n)
    {
        String Check=String.valueOf(n);
        int L=Check.length();
        int Mid=(L%2==0)?L/2:(L+1)/2;
        for(int i=1;i<=Mid;i++)
        {
            if(n%(int)Math.pow(10, 1)!=n/(int)Math.pow(10, L-1))
                {
                    System.out.println("False");
                    System.exit(0);
                }
            n=n-n/(int)Math.pow(10, L-1)*(int)Math.pow(10, L-1);
            n/=10;
            L-=2;
        }
        System.out.println("True");
    }
    public static void main(String[] args)
    {
        int n=2562;
        Symmetry.Result(n);
    }
}
