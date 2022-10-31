package com.zhangli.structure_pattern.proxy.jdk_proxy;

/**
 * @author zhangli
 * date 2022/9/4 17:03
 */

public class Client {

    public static void main(String[] args) {

        // 代理工程
        TrainStationProxyFactory proxyFactory = new TrainStationProxyFactory(new ChengduTrainStation());
        // 代理对象
        SellTickets sellTicketObject = proxyFactory.getSellTicketProxyObject();
        TrainStation trainStation = proxyFactory.getTrainStation();
        // 代理方法
        sellTicketObject.sellTickets();
        trainStation.sellFood();
//
//        SellFood sellFoodProxyObject = proxyFactory.getSellFoodProxyObject();
//        sellFoodProxyObject.sellFood();


    }
}
