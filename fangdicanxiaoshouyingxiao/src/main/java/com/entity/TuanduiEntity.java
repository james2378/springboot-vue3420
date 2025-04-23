package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 团队信息
 *
 * @author 
 * @email
 */
@TableName("tuandui")
public class TuanduiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public TuanduiEntity() {

	}

	public TuanduiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 团队名称
     */
    @TableField(value = "tuandui_name")

    private String tuanduiName;


    /**
     * 团队人数
     */
    @TableField(value = "tuandui_number")

    private Integer tuanduiNumber;


    /**
     * 图片
     */
    @TableField(value = "tuandui_photo")

    private String tuanduiPhoto;


    /**
     * 团队负责人
     */
    @TableField(value = "tuandui_fuzeren")

    private String tuanduiFuzeren;


    /**
     * 团队作用
     */
    @TableField(value = "tuandui_zuoyong")

    private String tuanduiZuoyong;


    /**
     * 团队详情
     */
    @TableField(value = "fangdong_id")

    private Integer fangdongId;


    /**
     * 详细信息
     */
    @TableField(value = "tuandui_content")

    private String tuanduiContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：团队名称
	 */
    public String getTuanduiName() {
        return tuanduiName;
    }
    /**
	 * 获取：团队名称
	 */

    public void setTuanduiName(String tuanduiName) {
        this.tuanduiName = tuanduiName;
    }
    /**
	 * 设置：团队人数
	 */
    public Integer getTuanduiNumber() {
        return tuanduiNumber;
    }
    /**
	 * 获取：团队人数
	 */

    public void setTuanduiNumber(Integer tuanduiNumber) {
        this.tuanduiNumber = tuanduiNumber;
    }
    /**
	 * 设置：图片
	 */
    public String getTuanduiPhoto() {
        return tuanduiPhoto;
    }
    /**
	 * 获取：图片
	 */

    public void setTuanduiPhoto(String tuanduiPhoto) {
        this.tuanduiPhoto = tuanduiPhoto;
    }
    /**
	 * 设置：团队负责人
	 */
    public String getTuanduiFuzeren() {
        return tuanduiFuzeren;
    }
    /**
	 * 获取：团队负责人
	 */

    public void setTuanduiFuzeren(String tuanduiFuzeren) {
        this.tuanduiFuzeren = tuanduiFuzeren;
    }
    /**
	 * 设置：团队作用
	 */
    public String getTuanduiZuoyong() {
        return tuanduiZuoyong;
    }
    /**
	 * 获取：团队作用
	 */

    public void setTuanduiZuoyong(String tuanduiZuoyong) {
        this.tuanduiZuoyong = tuanduiZuoyong;
    }
    /**
	 * 设置：团队详情
	 */
    public Integer getFangdongId() {
        return fangdongId;
    }
    /**
	 * 获取：团队详情
	 */

    public void setFangdongId(Integer fangdongId) {
        this.fangdongId = fangdongId;
    }
    /**
	 * 设置：详细信息
	 */
    public String getTuanduiContent() {
        return tuanduiContent;
    }
    /**
	 * 获取：详细信息
	 */

    public void setTuanduiContent(String tuanduiContent) {
        this.tuanduiContent = tuanduiContent;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Tuandui{" +
            "id=" + id +
            ", tuanduiName=" + tuanduiName +
            ", tuanduiNumber=" + tuanduiNumber +
            ", tuanduiPhoto=" + tuanduiPhoto +
            ", tuanduiFuzeren=" + tuanduiFuzeren +
            ", tuanduiZuoyong=" + tuanduiZuoyong +
            ", fangdongId=" + fangdongId +
            ", tuanduiContent=" + tuanduiContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
