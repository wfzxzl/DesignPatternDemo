package com.zhangli.structure_pattern.proxy.static_proxy;

/**
 * Train Station sell proxy object ,
 *
 * @author zhangli
 * date 2022/9/4 16:41
 */

public class PersonSellTickets implements SellTickets {

    private final TrainStation trainStation;

    PersonSellTickets(TrainStation trainStation) {
        this.trainStation = trainStation;
    }

    public void sell() {
        System.out.println("Person sell ticket , you pay for proxy person 100$ !");
        trainStation.sell();
    }
}
