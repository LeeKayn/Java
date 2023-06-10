public class Second_Equation {
    public static void Result(int a,int b,int c)
    {
        if(a==0)
            System.out.println("Math error");
        float Delta=(b*b)-4*a*c;
        if(Delta<0)
            System.out.println("No solution");
        String Re=Delta==0?"X1 = X2 = "+((-b)/(2*a)):"X1= "+((-b+Math.sqrt(Delta))/(2*a)+ "; X2= "+(-b+Math.sqrt(Delta))/(2*a));
        System.out.println(Re);
    }
    public static void main(String[] args)
    {
        Second_Equation.Result(1,2,1);
    }
}
