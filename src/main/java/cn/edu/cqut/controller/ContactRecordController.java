package cn.edu.cqut.controller;


import cn.edu.cqut.entity.ContactRecord;
import cn.edu.cqut.service.ContactRecordService;
import cn.edu.cqut.util.CrmResult;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Glorious
 * @since 2020-06-09
 */
@RestController
@RequestMapping("/contactRecord")
@CrossOrigin
@Api(tags = "客户交往记录管理")
public class ContactRecordController {
	@Autowired
	private ContactRecordService contactRecordService;

	@GetMapping("/remove")
	@ApiOperation("删除客户交往记录")
	private CrmResult<ContactRecord> remove(Integer[] ids) {
		CrmResult<ContactRecord> result = new CrmResult<>();
		contactRecordService.removeByIds(Arrays.asList(ids));
		result.setCode(0);
		result.setMsg("删除成功");
		return result;
	}

	@PostMapping("/insert")
	@ApiOperation("新增客户交往记录")
	private CrmResult<ContactRecord> insert(ContactRecord contactRecord) {
		CrmResult<ContactRecord> result = new CrmResult<>();
		contactRecordService.save(contactRecord);
		result.setCode(0);
		result.setMsg("新增成功");
		return result;
	}

	@PostMapping("/update")
	@ApiOperation("根据id更新客户交往记录")
	private CrmResult<ContactRecord> update(ContactRecord contactRecord) {
		CrmResult<ContactRecord> result = new CrmResult<>();
		contactRecordService.updateById(contactRecord);
		result.setCode(0);
		result.setMsg("修改成功");
		return result;
	}

	@GetMapping("/contactRecords")
	@ApiOperation("分页返回客户交往记录，默认第一页，每页10行")
	private CrmResult<ContactRecord> contactRecords(
			@ApiParam(value = "要查询的页码",required = true)
			@RequestParam(defaultValue = "1") Integer page
			,
			@ApiParam(value = "要查询的页码",required = true)
			@RequestParam(defaultValue = "10") Integer limit) {
		CrmResult<ContactRecord> result = new CrmResult<>();
		Page<ContactRecord> contactRecordPage = contactRecordService.page(new Page<>(page, limit));
		result.setCode(0);
		result.setData(contactRecordPage.getRecords());
		return result;
	}
}

