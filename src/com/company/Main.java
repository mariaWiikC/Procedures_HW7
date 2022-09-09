package com.company;

public class Main
{

    public static void main(String[] args)
    {
        // 2.
        for (int i = 0; i < 100; i++)
        {
            if (prime(i) == true)
                System.out.print(i + "  ");
        }

        System.out.println("");

        // 3.
        int[] arr = new int[100];
        int i = 0;
        int counter = 0;

        while (counter < 100)
        {
            if (prime(i))
            {
                arr[counter] = i;
                counter++;
            }
            i++;
        }
        for (int v : arr)
            System.out.print(v + " ");

    }


    static boolean prime(int n)
    {
        boolean is_prime = false;
        if (n > 1)
        {
            for (int u = 2; u <= n; u++)
            {
                if (n % u == 0)
                {
                    if (n == u)
                        is_prime = true;
                    else
                        break;
                }
            }
        }
        return is_prime;
    }
}
