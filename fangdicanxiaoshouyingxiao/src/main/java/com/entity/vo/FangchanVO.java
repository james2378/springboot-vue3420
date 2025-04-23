package com.entity.vo;

import com.entity.FangchanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 新房信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("fangchan")
public class FangchanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 新房名称
     */

    @TableField(value = "fangchan_name")
    private String fangchanName;


    /**
     * 新房类型
     */

    @TableField(value = "fangchan_types")
    private Integer fangchanTypes;


    /**
     * 新房图片
     */

    @TableField(value = "fangchan_photo")
    private String fangchanPhoto;


    /**
     * 楼层
     */

    @TableField(value = "fangchan_louceng")
    private String fangchanLouceng;


    /**
     * 面积
     */

    @TableField(value = "fangchan_mianji")
    private String fangchanMianji;


    /**
     * 价格
     */

    @TableField(value = "fangchan_new_money")
    private Double fangchanNewMoney;


    /**
     * 新房介绍
     */

    @TableField(value = "fangchan_content")
    private String fangchanContent;


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
	 * 设置：新房名称
	 */
    public String getFangchanName() {
        return fangchanName;
    }


    /**
	 * 获取：新房名称
	 */

    public void setFangchanName(String fangchanName) {
        this.fangchanName = fangchanName;
    }
    /**
	 * 设置：新房类型
	 */
    public Integer getFangchanTypes() {
        return fangchanTypes;
    }


    /**
	 * 获取：新房类型
	 */

    public void setFangchanTypes(Integer fangchanTypes) {
        this.fangchanTypes = fangchanTypes;
    }
    /**
	 * 设置：新房图片
	 */
    public String getFangchanPhoto() {
        return fangchanPhoto;
    }


    /**
	 * 获取：新房图片
	 */

    public void setFangchanPhoto(String fangchanPhoto) {
        this.fangchanPhoto = fangchanPhoto;
    }
    /**
	 * 设置：楼层
	 */
    public String getFangchanLouceng() {
        return fangchanLouceng;
    }


    /**
	 * 获取：楼层
	 */

    public void setFangchanLouceng(String fangchanLouceng) {
        this.fangchanLouceng = fangchanLouceng;
    }
    /**
	 * 设置：面积
	 */
    public String getFangchanMianji() {
        return fangchanMianji;
    }


    /**
	 * 获取：面积
	 */

    public void setFangchanMianji(String fangchanMianji) {
        this.fangchanMianji = fangchanMianji;
    }
    /**
	 * 设置：价格
	 */
    public Double getFangchanNewMoney() {
        return fangchanNewMoney;
    }


    /**
	 * 获取：价格
	 */

    public void setFangchanNewMoney(Double fangchanNewMoney) {
        this.fangchanNewMoney = fangchanNewMoney;
    }
    /**
	 * 设置：新房介绍
	 */
    public String getFangchanContent() {
        return fangchanContent;
    }


    /**
	 * 获取：新房介绍
	 */

    public void setFangchanContent(String fangchanContent) {
        this.fangchanContent = fangchanContent;
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
