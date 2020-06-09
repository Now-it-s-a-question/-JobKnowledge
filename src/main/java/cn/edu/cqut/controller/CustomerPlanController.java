package cn.edu.cqut.controller;


import cn.edu.cqut.entity.CustomerPlan;
import cn.edu.cqut.service.CustomerPlanService;
import cn.edu.cqut.util.CrmResult;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.format.DateTimeFormatter;
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
public class CustomerPlanController {
	@Autowired
	private CustomerPlanService customerPlanService;

    @PostMapping("delete")
    private CrmResult<CustomerPlan> delete(Integer[] ids) {
        CrmResult<CustomerPlan> result = new CrmResult<>();

        customerPlanService.removeByIds(Arrays.asList(ids));
        result.setCode(0);
        result.setMsg("删除成功");
        return result;
    }

    @PostMapping("update")
    private CrmResult<CustomerPlan> update(CustomerPlan customerPlan) {
        CrmResult<CustomerPlan> result = new CrmResult<>();
        customerPlanService.updateById(customerPlan);
        result.setCode(0);
        result.setMsg("更新成功");
        return result;
    }
	@GetMapping("customerPlans")
	private List<CustomerPlan> customerPlans(@RequestParam(defaultValue = "1") Integer page,
											 @RequestParam(defaultValue = "10") Integer limit) {

		Page<CustomerPlan> pageCustomer = customerPlanService.page(new Page<>(page, limit));
		return new ArrayList<>(pageCustomer.getRecords());
	}

	@GetMapping("/getcustomerplan")
	private CrmResult<CustomerPlan> customerPlan(int id) {
		return customerPlanService.getCustomerPlanById(id);
	}

	@PostMapping("/addcustomerplan")
	private CrmResult<CustomerPlan> addCustomerPlan(CustomerPlan customerPlan) {
		customerPlanService.save(customerPlan);
		CrmResult<CustomerPlan> result = new CrmResult<>();
		result.setCode(0);
		result.setMsg("添加成功");
		return result;
	}

}

