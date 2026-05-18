package lab6;

public class Q4 {
    /* x = 5, y = 5, z = 0
    1.

     */
    public static void main(String[] args)
    {
        System.out.println("Hello");
        int result = funny(5, 5, 0);
        System.out.println(result);
    }
    public static int funny(int x, int y, int z)
    {
        int a,b;
        if(z == 3)
        {
            return y;
        }
        else if (z==4)
        {
            return 1;
        }
        else{
            a = funny(x,y-1,z+1);
            b = funny(x,y-1,z+2);
            int k = a+b;
            System.out.println("ab = "+k);
            return a+b;
        }
    }
}
