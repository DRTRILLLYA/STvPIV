import java.util.*;

public class task1 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер задания: ");
        String zadanie = scan.nextLine();
        switch (zadanie)
        {
            case "1" :
                System.out.println("Последняя цифра: " + n1(scan));
                break;
            case "2" :
                System.out.println("Сумма цифр: " + n2(scan));
                break;
            case "3" :
                System.out.println("Результат: " + n3(scan));
                break;
            case "4":
                System.out.println("Результат: " + n4(scan));
                break;
            case "5":
                System.out.println("Наименьшее число: " + n5(scan));
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

    public static int n1(Scanner scan)
    {
        System.out.println("Найходим последнюю цифру");
        System.out.println("Введите число: ");
        int a = scan.nextInt();
        return a%10;
    }

    public static int n2(Scanner scan)
    {
        System.out.println("Находим сумму цифр числа");
        System.out.println("Введите число: ");
        int a = scan.nextInt();
        int S = 0;
        while (a > 0)
        {
            S += a%10;
            a /= 10;
        }
        return S;
    }

    public static int n3(Scanner scan)
    {
        System.out.println("Производим операции с числом");
        System.out.println("Введите число: ");
        int a = scan.nextInt();
        if (a > 0)
        {
            return a+1;
        }
        else
        {
            return a;
        }
    }

    public static int n4(Scanner scan)
    {
        System.out.println("Производим операции с числом");
        System.out.println("Введите число: ");
        int a = scan.nextInt();
        if (a > 0)
        {
            return a+1;
        }
        else if (a < 0)
        {
            return a-2;
        }
        else
        {
            return 10;
        }
    }

    public static int n5(Scanner scan)
    {
        System.out.println("Находим наименьшее число");
        System.out.println("Введите 1 число: ");
        int a = scan.nextInt();
        System.out.println("Введите 2 число: ");
        int b = scan.nextInt();
        System.out.println("Введите 3 число: ");
        int c = scan.nextInt();
        if (a > b && b > c)
        {
            return c;
        }
        else if (b < c && b < a)
        {
            return b;
        }
        else
        {
            return a;
        }
    }

    public static void n6(Scanner scan)
    {
        System.out.println("Введите число: ");
        int a = scan.nextInt();
        if (a == 0)
        {
            System.out.println("Нулевое число");
        }
        if (a > 0)
        {
            System.out.print("Положительное ");
        }
        else
        {
            System.out.print("Отрицательное ");
        }
        if (a % 2 == 0)
        {
            System.out.println("четное число");
        }
        else
        {
            System.out.println("нечетное число");
        }
    }

    public static void n7(Scanner scan)
    {
        System.out.println("Введите код города: ");
        int a = scan.nextInt();
        if (a == 905)
        {
            System.out.print("Москва. Стоимость разговора: 41.5");
        }
        if (a == 194)
        {
            System.out.print("Ростов. Стоимость разговора: 19.8");
        }
        if (a == 491)
        {
            System.out.print("Краснодар. Стоимость разговора: 26.9");
        }
        if (a == 800)
        {
            System.out.print("Киров. Стоимость разговора: 50.0");
        }
    }

    public static void n8(Scanner scan)
    {
        System.out.println("Введите размер массива");
        int N = scan.nextInt();
        int arr[] = new int[N];
        int maxValue = 0;
        int sumPos = 0;
        int sumNegEven = 0;
        int colPos = 0;
        int sumNeg = 0;
        int colNeg = 0;
        int mean = 0;
        System.out.println("Введите массив");
        for (int i = 0; i < N; i++)
        {
            arr[i] = scan.nextInt();
            if (arr[i] > maxValue) maxValue = arr[i];
            if (arr[i] > 0) sumPos += arr[i];
            if (arr[i] < 0 && arr[i] % 2 == 0) sumNegEven += arr[i];
            if (arr[i] > 0) colPos++;
            if (arr[i] < 0) sumNeg += arr[i];
            if (arr[i] < 0) colNeg += arr[i];
        }
        if(colNeg > 0)
        {
            mean = sumNeg / colNeg;
        }
        System.out.print("Максимальное значение ");
        System.out.println(maxValue);
        System.out.print("Сумма положительных элементов ");
        System.out.println(sumPos);
        System.out.print("Сумма четных отрицательных элементов ");
        System.out.println(sumNegEven);
        System.out.print("Количество положительных элементов ");
        System.out.println(colPos);
        System.out.print("Среднее арифметическое отрицательных элементов ");
        System.out.println(mean);
    }

    public static void n9(Scanner scan)
    {
        System.out.println("Введите размер массива");
        int N = scan.nextInt();
        int arr[] = new int[N];
        int sum = 0;
        System.out.println("Введите массив");
        for (int i = 0; i < N; i++)
        {
            arr[N-1-i] = scan.nextInt();
        }
        for (int i = 0; i < N; i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }

    public static void n10(Scanner scan)
    {
        System.out.println("Введите размер массива");
        int N = scan.nextInt();
        int arr[] = new int[N];
        int sum = 0;
        int counter = 0;
        System.out.println("Введите массив");
        for (int i = 0; i < N; i++)
        {
            int temp = scan.nextInt();
            if (temp != 0)
            {
                arr[counter] = temp;
                counter++;
            }
        }
        for (int i = counter; i < N; i++)
        {
            arr[i] = 0;
        }
        for (int i = 0; i < N; i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}