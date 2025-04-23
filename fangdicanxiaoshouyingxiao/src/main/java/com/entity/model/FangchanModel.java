package com.entity.model;

import com.entity.FangchanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 新房信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class FangchanModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 新房名称
     */
    private String fangchanName;


    /**
     * 新房类型
     */
    private Integer fangchanTypes;


    /**
     * 新房图片
     */
    private String fangchanPhoto;


    /**
     * 楼层
     */
    private String fangchanLouceng;


    /**
     * 面积
     */
    private String fangchanMianji;


    /**
     * 价格
     */
    private Double fangchanNewMoney;


    /**
     * 新房介绍
     */
    private String fangchanContent;


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
	 * 获取：新房名称
	 */
    public String getFangchanName() {
        return fangchanName;
    }


    /**
	 * 设置：新房名称
	 */
    public void setFangchanName(String fangchanName) {
        this.fangchanName = fangchanName;
    }
    /**
	 * 获取：新房类型
	 */
    public Integer getFangchanTypes() {
        return fangchanTypes;
    }


    /**
	 * 设置：新房类型
	 */
    public void setFangchanTypes(Integer fangchanTypes) {
        this.fangchanTypes = fangchanTypes;
    }
    /**
	 * 获取：新房图片
	 */
    public String getFangchanPhoto() {
        return fangchanPhoto;
    }


    /**
	 * 设置：新房图片
	 */
    public void setFangchanPhoto(String fangchanPhoto) {
        this.fangchanPhoto = fangchanPhoto;
    }
    /**
	 * 获取：楼层
	 */
    public String getFangchanLouceng() {
        return fangchanLouceng;
    }


    /**
	 * 设置：楼层
	 */
    public void setFangchanLouceng(String fangchanLouceng) {
        this.fangchanLouceng = fangchanLouceng;
    }
    /**
	 * 获取：面积
	 */
    public String getFangchanMianji() {
        return fangchanMianji;
    }


    /**
	 * 设置：面积
	 */
    public void setFangchanMianji(String fangchanMianji) {
        this.fangchanMianji = fangchanMianji;
    }
    /**
	 * 获取：价格
	 */
    public Double getFangchanNewMoney() {
        return fangchanNewMoney;
    }


    /**
	 * 设置：价格
	 */
    public void setFangchanNewMoney(Double fangchanNewMoney) {
        this.fangchanNewMoney = fangchanNewMoney;
    }
    /**
	 * 获取：新房介绍
	 */
    public String getFangchanContent() {
        return fangchanContent;
    }


    /**
	 * 设置：新房介绍
	 */
    public void setFangchanContent(String fangchanContent) {
        this.fangchanContent = fangchanContent;
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
