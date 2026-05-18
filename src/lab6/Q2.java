package lab6;

public class Q2 {
    /* x = 5 , y = 0 , z = 4
    1. 4

     */
    public static void main(String[] args)
    {
        int result = funExam(5, 1, 4);
        System.out.println(result);
    }
    public static int funExam(int x, int y, int z)
    {
        if(y == 0)
        {
            return z;
        }
        else{
            int m = funExam(x,y-1,z+1);
            m=m+z;
            return m;
        }
    }
}
