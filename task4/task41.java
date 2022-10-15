package task4;

import java.util.*;

public class task41
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер задания: ");
        String n = scan.nextLine();
        switch (n)
        {
            case "1" :
                n1(scan);
                break;
            case "2" :
                n2(scan);
                break;
            case "3" :
                n3(scan);
                break;
            case "4":
                n4(scan);
                break;
            case "5":
                n5(scan);
                break;
            case "6":
                n6(scan);
                break;
            case "7":
                n7(scan);
                break;
            case "8":
                n8(scan);
                break;
            case "9":
                n9(scan);
                break;
            case "10":
                n10(scan);
                break;
        }
        scan.close();
    }

    public static void n1(Scanner scan)
    {
        System.out.println("Введите строку: ");
        String input = scan.nextLine();
        int len = input.length();
        int counter = 0;
        char[] str = input.toCharArray();
        for (int i = 0; i < len / 2; i++)
        {
            if (str[i] == str[len-1-i])
            {
                counter++;
            }
            else
            {
                System.out.println("false");
                break;
            }
        }
        if (counter == len / 2)
        {
            System.out.println("true");
        }
    }

    public static void n2(Scanner scan)
    {
        System.out.println("Введите строку: ");
        String input = scan.nextLine();
        char[] str = input.toCharArray();
        ArrayList<Character> exep = new ArrayList <Character>();
        exep.add(str[0]);
        int counter = 0;
        String result = String.valueOf(str[0]);
        for (int i = 1; i < input.length(); i++)
        {
            if (str[i] == str[i-1] || exep.contains(str[i]))
            {
                if (!exep.contains(str[i]))
                {
                    exep.add(str[i]);
                }
            }
            else
            {
                result += String.valueOf(str[i]);
            }
        }
        System.out.println(exep);
        System.out.println(result);
    }

    public static void n3(Scanner scan)
    {
        System.out.println("Введите строку: ");
        String input1 = scan.nextLine();
        char[] str1 = input1.toCharArray();
        System.out.println("Введите строку: ");
        String input2 = scan.nextLine();
        char[] str2 = input2.toCharArray();
        int counter = 0;
        if (input1.length() == input2.length())
        {
            for (int i = 0; i < str1.length; i++)
            {
                for (int j = 0; j < str2.length; j++)
                {
                    if (str1[i] == str2[j])
                    {
                        counter++;
                        break;
                    }
                }
            }
            if (counter == str1.length)
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
        }
        else
        {
            System.out.println("false");
        }
    }

    public static void n4(Scanner scan)
    {
        System.out.println("Введите строку: ");
        String input1 = scan.nextLine();
        String input12 = input1.toLowerCase();
        char[] str1 = input1.toCharArray();
        System.out.println("Введите строку: ");
        String input2 = scan.nextLine();
        String input22 = input2.toLowerCase();
        char[] str2 = input22.toCharArray();
        int len;
        if (input1.length() > input2.length()) len = input2.length(); else len = input1.length();
        for (int i = 0; i < len; i++)
        {
            if((int)str1[1] > (int)str1[2])
            {
                System.out.println(input1);
                break;
            }
            if((int)str1[1] < (int)str1[2])
            {
                System.out.println(input2);
                break;
            }
        }
    }

    public static void n5(Scanner scan)
    {
        System.out.println("Введите строку: ");
        String input1 = scan.nextLine();
        String input12 = input1.toLowerCase();
        char[] str1 = input12.toCharArray();
        System.out.println("Введите строку: ");
        String input2 = scan.nextLine();
        String input22 = input2.toLowerCase();
        char[] str2 = input22.toCharArray();
        int len;
        if (input1.length() > input2.length()) len = input2.length(); else len = input1.length();
        for (int i = 0; i < len; i++)
        {
            if((int)str1[1] > (int)str1[2])
            {
                System.out.println(input1);
                break;
            }
            if((int)str1[1] < (int)str1[2])
            {
                System.out.println(input2);
                break;
            }
        }
    }

    public static void n6(Scanner scan)
    {
        System.out.println("Введите строку: ");
        String input1 = scan.nextLine();
        System.out.println("Введите строку: ");
        String input2 = scan.nextLine();
        System.out.println(input2 + input1);
    }

    public static void n7(Scanner scan)
    {
        System.out.println("Введите строку: ");
        String str = scan.nextLine();
        System.out.println("Введите количество символов: ");
        int n = scan.nextInt();
        String input = "";
        System.out.println("Введите cимволы: ");
        for (int i = 0; i <= n; i++)
        {
            input += scan.nextLine();
        }
        if (str.equals(input))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }

    public static void n8(Scanner scan)
    {
        System.out.println("Введите строку: ");
        String input1 = scan.nextLine();
        char[] str1 = input1.toCharArray();
        System.out.println("Введите строку: ");
        String input2 = scan.nextLine();
        char[] str2 = input2.toCharArray();
        int counter = 0;
        for (int i = str1.length - str2.length; i < str1.length; i++)
        {
            if(str1[i] == str2[i - (str1.length - str2.length)])
            {
                counter++;
            }
        }
        if (counter == str2.length)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }

    public static void n9(Scanner scan)
    {
        System.out.println("Введите строку: ");
        String input1 = scan.nextLine();
        System.out.println("Введите строку: ");
        String input2 = scan.nextLine();
        if (input1.equals(input2))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }

    public static void n10(Scanner scan)
    {
        System.out.println("Введите строку: ");
        String input = scan.nextLine();
        System.out.println(input.length());
    }
}
