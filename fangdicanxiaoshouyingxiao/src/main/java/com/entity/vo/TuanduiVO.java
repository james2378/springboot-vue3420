package com.entity.vo;

import com.entity.TuanduiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 团队信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("tuandui")
public class TuanduiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
