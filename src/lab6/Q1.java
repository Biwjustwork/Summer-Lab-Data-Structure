package lab6;

public class Q1 {
    /*  start = 6 , end = 10
     1. 10 + sum(6, 10 - 1);
     2. 9 + sum(6, 9 - 1);
     3. 8 + sum(6, 8 - 1);
     4. 7 + sum(6, 7 - 1);
     5. 6
     */
    public static void main(String[] args)
    {
        int result = sum(6, 10);
        System.out.println(result);
    }
    public static int sum(int start, int end)
    {
        if (end > start)
        {
            return end + sum(start, end - 1);
        }
        else
        {
            return end;
        }
    }
}
