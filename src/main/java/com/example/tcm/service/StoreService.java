package com.example.tcm.service;

import com.example.tcm.pojo.Store;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface StoreService {
    Store getStoreInfoById(Integer id);

    PageInfo<Store> getStore(Store store,Integer pageNum,Integer pageSize);

    int addStore(Store store);

    int updateStoreInfo(Store store);

    int deleteStore(Integer id);
}
