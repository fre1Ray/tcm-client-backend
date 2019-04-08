package com.example.tcm.controller;


import com.example.tcm.pojo.AjaxMessage;
import com.example.tcm.pojo.Commodity;
import com.example.tcm.pojo.TableData;
import com.example.tcm.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CommodityController {
    @Autowired
    private CommodityService commodityService;

    public TableData list(Commodity commodity, Integer page, Integer limit) {
        List<Commodity> commodities = commodityService.getAllCommodity(commodity);
        return new TableData();
    }

    public AjaxMessage edit(Commodity commodity, Integer id) {
        if (id == null) {
            commodityService.addCommodity(commodity);
            return new AjaxMessage(true, "返回成功");
        } else {
            commodity.setId(id);
            commodityService.updateCommodity(commodity);
            return new AjaxMessage(true, "返回成功");
        }
    }

    public AjaxMessage delete(Integer id) {
        commodityService.deleteCommodity(id);
        return new AjaxMessage(true, "返回成功");
    }
}

