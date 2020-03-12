package com.company;
import java.util.*;
public class Level1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N;
        long factorial;
        long emeralds;
        System.out.println("Введите целое неотрицательное число");
        try
        {
            N = sc.nextInt();
            if (N > 0)
            {
                factorial = Method.squirrel(N);
                emeralds = Method.quantityEmeralds(factorial);
                System.out.println("Количество изумрудов = " + emeralds);
            }
            else
            {
                System.err.println("Ошибка ввода! Число должно быть больше нуля!");
            }
        }
        catch (InputMismatchException e)
        {
            System.err.println("Ошибка ввода! Введите целое число");
        }
    }
}
class Method
{
    public static long squirrel(int N)
    {
        long result = 1;
        for (int i = 1; i <= N; i++)
        {
            result *= i;
        }
        return result;
    }

    public static long quantityEmeralds(long factorial)
    {
        long sum = 0;
        for (long i = factorial; i > 0; i = i / 10)
        {
            sum = i % 10;
        }
        return sum;
    }
}