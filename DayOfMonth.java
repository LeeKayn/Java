public class DayOfMonth {
    public static int Result(int M,int Y)
    {
        boolean X=(Y%400==0||(Y%4==0 && Y%100!=0))?true:false;
        if(M==2)
            if(X==true)
                return 29;
            else return 28;
        int DOM;
        switch (M)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            {
                DOM= 31;
                break;
            }
            default:
                DOM =30;
        }
        return DOM;
    }
    public static void main(String[] args)
    {
        int M=2,Y=2000;
        // int M=4,Y=2001;
        // int M=3,Y=2001;
        System.out.println("Day of month: "+DayOfMonth.Result(M,Y));
    }
}
