package cn.edu.cqut.controller;


import cn.edu.cqut.entity.SaleChance;
import cn.edu.cqut.service.SaleChanceService;
import cn.edu.cqut.util.CrmResult;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

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

    @GetMapping("/delete")
    private CrmResult<SaleChance> delete(Integer[] ids) {
        CrmResult<SaleChance> result = new CrmResult<>();
        saleChanceService.removeByIds(Arrays.asList(ids));
        result.setCode(0);
        result.setMsg("删除成功");
        return result;
    }

    @PostMapping("/update")
    private CrmResult<SaleChance> update(SaleChance saleChance) {
        CrmResult<SaleChance> result = new CrmResult<>();
        saleChanceService.updateById(saleChance);
        result.setCode(0);
        result.setMsg("修改成功");
        return result;
    }
    @GetMapping("/getlist")
    private CrmResult<SaleChance> getList(@RequestParam(defaultValue = "1") Integer page
            , @RequestParam(defaultValue = "10") Integer limit) {

        CrmResult<SaleChance> result = new CrmResult<>();
        Page<SaleChance> chancePage = saleChanceService.page(new Page<>(page, limit));
        result.setCode(0);
        result.setMsg("");
        result.setData(chancePage.getRecords());
        return result;
    }
    @PostMapping("/insert")
    private CrmResult<SaleChance> add(SaleChance saleChance) {

        CrmResult<SaleChance> result = new CrmResult<>();
        saleChanceService.save(saleChance);
        result.setCode(0);
        result.setMsg("新增成功");
        return result;
    }

}