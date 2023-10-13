package util;

import bean.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import exception.NotEnoughStock;
import exception.OrderAlreadyFulfilled;
import exception.OrderNotFound;

public interface OnlineShopingInterface {
    public boolean addOrder(Order o);
    public boolean cancelOrder(long orderId) throws OrderNotFound;
    public boolean cancelItem(long orderId,int itemId) throws OrderNotFound;
    public boolean fulfillOrder(long orderId) throws OrderAlreadyFulfilled,NotEnoughStock;
    public HashMap<Long, Integer> getStockDetails();

    public List<Order> listOrderByPrice();
}
