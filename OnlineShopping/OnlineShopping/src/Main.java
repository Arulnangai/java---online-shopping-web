import bean.*;
import exception.NotEnoughStock;
import exception.OrderAlreadyFulfilled;
import exception.OrderNotFound;
import service.OnlineShopingSystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws OrderNotFound {
        OnlineShopingSystem oss = new OnlineShopingSystem();

        Previlege pv1 = new Previlege("Anu","01.02.2023","female","10001","Thj","8248044219","arul@gmail.com",2.58);
        Supplier s1 = new Supplier(2001,"Asf","Thj");
        Item i1 = new Item(10011,"50-50",9.75,s1);
        ArrayList<Item> il1 = new ArrayList<>();
        il1.add(i1);
        Order o1 = new Order(123100,"02.03.2023","Successfull",26978.260,26650,il1,pv1);

        System.out.println(oss.addOrder(o1));

        Previlege pv2 = new Previlege("Venkat","01.02.2023","female","10001","Thj","8248044219","Buji@gmail.com",2.58);
        Supplier s2 = new Supplier(2001,"Asf","Thj");
        Item i2 = new Item(10011,"50-50",9.75,s2);
        Item i3 = new Item(10012,"Meiji",9.75,s2);
        ArrayList<Item> il2 = new ArrayList<>();
        il2.add(i2);
        il2.add(i3);
        Order o2 = new Order(123005,"02.03.2023","Successfull",269978.260,269850,il2,pv2);

        System.out.println(oss.addOrder(o2));
        try {
            //oss.cancelOrder(123100);
            oss.cancelOrder(123123);
        } catch (OrderNotFound off)
        {
            System.out.println(off);
        }
        try {
            //oss.cancelItem(123005, 10011);
            oss.cancelItem(123005,123000);
        } catch (OrderNotFound off)
        {
            System.out.println(off);
        }
        try {
            oss.fulfillOrder(123005);
        } catch (OrderAlreadyFulfilled onf)
        {
            System.out.println(onf);
        }catch (NotEnoughStock nes)
        {
            System.out.println(nes);
        }
        System.out.println(oss.getStockDetails());
        System.out.println(oss.listOrderByPrice());
    }
}