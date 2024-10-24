package com.dao;

import com.entity.YezhuchongwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YezhuchongwuVO;
import com.entity.view.YezhuchongwuView;


/**
 * 业主宠物
 * 
 * @author 
 * @email 
 * @date 2023-01-26 18:34:57
 */
public interface YezhuchongwuDao extends BaseMapper<YezhuchongwuEntity> {
	
	List<YezhuchongwuVO> selectListVO(@Param("ew") Wrapper<YezhuchongwuEntity> wrapper);
	
	YezhuchongwuVO selectVO(@Param("ew") Wrapper<YezhuchongwuEntity> wrapper);
	
	List<YezhuchongwuView> selectListView(@Param("ew") Wrapper<YezhuchongwuEntity> wrapper);

	List<YezhuchongwuView> selectListView(Pagination page,@Param("ew") Wrapper<YezhuchongwuEntity> wrapper);
	
	YezhuchongwuView selectView(@Param("ew") Wrapper<YezhuchongwuEntity> wrapper);
	

}
