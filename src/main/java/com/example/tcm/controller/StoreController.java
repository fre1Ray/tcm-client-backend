package com.example.tcm.controller;

import com.example.tcm.pojo.Store;
import com.example.tcm.service.StoreService;
import com.example.tcm.util.ApiException;
import com.example.tcm.util.ErrorConstants;
import com.example.tcm.util.ResponseTO;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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
    @RequestMapping(value = "/store/{id}", method = RequestMethod.GET)
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

    /**
     * 根据条件进行查询
     *
     * @param store
     * @return
     * @throws ApiException
     */
    @GetMapping("/store/search")
    public ResponseTO getStore(Store store, Integer page, Integer limit) throws ApiException {
        if (page == null) {
            page = 1;
        }
        limit = 10;
        PageInfo<Store> storeInfo = storeService.getStore(store, page, limit);
        ResponseTO responseTO = new ResponseTO();
        responseTO.setResult(storeInfo);
        return responseTO;
    }

    /**
     * 添加店家
     *
     * @param store
     * @return
     * @throws ApiException
     */
    @PostMapping("/store/add")
    public ResponseTO AddStore(Store store) throws ApiException {
        int i = storeService.addStore(store);
        if (i == 0) { // 添加店家失败
            throw new ApiException(ErrorConstants.ADD_STORE_FAILED);
        }
        ResponseTO responseTO = new ResponseTO();
        responseTO.setResult("添加成功");
        return responseTO;
    }

    /**
     * 修改店家信息
     *
     * @param store
     * @return
     * @throws ApiException
     */
    @RequestMapping(value = "/store/modify", method = RequestMethod.PUT)
    public ResponseTO updateStore(Store store) throws ApiException {
        int i = storeService.updateStoreInfo(store);
        if (i == 0) { // 更新店家失败
            throw new ApiException(ErrorConstants.UPDATE_STORE_FAILED);
        }
        ResponseTO responseTO = new ResponseTO();
        responseTO.setResult("更新成功");
        return responseTO;
    }

    /**
     * 删除店家信息
     *
     * @param id
     * @return
     * @throws ApiException
     */
    @DeleteMapping("/store/{id}")
    public ResponseTO deleteStore(@PathVariable Integer id) throws ApiException {
        int i = storeService.deleteStore(id);
        if (i == 0) { // 更新店家失败
            throw new ApiException(ErrorConstants.DELETE_STORE_FAILED);
        }
        ResponseTO responseTO = new ResponseTO();
        responseTO.setResult("删除成功");
        return responseTO;

    }

}
