package service;

import bean.Item;
import bean.Order;
import bean.Supplier;
import exception.NotEnoughStock;
import exception.OrderAlreadyFulfilled;
import exception.OrderNotFound;
import util.OnlineShopingInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class OnlineShopingSystem implements OnlineShopingInterface {

    ArrayList<Order> orderArrayList = new ArrayList<>();

    ArrayList<Supplier> supplierArrayList = new ArrayList<>();
    @Override
    public boolean addOrder(Order o) {
        System.out.println("Trying to add the Order..!");
        orderArrayList.add(o);
            System.out.println("Order has been added");
            return true;
    }

    @Override
    public boolean cancelOrder(long orderId) throws OrderNotFound {
        for(Order or: orderArrayList)
        {
            if(or.getOrderId() == orderId)
            {
                orderArrayList.remove(or);
                System.out.println("Order has been removed from the list "+or.getOrderId());
                return true;
            }
            else
            {
                throw new OrderNotFound();
            }
        }
        return false;
    }

    @Override
    public boolean cancelItem(long orderId, int itemId) throws OrderNotFound {
        boolean f = true;
        for(Order or : orderArrayList)
        {
            if(or.getOrderId() == orderId)
            {
                ArrayList<Item> arrayList = or.getItemArrayList();
               for(Item k : arrayList)
               {
                   if(k.getItemId() == itemId)
                   {
                       arrayList.remove(k);
                       System.out.println("Item has been removed from the List");
                       f = false;
                       return true;
                   }
               }

            }
        }
        if(f == true)
        {
            throw new OrderNotFound();
        }
        return false;
    }

    @Override
    public boolean fulfillOrder(long orderId) throws OrderAlreadyFulfilled, NotEnoughStock {
        boolean f = true;
        for(Order or : orderArrayList)
        {
            if(or.getOrderId() == orderId)
            {
                if((or.getOrderStatus().equalsIgnoreCase("Fulfilled")))
                {
                    throw new OrderAlreadyFulfilled();
                }

                else if (!(or.getOrderStatus().equalsIgnoreCase("Fulfilled")))
                {
                    or.setOrderStatus("Fulfilled");
                    System.out.println("Order status has been updated ");
                    return true;
                }
                else {
                   throw new NotEnoughStock();
                }
            }
        }

        return false;
    }

    @Override
    public HashMap<Long, Integer> getStockDetails() {
        HashMap<Long, Integer> getStocks = new HashMap<>();
        for(Order or : orderArrayList)
        {
            for(Item k : or.getItemArrayList())
            {
                getStocks.put(k.getItemId(),getStocks.getOrDefault(k.getItemId(),0)+1);
            }
        }
        return getStocks;
    }

    @Override
    public List<Order> listOrderByPrice() {
        return orderArrayList.stream().sorted((x,y)-> (Double.valueOf(x.getOrderAmount()).compareTo(Double.valueOf(y.getOrderAmount())))).collect(Collectors.toList());
    }
}
