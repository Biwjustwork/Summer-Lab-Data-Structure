package lab6;

public class Q3 {
    /* x = 5, y = 3, z = 1
    1. m = funExam( 5, 3-1, 1+1);
    2. m = funExam( 5, 2-1, 2+1);
    3. m = funExam( 5, 1-1, 3+1);
    4. m = 4 + 3
    5. m = 7 + 2
    6. m = 9 + 1
    7. m = 10

     */
    public static void main(String[] args)
    {
        int result = funExam(5, 3, 1);
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
