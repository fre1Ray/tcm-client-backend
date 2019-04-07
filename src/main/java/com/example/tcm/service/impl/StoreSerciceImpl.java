package com.example.tcm.service.impl;

import com.example.tcm.dao.StoreDAO;
import com.example.tcm.pojo.Store;
import com.example.tcm.service.StoreService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreSerciceImpl implements StoreService {
    @Autowired
    private StoreDAO storeDAO;

    @Override
    public Store getStoreInfoById(Integer id) {
        return storeDAO.getStoreInfoById(id);
    }

    @Override
    public PageInfo<Store> getStore(Store store, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Store> storeInfo = storeDAO.getStore(store);
        return new PageInfo<>(storeInfo);
    }

    @Override
    public int addStore(Store store) {
        return storeDAO.addStore(store);
    }

    @Override
    public int updateStoreInfo(Store store) {
        return storeDAO.updateStoreInfo(store);
    }

    @Override
    public int deleteStore(Integer id) {
        return storeDAO.deleteStore(id);
    }
}
