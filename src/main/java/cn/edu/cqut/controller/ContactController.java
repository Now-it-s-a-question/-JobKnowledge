package cn.edu.cqut.controller;


import cn.edu.cqut.entity.Contact;
import cn.edu.cqut.service.IContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Glorious
 * @since 2020-06-08
 */
@RestController
@RequestMapping("/contact")
public class ContactController {
	@Autowired
	private IContactService contactService;

	@RequestMapping(value="/getContactByCusNo",method = RequestMethod.POST)
	public List<Contact> getContactByCusNo(String cusNo){
		return contactService.getContactListByCusNo(cusNo);
	}

}

