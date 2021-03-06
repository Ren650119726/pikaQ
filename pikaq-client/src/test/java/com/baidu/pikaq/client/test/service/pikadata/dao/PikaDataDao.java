package com.baidu.pikaq.client.test.service.pikadata.dao;

import com.baidu.pikaq.client.test.service.pikadata.bo.PikaData;

/**
 * Created by knightliao on 15/7/2.
 */
public interface PikaDataDao {

    /**
     * @param correlation
     * @param data
     */
    void createOne(String correlation, String data, String exchange, String routerKey);

    /**
     */
    void updateOne(PikaData pikaData);

    /**
     * @param correlation
     */
    PikaData getByCorrelation(String correlation);

}
