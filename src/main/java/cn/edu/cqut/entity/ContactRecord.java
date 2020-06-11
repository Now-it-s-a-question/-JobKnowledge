package cn.edu.cqut.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author Glorious
 * @since 2020-06-09
 */
@ApiModel(value="ContactRecord对象", description="客户交往记录对象")
public class ContactRecord extends Model<ContactRecord> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty("客户交往记录编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @DateTimeFormat(pattern = "yyyy-DD-mm")
    @JsonFormat(pattern = "yyyy-DD-mm")
    @ApiModelProperty("客户交往记录时间")
    private Date recordDate;

    @ApiModelProperty("客户交往记录地点")
    private String location;

    @ApiModelProperty(value = "交往概要")
    private String title;

    @ApiModelProperty(value = "交往详情")
    private String detail;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ContactRecord{" +
        "id=" + id +
        ", recordDate=" + recordDate +
        ", location=" + location +
        ", title=" + title +
        ", detail=" + detail +
        "}";
    }
}
