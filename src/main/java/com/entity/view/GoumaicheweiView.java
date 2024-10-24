package com.entity.view;

import com.entity.GoumaicheweiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 购买车位
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-26 18:34:57
 */
@TableName("goumaichewei")
public class GoumaicheweiView  extends GoumaicheweiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GoumaicheweiView(){
	}
 
 	public GoumaicheweiView(GoumaicheweiEntity goumaicheweiEntity){
 	try {
			BeanUtils.copyProperties(this, goumaicheweiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
