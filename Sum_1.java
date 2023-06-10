public class Sum_1 {
    public static float Result(int n)
    {
        float S=0;
        // for(int i=1; i<=n; i++)
        //     S+=(float)1/i;
        int i=1;
        while(i<=n)
        {
            S+=(float)1/i;
            i++;
        }
        return S;
    }
    public static void main(String[] args)
    {
        int n=10;
        System.out.println("S= "+Sum_1.Result(n));
    }
}
