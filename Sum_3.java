public class Sum_3 {
    public static float Result(int n)
    {
        long PreAns=1;
        long Ans=1;
        long Res=0;
        float S=0;
        for(int i=1;i<=n;i++)
            {
                Res=PreAns*Ans*(2*i-1);
                S+=(float)1/Res;
                Ans=Res;
                PreAns=2*i;
            }
        return S;
    }
    public static void main(String[] args)
    {
        int n=10;
        System.out.println("Sum= "+Sum_3.Result(n));
    }
}
