package com.example.tcm.service.impl;

import com.example.tcm.dao.CommodityDAO;
import com.example.tcm.pojo.Commodity;
import com.example.tcm.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommodityServiceImpl implements CommodityService {
    @Autowired
    private CommodityDAO commodityDAO;
    @Override
    public Commodity getCommodityById(Integer id) {
        return commodityDAO.getCommodityById(id);
    }

    @Override
    public List<Commodity> getAllCommodity(Commodity commodity) {
        return commodityDAO.getAllCommodity(commodity);
    }

    @Override
    public void addCommodity(Commodity commodity) {
        commodityDAO.addCommodity(commodity);
    }

    @Override
    public void updateCommodity(Commodity commodity) {
        commodityDAO.updateCommodity(commodity);
    }

    @Override
    public void deleteCommodity(Integer id) {
        commodityDAO.deleteCommodity(id);
    }
}
