package com.zhangli.structure_pattern.proxy.static_proxy;

/**
 * Client
 *
 * @author zhangli
 * date 2022/9/4 16:43
 */

public class Client {

    public static void main(String[] args) {

        ChengduTrainStation chengduTrainStation = new ChengduTrainStation();

        PersonSellTickets personSellTickets = new PersonSellTickets(chengduTrainStation);

        chengduTrainStation.sell();
        System.out.println("---------------------");
        personSellTickets.sell();

    }


}
