package com.dao;

import com.entity.ZichanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZichanxinxiVO;
import com.entity.view.ZichanxinxiView;


/**
 * 资产信息
 * 
 * @author 
 * @email 
 * @date 2023-01-26 18:34:57
 */
public interface ZichanxinxiDao extends BaseMapper<ZichanxinxiEntity> {
	
	List<ZichanxinxiVO> selectListVO(@Param("ew") Wrapper<ZichanxinxiEntity> wrapper);
	
	ZichanxinxiVO selectVO(@Param("ew") Wrapper<ZichanxinxiEntity> wrapper);
	
	List<ZichanxinxiView> selectListView(@Param("ew") Wrapper<ZichanxinxiEntity> wrapper);

	List<ZichanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZichanxinxiEntity> wrapper);
	
	ZichanxinxiView selectView(@Param("ew") Wrapper<ZichanxinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZichanxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZichanxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZichanxinxiEntity> wrapper);



}
