public class FindMax {
    public static int Max(int a,int b,int c)
    {
        return (a>b && a>c) ? a : (b>c?b:c);
    }
    public static void main(String[] args)
    {
        // FindMax F=new FindMax();
        System.out.println("Max: "+FindMax.Max(4,7,6));
    }
}
