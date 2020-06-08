package cn.edu.cqut.service.impl;

import cn.edu.cqut.entity.Contact;
import cn.edu.cqut.dao.ContactMapper;
import cn.edu.cqut.service.IContactService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Glorious
 * @since 2020-06-08
 */
@Service
public class ContactServiceImpl extends ServiceImpl<ContactMapper, Contact> implements IContactService {

	@Override
	public List<Contact> getContactListByCusNo(String cusNo) {
		return baseMapper.selectContactByCusNo(cusNo);
	}
}
