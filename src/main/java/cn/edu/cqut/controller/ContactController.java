package cn.edu.cqut.controller;


import cn.edu.cqut.entity.Contact;
import cn.edu.cqut.service.IContactService;
import cn.edu.cqut.util.CrmResult;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Glorious
 * @since 2020-06-08
 */
@RestController
@RequestMapping("/contact")
@CrossOrigin
@Api(tags = "客户联系人管理")
public class ContactController {
	@Autowired
	private IContactService contactService;

	@RequestMapping(value = "/getContactByCusNo", method = RequestMethod.POST)
	public List<Contact> getContactByCusNo(String cusNo) {
		return contactService.getContactListByCusNo(cusNo);
	}

	@GetMapping("/contacts")
	@ApiOperation(value = "分页返回客户联系人信息",
	notes = "分页查询，默认返回第一页，每页10行")
	private CrmResult<Contact> contacts(
			@ApiParam(value = "要查询的页码",required = true)
			@RequestParam(defaultValue = "1") Integer page
			,
			@ApiParam(value = "每页显示的数据条数",required = true)
			@RequestParam(defaultValue = "10") Integer limit) {
		CrmResult<Contact> result = new CrmResult<>();
		Page<Contact> contactPage = contactService.page(new Page<>(page, limit));
		result.setCode(0);
		result.setMsg("");
		result.setData(contactPage.getRecords());
		return result;
	}

	@PostMapping("update")
	@ApiOperation("根据id更新客户联系人")
	private CrmResult<Contact> update(Contact contact) {
		CrmResult<Contact> result = new CrmResult<>();
		contactService.updateById(contact);
		result.setCode(0);
		result.setMsg("修改成功");
		return result;
	}

	@PostMapping("insert")
	@ApiOperation("新增客户联系人")
	private CrmResult<Contact> insert(Contact contact) {
		CrmResult<Contact> result = new CrmResult<>();
		contactService.save(contact);
		result.setCode(0);
		result.setMsg("插入成功");
		return result;
	}

	@GetMapping("remove")
	@ApiOperation("删除客户联系人")
	private CrmResult<Contact> remove(String[] ids) {
		CrmResult<Contact> result = new CrmResult<>();
		contactService.removeByIds(Arrays.asList(ids));
//		for (int i = 0; i < ids.length; i++) {
//			contactService.remove(new QueryWrapper<Contact>().eq("cosNo",ids.ge));
//		}
//		if (!success){
//			result.setCode(-1);
//			result.setMsg("失败");
//			return result;
//		}
		result.setMsg("删除成功");
		result.setCode(0);
		return result;
	}
}

