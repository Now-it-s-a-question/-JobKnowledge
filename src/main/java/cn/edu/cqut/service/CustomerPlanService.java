package cn.edu.cqut.service;

import cn.edu.cqut.entity.CustomerPlan;
import cn.edu.cqut.util.CrmResult;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 
 * @since 2020-06-08
 */
public interface CustomerPlanService extends IService<CustomerPlan> {

    CrmResult<CustomerPlan> getCustomerPlanById(int id);
}
