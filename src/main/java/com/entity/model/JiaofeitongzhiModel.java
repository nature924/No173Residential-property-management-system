package com.entity.model;

import com.entity.JiaofeitongzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 缴费通知
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-01-26 18:34:57
 */
public class JiaofeitongzhiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 楼房号
	 */
	
	private String loufanghao;
		
	/**
	 * 小区名称
	 */
	
	private String xiaoqumingcheng;
		
	/**
	 * 收费项目
	 */
	
	private String shoufeixiangmu;
		
	/**
	 * 费用
	 */
	
	private Float feiyong;
		
	/**
	 * 费用详情
	 */
	
	private String feiyongxiangqing;
		
	/**
	 * 通知时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tongzhishijian;
		
	/**
	 * 物业工号
	 */
	
	private String wuyegonghao;
		
	/**
	 * 物业姓名
	 */
	
	private String wuyexingming;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：楼房号
	 */
	 
	public void setLoufanghao(String loufanghao) {
		this.loufanghao = loufanghao;
	}
	
	/**
	 * 获取：楼房号
	 */
	public String getLoufanghao() {
		return loufanghao;
	}
				
	
	/**
	 * 设置：小区名称
	 */
	 
	public void setXiaoqumingcheng(String xiaoqumingcheng) {
		this.xiaoqumingcheng = xiaoqumingcheng;
	}
	
	/**
	 * 获取：小区名称
	 */
	public String getXiaoqumingcheng() {
		return xiaoqumingcheng;
	}
				
	
	/**
	 * 设置：收费项目
	 */
	 
	public void setShoufeixiangmu(String shoufeixiangmu) {
		this.shoufeixiangmu = shoufeixiangmu;
	}
	
	/**
	 * 获取：收费项目
	 */
	public String getShoufeixiangmu() {
		return shoufeixiangmu;
	}
				
	
	/**
	 * 设置：费用
	 */
	 
	public void setFeiyong(Float feiyong) {
		this.feiyong = feiyong;
	}
	
	/**
	 * 获取：费用
	 */
	public Float getFeiyong() {
		return feiyong;
	}
				
	
	/**
	 * 设置：费用详情
	 */
	 
	public void setFeiyongxiangqing(String feiyongxiangqing) {
		this.feiyongxiangqing = feiyongxiangqing;
	}
	
	/**
	 * 获取：费用详情
	 */
	public String getFeiyongxiangqing() {
		return feiyongxiangqing;
	}
				
	
	/**
	 * 设置：通知时间
	 */
	 
	public void setTongzhishijian(Date tongzhishijian) {
		this.tongzhishijian = tongzhishijian;
	}
	
	/**
	 * 获取：通知时间
	 */
	public Date getTongzhishijian() {
		return tongzhishijian;
	}
				
	
	/**
	 * 设置：物业工号
	 */
	 
	public void setWuyegonghao(String wuyegonghao) {
		this.wuyegonghao = wuyegonghao;
	}
	
	/**
	 * 获取：物业工号
	 */
	public String getWuyegonghao() {
		return wuyegonghao;
	}
				
	
	/**
	 * 设置：物业姓名
	 */
	 
	public void setWuyexingming(String wuyexingming) {
		this.wuyexingming = wuyexingming;
	}
	
	/**
	 * 获取：物业姓名
	 */
	public String getWuyexingming() {
		return wuyexingming;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
