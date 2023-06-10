public class Perfect_Square {
    public static void Result(int n)
    {
        if(Math.ceil((double)Math.sqrt(n))==Math.floor((double)Math.sqrt(n)))
        {
            System.out.println("True");
        }
        else
            System.out.println("False");
    }
    public static void main(String[] args) throws Exception
    {
        int n=25;
        Perfect_Square.Result(n);
    }
}
