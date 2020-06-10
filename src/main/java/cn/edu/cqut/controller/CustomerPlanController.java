package cn.edu.cqut.controller;


import cn.edu.cqut.entity.CustomerPlan;
import cn.edu.cqut.service.CustomerPlanService;
import cn.edu.cqut.util.CrmResult;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author
 * @since 2020-06-08
 */
@RestController
@RequestMapping("/customerPlan")
@Api(tags = "客户开发计划管理")
@CrossOrigin
public class CustomerPlanController {
	@Autowired
	private CustomerPlanService customerPlanService;

	@ApiOperation("删除客户开发计划")
	@PostMapping("delete")
	private CrmResult<CustomerPlan> delete(Integer[] ids) {
		CrmResult<CustomerPlan> result = new CrmResult<>();
		customerPlanService.removeByIds(Arrays.asList(ids));
		result.setCode(0);
		result.setMsg("删除成功");
		return result;
	}

	@ApiOperation("根据id更新数据开发计划")
	@PostMapping("update")
	private CrmResult<CustomerPlan> update(CustomerPlan customerPlan) {
		CrmResult<CustomerPlan> result = new CrmResult<>();
		customerPlanService.updateById(customerPlan);
		result.setCode(0);
		result.setMsg("更新成功");
		return result;
	}

	@ApiOperation("分页返回客户开发计划，默认第一页，每页默认10行")
	@GetMapping("customerPlans")
	private List<CustomerPlan> customerPlans(
			@ApiParam(value = "要查询的页码", required = true)
			@RequestParam(defaultValue = "1") Integer page
			,
			@ApiParam(value = "要查询的页码", required = true)
			@RequestParam(defaultValue = "10") Integer limit) {

		Page<CustomerPlan> pageCustomer = customerPlanService.page(new Page<>(page, limit));
		return new ArrayList<>(pageCustomer.getRecords());
	}

	@ApiOperation("根据id返回客户开发计划")
	@GetMapping("/getcustomerplan")
	private CrmResult<CustomerPlan> customerPlan(
			@ApiParam(
			value = "客户开发计划的id", required = true)
			int id) {
		return customerPlanService.getCustomerPlanById(id);
	}

	@ApiOperation("新增客户开发计划")
	@PostMapping("/addcustomerplan")
	private CrmResult<CustomerPlan> addCustomerPlan(CustomerPlan customerPlan) {
		customerPlanService.save(customerPlan);
		CrmResult<CustomerPlan> result = new CrmResult<>();
		result.setCode(0);
		result.setMsg("添加成功");
		return result;
	}

}

