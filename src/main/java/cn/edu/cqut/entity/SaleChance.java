package cn.edu.cqut.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author Glorious
 * @since 2020-06-08
 */
@ApiModel(value = "SaleChance对象", description = "")
public class SaleChance extends Model<SaleChance> {

	private static final long serialVersionUID = 1L;

	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;
	@ApiModelProperty(value = "客户名称")
	private String cusName;


	@ApiModelProperty(value = "机会来源")
	private String sourceOfOpportunity;

	@ApiModelProperty(value = "联系人")
	private String contactPersonName;

	@ApiModelProperty(value = "联系电话")
	private String contactPhone;

	@ApiModelProperty(value = "成功几率")
	private String chanceOfSuccess;

	@ApiModelProperty(value = "概要")
	private String summary;

	@ApiModelProperty(value = "机会描述")
	private String opportunityDescription;

	@ApiModelProperty(value = "创建人")
	private String founder;

	@ApiModelProperty(value = "创建时间")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date createTime;

	@ApiModelProperty(value = "指派给")
	private String toWhom;

	@ApiModelProperty(value = "指派时间")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date toWhomTime;

	@ApiModelProperty(value = "状态，0为已分配，1为位分配")
	private Integer status;

	@Override
	public String toString() {
		return "SaleChance{" +
				"id=" + id +
				", cusName='" + cusName + '\'' +
				", sourceOfOpportunity='" + sourceOfOpportunity + '\'' +
				", contactPersonName='" + contactPersonName + '\'' +
				", contactPhone='" + contactPhone + '\'' +
				", chanceOfSuccess='" + chanceOfSuccess + '\'' +
				", summary='" + summary + '\'' +
				", opportunityDescription='" + opportunityDescription + '\'' +
				", founder='" + founder + '\'' +
				", createTime=" + createTime +
				", toWhom='" + toWhom + '\'' +
				", toWhomTime=" + toWhomTime +
				", status=" + status +
				'}';
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public String getSourceOfOpportunity() {
		return sourceOfOpportunity;
	}

	public void setSourceOfOpportunity(String sourceOfOpportunity) {
		this.sourceOfOpportunity = sourceOfOpportunity;
	}

	public String getContactPersonName() {
		return contactPersonName;
	}

	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getChanceOfSuccess() {
		return chanceOfSuccess;
	}

	public void setChanceOfSuccess(String chanceOfSuccess) {
		this.chanceOfSuccess = chanceOfSuccess;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getOpportunityDescription() {
		return opportunityDescription;
	}

	public void setOpportunityDescription(String opportunityDescription) {
		this.opportunityDescription = opportunityDescription;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getToWhom() {
		return toWhom;
	}

	public void setToWhom(String toWhom) {
		this.toWhom = toWhom;
	}

	public Date getToWhomTime() {
		return toWhomTime;
	}

	public void setToWhomTime(Date toWhomTime) {
		this.toWhomTime = toWhomTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}
