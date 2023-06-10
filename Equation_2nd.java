public class Equation_2nd {
    public static void Result(int a,int b,int Re1,int c,int d,int Re2)
    {
        float D,Dx,Dy,X,Y;
        D=a*d-c*b;
        Dx=Re1*d-Re2*b;
        Dy=a*Re2-c*Re1;
        X=Dx/D;
        Y=Dy/D;
        System.out.println("X= " + X+ " ; Y= "+Y);
    }
    public static void main(String[] args)
    {
        int a,b,Re1,c,d,Re2;
        a=2;b=1;Re1=4;c=3;d=2;Re2=7;
        Equation_2nd.Result(a,b,Re1,c,d,Re2);
    }
}
