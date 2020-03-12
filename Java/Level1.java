import java.util.*;
public class Level1
{
    public static long squirrel(int N)
    {
        long result = 1;
        long sum = 0;
        for (int i = 1; i <= N; i++)
        {
            result *= i;
        }
        for (long i = result; i > 0; i = i / 10)
        {
            sum = i % 10;
        }
        return sum;
    }
}
