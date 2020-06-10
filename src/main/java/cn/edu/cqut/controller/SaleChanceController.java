package cn.edu.cqut.controller;


import cn.edu.cqut.entity.SaleChance;
import cn.edu.cqut.service.SaleChanceService;
import cn.edu.cqut.util.CrmResult;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Glorious
 * @since 2020-06-08
 */
@RestController
@RequestMapping("/saleChance")
@Api("销售机会管理")
@CrossOrigin
public class SaleChanceController {
	@Autowired
	private SaleChanceService saleChanceService;

	@ApiOperation("删除销售机会")
	@GetMapping("/delete")
	private CrmResult<SaleChance> delete(Integer[] ids) {
		CrmResult<SaleChance> result = new CrmResult<>();
		saleChanceService.removeByIds(Arrays.asList(ids));
		result.setCode(0);
		result.setMsg("删除成功");
		return result;
	}

	@ApiOperation("根据id更新销售机会")
	@PostMapping("/update")
	private CrmResult<SaleChance> update(SaleChance saleChance) {
		CrmResult<SaleChance> result = new CrmResult<>();
		saleChanceService.updateById(saleChance);
		result.setCode(0);
		result.setMsg("修改成功");
		return result;
	}

	@ApiOperation("分页返回客户销售计划")
	@GetMapping("/getlist")
	private CrmResult<SaleChance> getList(
			@ApiParam(value = "要查询的页码", required = true)
			@RequestParam(defaultValue = "1") Integer page
			,
			@ApiParam(value = "要查询的页码", required = true)
			@RequestParam(defaultValue = "10") Integer limit
	,SaleChance saleChance) {
		CrmResult<SaleChance> result = new CrmResult<>();
		QueryWrapper<SaleChance> wrapper = new QueryWrapper<>();
		if (saleChance.getStatus() != null) {
			wrapper.lambda().like(SaleChance::getStatus, saleChance.getStatus());
		}
		Page<SaleChance> chancePage = saleChanceService.page(new Page<>(page, limit),wrapper);
		result.setCode(0);
		result.setMsg("");
		//表里的记录总数
		result.setCount(chancePage.getTotal());
		//这页的数据列表
		result.setData(chancePage.getRecords());
		return result;
	}

	@ApiOperation("新增客户开发计划")
	@PostMapping("/insert")
	private CrmResult<SaleChance> add(SaleChance saleChance) {

		CrmResult<SaleChance> result = new CrmResult<>();
		saleChanceService.save(saleChance);
		result.setCode(0);
		result.setMsg("新增成功");
		return result;
	}

}