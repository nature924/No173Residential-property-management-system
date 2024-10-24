package com.dao;

import com.entity.YezhucheliangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YezhucheliangVO;
import com.entity.view.YezhucheliangView;


/**
 * 业主车辆
 * 
 * @author 
 * @email 
 * @date 2023-01-26 18:34:57
 */
public interface YezhucheliangDao extends BaseMapper<YezhucheliangEntity> {
	
	List<YezhucheliangVO> selectListVO(@Param("ew") Wrapper<YezhucheliangEntity> wrapper);
	
	YezhucheliangVO selectVO(@Param("ew") Wrapper<YezhucheliangEntity> wrapper);
	
	List<YezhucheliangView> selectListView(@Param("ew") Wrapper<YezhucheliangEntity> wrapper);

	List<YezhucheliangView> selectListView(Pagination page,@Param("ew") Wrapper<YezhucheliangEntity> wrapper);
	
	YezhucheliangView selectView(@Param("ew") Wrapper<YezhucheliangEntity> wrapper);
	

}
