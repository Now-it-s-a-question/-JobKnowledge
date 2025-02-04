package cn.edu.cqut.service.impl;

import cn.edu.cqut.entity.Customer;
import cn.edu.cqut.dao.CustomerMapper;
import cn.edu.cqut.service.ICustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author HQYJ
 * @since 2020-06-03
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements ICustomerService {

	@Override
	public List<Customer> getCustomerWithContact() {
		return baseMapper.selectCustomerWithContact();
	}
}
