package com.example.tcm.controller;

import com.example.tcm.pojo.Store;
import com.example.tcm.service.StoreService;
import com.example.tcm.util.ApiException;
import com.example.tcm.util.ErrorCodeTO;
import com.example.tcm.util.ErrorConstants;
import com.example.tcm.util.ResponseTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreController {
    @Autowired
    private StoreService storeService;

    /**
     * 根据店家id查找
     *
     * @param id
     * @return
     * @throws ApiException
     */
    @RequestMapping("/store/{id}")
    public ResponseTO getStoreInfoById(@PathVariable Integer id) throws ApiException {
        if (id == null) {     //参数异常
            throw new ApiException(ErrorConstants.PARAM_ERROR);
        }
        Store storeInfoById = storeService.getStoreInfoById(id);
        if (storeInfoById == null) { //店家不存在
            throw new ApiException(ErrorConstants.USER_UNEXISTS);
        }
        ResponseTO responseTO = new ResponseTO();
        responseTO.setResult(storeInfoById);
        return responseTO;
    }
}
