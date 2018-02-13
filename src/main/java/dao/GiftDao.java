package dao;

import model.Gift;

import java.util.List;

/**
 * Created by tanke on 2018/2/12.
 */
/*
*作者：李潮
*时间：2018/2/12
*类名：GiftDao
*/
public interface GiftDao {
    Gift seletById(long gId);

    long addGift(Gift gift);

    int delGift(long gId);

    int update();

    List<Gift> getAllGift();
}
