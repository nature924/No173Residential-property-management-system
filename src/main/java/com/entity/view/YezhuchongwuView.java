package com.entity.view;

import com.entity.YezhuchongwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 业主宠物
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-26 18:34:57
 */
@TableName("yezhuchongwu")
public class YezhuchongwuView  extends YezhuchongwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YezhuchongwuView(){
	}
 
 	public YezhuchongwuView(YezhuchongwuEntity yezhuchongwuEntity){
 	try {
			BeanUtils.copyProperties(this, yezhuchongwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
