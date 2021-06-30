package com.sciue.learnmall.controller;

import com.sciue.learnmall.mbg.mapper.PmsBrandMapper;
import com.sciue.learnmall.service.PmsBrandService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 品牌商家后端控制器
 */

@Controller
@RequestMapping("/brand")
public class PmsBrandController {

    private PmsBrandService brandService;

    private static final Logger LOGGER = LoggerFactory.getLogger(PmsBrandController.class);





}
