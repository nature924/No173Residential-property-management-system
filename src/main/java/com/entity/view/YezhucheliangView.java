package com.entity.view;

import com.entity.YezhucheliangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 业主车辆
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-26 18:34:57
 */
@TableName("yezhucheliang")
public class YezhucheliangView  extends YezhucheliangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YezhucheliangView(){
	}
 
 	public YezhucheliangView(YezhucheliangEntity yezhucheliangEntity){
 	try {
			BeanUtils.copyProperties(this, yezhucheliangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
