package com.example.tcm.service.impl;

import com.example.tcm.dao.StoreDAO;
import com.example.tcm.pojo.Store;
import com.example.tcm.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreSerciceImpl implements StoreService {
    @Autowired
    private StoreDAO storeDAO;

    @Override
    public Store getStoreInfoById(Integer id) {
        return storeDAO.getStoreInfoById(id);
    }
}
