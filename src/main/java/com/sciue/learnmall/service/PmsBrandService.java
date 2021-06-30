package com.sciue.learnmall.service;

import com.sciue.learnmall.mbg.model.PmsBrand;

import java.util.List;

/**
 * 品牌业务控制层
 */
public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand pmsBrand);

    int updateBrand(Long id,PmsBrand pmsBrand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
