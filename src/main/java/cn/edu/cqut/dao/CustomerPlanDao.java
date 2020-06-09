package cn.edu.cqut.dao;

import cn.edu.cqut.entity.CustomerPlan;
import cn.edu.cqut.util.CrmResult;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 
 * @since 2020-06-08
 */
public interface CustomerPlanDao extends BaseMapper<CustomerPlan> {

    @Select("select * from customer_plan where id = #{id}")
    CustomerPlan selectCustomerPlanById(@Param("id") int id);

}
