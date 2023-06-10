public class Intermediary {
    public static void Result(int a,int b,int c)
    {
        int X=(a>b && a<c)?a:((b>a&&b<c)?b:c);
        System.out.println("intermediary number: "+X);
    }
    public static void main(String[] args)
    {
        int a=1,b=3,c=5;
        Intermediary.Result(a, b, c);
    }
}
