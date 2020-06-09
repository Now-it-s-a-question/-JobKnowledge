package cn.edu.cqut.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author Glorious
 * @since 2020-06-08
 */
@ApiModel(value = "Contact对象", description = "管理客户联系人对象")
public class Contact extends Model<Contact> {

	private static final long serialVersionUID = 1L;

	@TableId(value = "ctId", type = IdType.AUTO)
	@ApiModelProperty("客户联系人编号")
	private Integer ctId;
	@ApiModelProperty("客户联系人项目")
	@TableField("ctName")
	private String ctName;

	@ApiModelProperty("客户联系人性别")
	@TableField("ctGender")
	private String ctGender;

	@ApiModelProperty("客户联系人电话")
	@TableField("ctPhone")
	private String ctPhone;

    @ApiModelProperty("客户联系人职位")
    @TableField("ctTitle")
    private String ctTitle;

    @ApiModelProperty("客户联系人xxx")
	@TableField("ctMemo")
	private String ctMemo;

    @ApiModelProperty("客户编号")
	@TableField("cusNo")
	private String cusNo;


	public Integer getCtId() {
		return ctId;
	}

	public void setCtId(Integer ctId) {
		this.ctId = ctId;
	}

	public String getCtName() {
		return ctName;
	}

	public void setCtName(String ctName) {
		this.ctName = ctName;
	}

	public String getCtGender() {
		return ctGender;
	}

	public void setCtGender(String ctGender) {
		this.ctGender = ctGender;
	}

	public String getCtPhone() {
		return ctPhone;
	}

	public void setCtPhone(String ctPhone) {
		this.ctPhone = ctPhone;
	}

	public String getCtTitle() {
		return ctTitle;
	}

	public void setCtTitle(String ctTitle) {
		this.ctTitle = ctTitle;
	}

	public String getCtMemo() {
		return ctMemo;
	}

	public void setCtMemo(String ctMemo) {
		this.ctMemo = ctMemo;
	}

	public String getCusNo() {
		return cusNo;
	}

	public void setCusNo(String cusNo) {
		this.cusNo = cusNo;
	}

	@Override
	protected Serializable pkVal() {
		return this.ctId;
	}

	@Override
	public String toString() {
		return "Contact{" +
				"ctId=" + ctId +
				", ctName=" + ctName +
				", ctGender=" + ctGender +
				", ctPhone=" + ctPhone +
				", ctTitle=" + ctTitle +
				", ctMemo=" + ctMemo +
				", cusNo=" + cusNo +
				"}";
	}
}
