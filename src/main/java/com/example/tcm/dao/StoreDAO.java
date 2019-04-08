package com.example.tcm.dao;

import com.example.tcm.pojo.Store;

import java.util.List;

public interface StoreDAO {

    Store getStoreInfoById(Integer id);

    List<Store> getStore(Store store);

    int addStore(Store store);

    int updateStoreInfo(Store store);

    int deleteStore(Integer id);
}
