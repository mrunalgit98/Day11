import java.util.Scanner;

public class Stock {
    static int Stock(int s)

    {
        int no_of_stock ;
        String share_name;
        int share_price;
        int valueofshare;

        int value = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter stock name");
        share_name=sc.next();
        System.out.println("enter no of stocks");
        no_of_stock=sc.nextInt();
        System.out.println("enter share price");
        share_price=sc.nextInt();
        valueofshare=no_of_stock+share_price;
        value=valueofshare+value;
        return value;
    }
    static void portfolio(int s, int stockvalue){
        System.out.println("stock valuation is " + stockvalue);
    }

    public static void main(String[] args) {
        System.out.println("ENTER 1 To Start");
        Scanner sc =new Scanner(System.in);
        int s=sc.nextInt();
        int stok=Stock(s);
        portfolio(s,stok);

    }
}