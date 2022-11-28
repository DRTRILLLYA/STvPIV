package task6;

import java.util.*;

public class task6
{
    public static void main(String[] args)
    {
        HashMap<String, String> loginsAndPasswords = new HashMap<>();
        loginsAndPasswords.put("user1", "qwerty");
        loginsAndPasswords.put("user2", "123456");
        loginsAndPasswords.put("user3", "654321");
        loginsAndPasswords.put("user4", "ribalka");

        HashMap<String, Integer> goodsAndPrices = new HashMap<>();
        goodsAndPrices.put("milk", 64);
        goodsAndPrices.put("bread", 38);
        goodsAndPrices.put("meat", 100);
        goodsAndPrices.put("lemonade", 99);
        goodsAndPrices.put("potato", 39);

        Scanner scan = new Scanner(System.in);
        System.out.println("Login: ");
        String log = scan.nextLine();
        System.out.println("Password: ");
        String pass = scan.nextLine();

        boolean flag = false;

        if (pass.equals(loginsAndPasswords.get(log)))
        {
            User newuser = new User(log, pass);
            System.out.println("You successfully authenticated");
            flag = true;
        }
        else
        {
            User newuser = new User();
            System.out.println("Incorrect login/password");
        }

        if (flag)
        {
            System.out.println("Catalog:");
            System.out.println(goodsAndPrices);

            System.out.println("What do you want to order?");
            String order = scan.nextLine();

            System.out.println("Your order:");
            String[] goods = order.split(" ");
            int sum = 0;
            for (int i = 0; i < goods.length; i++)
            {
                System.out.println(goods[i] + " " + goodsAndPrices.get(goods[i]));
                sum += goodsAndPrices.get(goods[i]);
            }
            System.out.println("Total: " + sum);
        }
    }


}
