package com.entity.vo;

import com.entity.XiaoquxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 小区信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-01-26 18:34:57
 */
public class XiaoquxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 小区封面
	 */
	
	private String xiaoqufengmian;
		
	/**
	 * 小区面积
	 */
	
	private String xiaoqumianji;
		
	/**
	 * 小区位置
	 */
	
	private String xiaoquweizhi;
		
	/**
	 * 小区栋数
	 */
	
	private String xiaoqudongshu;
		
	/**
	 * 负责人
	 */
	
	private String fuzeren;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 成立日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chengliriqi;
		
	/**
	 * 小区详情
	 */
	
	private String xiaoquxiangqing;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：小区封面
	 */
	 
	public void setXiaoqufengmian(String xiaoqufengmian) {
		this.xiaoqufengmian = xiaoqufengmian;
	}
	
	/**
	 * 获取：小区封面
	 */
	public String getXiaoqufengmian() {
		return xiaoqufengmian;
	}
				
	
	/**
	 * 设置：小区面积
	 */
	 
	public void setXiaoqumianji(String xiaoqumianji) {
		this.xiaoqumianji = xiaoqumianji;
	}
	
	/**
	 * 获取：小区面积
	 */
	public String getXiaoqumianji() {
		return xiaoqumianji;
	}
				
	
	/**
	 * 设置：小区位置
	 */
	 
	public void setXiaoquweizhi(String xiaoquweizhi) {
		this.xiaoquweizhi = xiaoquweizhi;
	}
	
	/**
	 * 获取：小区位置
	 */
	public String getXiaoquweizhi() {
		return xiaoquweizhi;
	}
				
	
	/**
	 * 设置：小区栋数
	 */
	 
	public void setXiaoqudongshu(String xiaoqudongshu) {
		this.xiaoqudongshu = xiaoqudongshu;
	}
	
	/**
	 * 获取：小区栋数
	 */
	public String getXiaoqudongshu() {
		return xiaoqudongshu;
	}
				
	
	/**
	 * 设置：负责人
	 */
	 
	public void setFuzeren(String fuzeren) {
		this.fuzeren = fuzeren;
	}
	
	/**
	 * 获取：负责人
	 */
	public String getFuzeren() {
		return fuzeren;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：成立日期
	 */
	 
	public void setChengliriqi(Date chengliriqi) {
		this.chengliriqi = chengliriqi;
	}
	
	/**
	 * 获取：成立日期
	 */
	public Date getChengliriqi() {
		return chengliriqi;
	}
				
	
	/**
	 * 设置：小区详情
	 */
	 
	public void setXiaoquxiangqing(String xiaoquxiangqing) {
		this.xiaoquxiangqing = xiaoquxiangqing;
	}
	
	/**
	 * 获取：小区详情
	 */
	public String getXiaoquxiangqing() {
		return xiaoquxiangqing;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
