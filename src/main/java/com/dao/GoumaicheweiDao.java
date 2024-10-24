package com.dao;

import com.entity.GoumaicheweiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GoumaicheweiVO;
import com.entity.view.GoumaicheweiView;


/**
 * 购买车位
 * 
 * @author 
 * @email 
 * @date 2023-01-26 18:34:57
 */
public interface GoumaicheweiDao extends BaseMapper<GoumaicheweiEntity> {
	
	List<GoumaicheweiVO> selectListVO(@Param("ew") Wrapper<GoumaicheweiEntity> wrapper);
	
	GoumaicheweiVO selectVO(@Param("ew") Wrapper<GoumaicheweiEntity> wrapper);
	
	List<GoumaicheweiView> selectListView(@Param("ew") Wrapper<GoumaicheweiEntity> wrapper);

	List<GoumaicheweiView> selectListView(Pagination page,@Param("ew") Wrapper<GoumaicheweiEntity> wrapper);
	
	GoumaicheweiView selectView(@Param("ew") Wrapper<GoumaicheweiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<GoumaicheweiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<GoumaicheweiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<GoumaicheweiEntity> wrapper);



}
