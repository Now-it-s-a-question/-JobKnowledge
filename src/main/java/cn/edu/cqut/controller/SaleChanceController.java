package cn.edu.cqut.controller;


import cn.edu.cqut.service.SaleChanceService;
import cn.edu.cqut.service.impl.SaleChanceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Action;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Glorious
 * @since 2020-06-08
 */
@RestController
@RequestMapping("/saleChance")
public class SaleChanceController {
    @Autowired
    private SaleChanceService saleChanceService;

}

