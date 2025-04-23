package com.entity.view;

import com.entity.FangchanCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 新房收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("fangchan_collection")
public class FangchanCollectionView extends FangchanCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String fangchanCollectionValue;



		//级联表 fangchan
			/**
			* 新房名称
			*/
			private String fangchanName;
			/**
			* 新房类型
			*/
			private Integer fangchanTypes;
				/**
				* 新房类型的值
				*/
				private String fangchanValue;
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

	public FangchanCollectionView() {

	}

	public FangchanCollectionView(FangchanCollectionEntity fangchanCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, fangchanCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getFangchanCollectionValue() {
				return fangchanCollectionValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setFangchanCollectionValue(String fangchanCollectionValue) {
				this.fangchanCollectionValue = fangchanCollectionValue;
			}







				//级联表的get和set fangchan

					/**
					* 获取： 新房名称
					*/
					public String getFangchanName() {
						return fangchanName;
					}
					/**
					* 设置： 新房名称
					*/
					public void setFangchanName(String fangchanName) {
						this.fangchanName = fangchanName;
					}

					/**
					* 获取： 新房类型
					*/
					public Integer getFangchanTypes() {
						return fangchanTypes;
					}
					/**
					* 设置： 新房类型
					*/
					public void setFangchanTypes(Integer fangchanTypes) {
						this.fangchanTypes = fangchanTypes;
					}


						/**
						* 获取： 新房类型的值
						*/
						public String getFangchanValue() {
							return fangchanValue;
						}
						/**
						* 设置： 新房类型的值
						*/
						public void setFangchanValue(String fangchanValue) {
							this.fangchanValue = fangchanValue;
						}

					/**
					* 获取： 新房图片
					*/
					public String getFangchanPhoto() {
						return fangchanPhoto;
					}
					/**
					* 设置： 新房图片
					*/
					public void setFangchanPhoto(String fangchanPhoto) {
						this.fangchanPhoto = fangchanPhoto;
					}

					/**
					* 获取： 楼层
					*/
					public String getFangchanLouceng() {
						return fangchanLouceng;
					}
					/**
					* 设置： 楼层
					*/
					public void setFangchanLouceng(String fangchanLouceng) {
						this.fangchanLouceng = fangchanLouceng;
					}

					/**
					* 获取： 面积
					*/
					public String getFangchanMianji() {
						return fangchanMianji;
					}
					/**
					* 设置： 面积
					*/
					public void setFangchanMianji(String fangchanMianji) {
						this.fangchanMianji = fangchanMianji;
					}

					/**
					* 获取： 价格
					*/
					public Double getFangchanNewMoney() {
						return fangchanNewMoney;
					}
					/**
					* 设置： 价格
					*/
					public void setFangchanNewMoney(Double fangchanNewMoney) {
						this.fangchanNewMoney = fangchanNewMoney;
					}

					/**
					* 获取： 新房介绍
					*/
					public String getFangchanContent() {
						return fangchanContent;
					}
					/**
					* 设置： 新房介绍
					*/
					public void setFangchanContent(String fangchanContent) {
						this.fangchanContent = fangchanContent;
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
