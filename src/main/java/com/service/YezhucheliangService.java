package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YezhucheliangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YezhucheliangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YezhucheliangView;


/**
 * 业主车辆
 *
 * @author 
 * @email 
 * @date 2023-01-26 18:34:57
 */
public interface YezhucheliangService extends IService<YezhucheliangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YezhucheliangVO> selectListVO(Wrapper<YezhucheliangEntity> wrapper);
   	
   	YezhucheliangVO selectVO(@Param("ew") Wrapper<YezhucheliangEntity> wrapper);
   	
   	List<YezhucheliangView> selectListView(Wrapper<YezhucheliangEntity> wrapper);
   	
   	YezhucheliangView selectView(@Param("ew") Wrapper<YezhucheliangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YezhucheliangEntity> wrapper);
   	

}

