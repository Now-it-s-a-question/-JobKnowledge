package cn.edu.cqut.dao;

import cn.edu.cqut.entity.Customer;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author HQYJ
 * @since 2020-06-03
 */
public interface CustomerMapper extends BaseMapper<Customer> {
	@Select("select * from customer")
	@Results({
			@Result(column = "cusNo",property = "cusNo"),
			@Result(column = "cusNo",property = "contacts",many = @Many(
					select = "cn.edu.cqut.dao.ContactMapper.selectContactByCusNo",
					fetchType = FetchType.EAGER))
	})
	List<Customer> selectCustomerWithContact();
}
