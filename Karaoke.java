public class Karaoke {
    public static int Result(int a,int b)
    {
        int Money=(b<18)?45:60;
        return Money*(b-a);
    }
    public static void main(String[] args)
    {
        int a=16,b=19;
        System.out.println("Money= "+Karaoke.Result(a, b)+".000 VND");
    }
}
