
public class FIst_Equation {
    public static void Result(int a,int b)
    {
        String Res= a==0? "Math error":"X= "+(float)(-b)/a;
        System.out.println(Res);
        // if(a==0) System.out.println("Math error");
        //     else System.out.println("X= "+(float)(-b)/a);
    }
    public static void main(String[] args)
    {
        // FIst_Equation FE=new FIst_Equation();
        // FE.Result(3,5);
        FIst_Equation.Result(3,5);
    }
}
