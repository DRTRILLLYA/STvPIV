package task4;

import java.util.*;

public class task42
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
        }
        scan.close();
    }

    public static void n1(Scanner scan)
    {
        System.out.println("Введите строку: ");
        String input = scan.nextLine();
        System.out.println(input.toLowerCase());
    }

    public static void n2(Scanner scan)
    {
        System.out.println("Введите строку: ");
        String input = scan.nextLine();
        System.out.println(input.toUpperCase());
    }

    public static void n3(Scanner scan)
    {
        System.out.println("Введите строку: ");
        String input = scan.nextLine();
        char[] str = input.toCharArray();
        Arrays.sort(str);
        ArrayList <Integer> max = new ArrayList<Integer>();
        int counter = 0;
        int maxcounter = 0;
        int resultcol = 0;
        for (int i = 1; i < str.length; i++)
        {
            if(str[i] == str[i-1])
            {
                counter++;
            }
            else
            {
                max.add(counter+1);
                counter = 0;
                maxcounter++;
            }
        }
        Collections.sort(max);
        Collections.reverse(max);

        for (int i = 1; i < max.size(); i++)
        {
            if(max.get(i) < max.get(i-1))
            {
                resultcol = max.get(i);
                break;
            }
        }

        for (int i = 1; i < str.length; i++)
        {
            if(str[i] == str[i-1])
            {
                counter++;
                if (counter == resultcol-1)
                {
                    System.out.println(str[i]);
                    break;
                }
            }
            else
            {
                counter = 0;
            }
        }

    }

    public static void n4(Scanner scan)
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

    public static void n5(Scanner scan)
    {
        System.out.println("Введите строку: ");
        String input = scan.nextLine();
        char[] str = input.toCharArray();
        ArrayList<Character> exep = new ArrayList <Character>();
        exep.add(str[0]);
        for (int i = 1; i < str.length; i++)
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
                System.out.println(str[i]);
                break;
            }
        }
    }

    public static void n6(Scanner scan)
    {
        System.out.println("Введите строку: ");
        String input = scan.nextLine();
        char[] str = input.toCharArray();
        if(str[0] == str[str.length-2] && str[1] == str[str.length-1])
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }

    public static void n7(Scanner scan)
    {
        System.out.println("Введите строку: ");
        String input = scan.nextLine();
        char[] str = input.toCharArray();
        Arrays.sort(str);
        int counter = 0;
        int counterof3 = 0;
        for (int i = 1; i < str.length; i++)
        {
            if(str[i] == str[i-1])
            {
                counter++;
                if (counter == 2)
                {
                    counterof3++;
                }
            }
            else
            {
                counter = 0;
            }
        }
        System.out.println(counterof3);
    }

    public static void n8(Scanner scan)
    {
        System.out.println("Введите строку: ");
        String input = scan.nextLine();
        char[] str = input.toCharArray();
        int sum = 0;
        for (int i = 0; i < str.length; i++) 
        {
            if (Character.isDigit(str[i]))
            {
                sum += Character.getNumericValue(str[i]);
            }
        }
        System.out.println(sum);
    }
}
