package com.entity.view;

import com.entity.TuanduiLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 团队留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("tuandui_liuyan")
public class TuanduiLiuyanView extends TuanduiLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 tuandui
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
			* 详细信息
			*/
			private String tuanduiContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 出生日期
			*/
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			private Date yonghuTime;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 照片
			*/
			private String yonghuPhoto;

	public TuanduiLiuyanView() {

	}

	public TuanduiLiuyanView(TuanduiLiuyanEntity tuanduiLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, tuanduiLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

























				//级联表的get和set tuandui

					/**
					* 获取： 团队名称
					*/
					public String getTuanduiName() {
						return tuanduiName;
					}
					/**
					* 设置： 团队名称
					*/
					public void setTuanduiName(String tuanduiName) {
						this.tuanduiName = tuanduiName;
					}

					/**
					* 获取： 团队人数
					*/
					public Integer getTuanduiNumber() {
						return tuanduiNumber;
					}
					/**
					* 设置： 团队人数
					*/
					public void setTuanduiNumber(Integer tuanduiNumber) {
						this.tuanduiNumber = tuanduiNumber;
					}

					/**
					* 获取： 图片
					*/
					public String getTuanduiPhoto() {
						return tuanduiPhoto;
					}
					/**
					* 设置： 图片
					*/
					public void setTuanduiPhoto(String tuanduiPhoto) {
						this.tuanduiPhoto = tuanduiPhoto;
					}

					/**
					* 获取： 团队负责人
					*/
					public String getTuanduiFuzeren() {
						return tuanduiFuzeren;
					}
					/**
					* 设置： 团队负责人
					*/
					public void setTuanduiFuzeren(String tuanduiFuzeren) {
						this.tuanduiFuzeren = tuanduiFuzeren;
					}

					/**
					* 获取： 团队作用
					*/
					public String getTuanduiZuoyong() {
						return tuanduiZuoyong;
					}
					/**
					* 设置： 团队作用
					*/
					public void setTuanduiZuoyong(String tuanduiZuoyong) {
						this.tuanduiZuoyong = tuanduiZuoyong;
					}


					/**
					* 获取： 详细信息
					*/
					public String getTuanduiContent() {
						return tuanduiContent;
					}
					/**
					* 设置： 详细信息
					*/
					public void setTuanduiContent(String tuanduiContent) {
						this.tuanduiContent = tuanduiContent;
					}







				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 出生日期
					*/
					public Date getYonghuTime() {
						return yonghuTime;
					}
					/**
					* 设置： 出生日期
					*/
					public void setYonghuTime(Date yonghuTime) {
						this.yonghuTime = yonghuTime;
					}

					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}



}
