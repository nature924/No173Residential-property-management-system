package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GoumaicheweiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GoumaicheweiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GoumaicheweiView;


/**
 * 购买车位
 *
 * @author 
 * @email 
 * @date 2023-01-26 18:34:57
 */
public interface GoumaicheweiService extends IService<GoumaicheweiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GoumaicheweiVO> selectListVO(Wrapper<GoumaicheweiEntity> wrapper);
   	
   	GoumaicheweiVO selectVO(@Param("ew") Wrapper<GoumaicheweiEntity> wrapper);
   	
   	List<GoumaicheweiView> selectListView(Wrapper<GoumaicheweiEntity> wrapper);
   	
   	GoumaicheweiView selectView(@Param("ew") Wrapper<GoumaicheweiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GoumaicheweiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<GoumaicheweiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<GoumaicheweiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<GoumaicheweiEntity> wrapper);



}

