public class Sum_2 {
    public static float Result(int n)
    {
        float S=15;
        int i=1;
        while(i<=n)
        {
            if(i%2==1)
                S-=(float)1/i;
            else S+=(float)1/i;
            i++;
        }
        return S;
    }
    public static void main(String[] args)
    {
        int n=14;
        System.out.println("Sum= "+Sum_2.Result(n));
    }
}
