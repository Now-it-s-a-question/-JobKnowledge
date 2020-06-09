package cn.edu.cqut.service.impl;

import cn.edu.cqut.entity.CustomerPlan;
import cn.edu.cqut.dao.CustomerPlanDao;
import cn.edu.cqut.service.CustomerPlanService;
import cn.edu.cqut.util.CrmResult;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2020-06-08
 */
@Service
public class CustomerPlanServiceImpl extends ServiceImpl<CustomerPlanDao, CustomerPlan> implements CustomerPlanService {


    @Override
    public CrmResult<CustomerPlan> getCustomerPlanById(int id) {
        CustomerPlan customerPlan = baseMapper.selectCustomerPlanById(id);
        CrmResult<CustomerPlan> result = new CrmResult<>();
        result.setT(customerPlan);
        return result;
    }
}
