package cn.edu.cqut.service;

import cn.edu.cqut.entity.Customer;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author HQYJ
 * @since 2020-06-03
 */
public interface ICustomerService extends IService<Customer> {
	List<Customer> getCustomerWithContact();
}
