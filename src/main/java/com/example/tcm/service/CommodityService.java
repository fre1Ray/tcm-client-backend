package com.example.tcm.service;

import com.example.tcm.pojo.Commodity;

import java.util.List;

public interface CommodityService {
    Commodity getCommodityById(Integer id);

    List<Commodity> getAllCommodity(Commodity commodity);

    void addCommodity(Commodity commodity);

    void updateCommodity(Commodity commodity);

    void deleteCommodity(Integer id);
}
