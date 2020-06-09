package cn.edu.cqut.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 
 * </p>
 *
 *
 * @author Glorious
 * @since 2020-06-08
 */
@ApiModel(value="CustomerPlan对象", description="客户开发计划对象")
@TableName("customer_plan")
public class CustomerPlan extends Model<CustomerPlan> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty("客户开发计划Id")
    @TableId(value = "id", type = IdType.AUTO)
    @TableField("id")
    private Integer id;

    @ApiModelProperty("销售计划Id,外键")
    @TableField("sale_chance_id")
    private Integer saleChanceId;

    @ApiModelProperty("客户开发计划时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date planDate;

    @ApiModelProperty("客户开发计划详情")
    private String plan;

    @ApiModelProperty("客户开发状态")
    private String status;
    @TableField(exist = false)
    private List<Customer> customers;

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSaleChanceId() {
        return saleChanceId;
    }

    public void setSaleChanceId(Integer saleChanceId) {
        this.saleChanceId = saleChanceId;
    }

    public Date getPlanDate() {
        return planDate;
    }

    public void setPlanDate(Date planDate) {
        this.planDate = planDate;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "CustomerPlan{" +
        "id=" + id +
        ", saleChanceId=" + saleChanceId +
        ", planDate=" + planDate +
        ", plan=" + plan +
        ", status=" + status +
        "}";
    }
}
