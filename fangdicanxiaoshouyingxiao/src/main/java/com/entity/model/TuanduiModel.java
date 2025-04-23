package com.entity.model;

import com.entity.TuanduiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 团队信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class TuanduiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 团队名称
     */
    private String tuanduiName;


    /**
     * 团队人数
     */
    private Integer tuanduiNumber;


    /**
     * 图片
     */
    private String tuanduiPhoto;


    /**
     * 团队负责人
     */
    private String tuanduiFuzeren;


    /**
     * 团队作用
     */
    private String tuanduiZuoyong;


    /**
     * 团队详情
     */
    private Integer fangdongId;


    /**
     * 详细信息
     */
    private String tuanduiContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：团队名称
	 */
    public String getTuanduiName() {
        return tuanduiName;
    }


    /**
	 * 设置：团队名称
	 */
    public void setTuanduiName(String tuanduiName) {
        this.tuanduiName = tuanduiName;
    }
    /**
	 * 获取：团队人数
	 */
    public Integer getTuanduiNumber() {
        return tuanduiNumber;
    }


    /**
	 * 设置：团队人数
	 */
    public void setTuanduiNumber(Integer tuanduiNumber) {
        this.tuanduiNumber = tuanduiNumber;
    }
    /**
	 * 获取：图片
	 */
    public String getTuanduiPhoto() {
        return tuanduiPhoto;
    }


    /**
	 * 设置：图片
	 */
    public void setTuanduiPhoto(String tuanduiPhoto) {
        this.tuanduiPhoto = tuanduiPhoto;
    }
    /**
	 * 获取：团队负责人
	 */
    public String getTuanduiFuzeren() {
        return tuanduiFuzeren;
    }


    /**
	 * 设置：团队负责人
	 */
    public void setTuanduiFuzeren(String tuanduiFuzeren) {
        this.tuanduiFuzeren = tuanduiFuzeren;
    }
    /**
	 * 获取：团队作用
	 */
    public String getTuanduiZuoyong() {
        return tuanduiZuoyong;
    }


    /**
	 * 设置：团队作用
	 */
    public void setTuanduiZuoyong(String tuanduiZuoyong) {
        this.tuanduiZuoyong = tuanduiZuoyong;
    }
    /**
	 * 获取：团队详情
	 */
    public Integer getFangdongId() {
        return fangdongId;
    }


    /**
	 * 设置：团队详情
	 */
    public void setFangdongId(Integer fangdongId) {
        this.fangdongId = fangdongId;
    }
    /**
	 * 获取：详细信息
	 */
    public String getTuanduiContent() {
        return tuanduiContent;
    }


    /**
	 * 设置：详细信息
	 */
    public void setTuanduiContent(String tuanduiContent) {
        this.tuanduiContent = tuanduiContent;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：录入时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
