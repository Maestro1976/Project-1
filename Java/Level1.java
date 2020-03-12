import java.util.*;
public class Level1
{
    public static int squirrel(int N)
    {
        int result = 1;
        int sum = 0;
        for (int i = 1; i <= N; i++)
        {
            result *= i;
        }
        for (int i = result; i > 0; i = i / 10)
        {
            sum = i % 10;
        }
        return sum;
    }
}
