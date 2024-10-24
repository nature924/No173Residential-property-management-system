package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YezhuchongwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YezhuchongwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YezhuchongwuView;


/**
 * 业主宠物
 *
 * @author 
 * @email 
 * @date 2023-01-26 18:34:57
 */
public interface YezhuchongwuService extends IService<YezhuchongwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YezhuchongwuVO> selectListVO(Wrapper<YezhuchongwuEntity> wrapper);
   	
   	YezhuchongwuVO selectVO(@Param("ew") Wrapper<YezhuchongwuEntity> wrapper);
   	
   	List<YezhuchongwuView> selectListView(Wrapper<YezhuchongwuEntity> wrapper);
   	
   	YezhuchongwuView selectView(@Param("ew") Wrapper<YezhuchongwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YezhuchongwuEntity> wrapper);
   	

}

