package cn.edu.cqut.dao;

import cn.edu.cqut.entity.Contact;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import net.sf.jsqlparser.expression.operators.arithmetic.Concat;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Glorious
 * @since 2020-06-08
 */
public interface ContactMapper extends BaseMapper<Contact> {
	@Select("select * from contact where cusNo=#{cusNo}")
	List<Contact> selectContactByCusNo(String cusNo);

	Concat getOne();
}
