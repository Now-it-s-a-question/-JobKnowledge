package cn.edu.cqut.service;

import cn.edu.cqut.entity.Contact;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Glorious
 * @since 2020-06-08
 */
public interface IContactService extends IService<Contact> {

	List<Contact> getContactListByCusNo(String cusNo);
}
