package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GoumaicheweiDao;
import com.entity.GoumaicheweiEntity;
import com.service.GoumaicheweiService;
import com.entity.vo.GoumaicheweiVO;
import com.entity.view.GoumaicheweiView;

@Service("goumaicheweiService")
public class GoumaicheweiServiceImpl extends ServiceImpl<GoumaicheweiDao, GoumaicheweiEntity> implements GoumaicheweiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GoumaicheweiEntity> page = this.selectPage(
                new Query<GoumaicheweiEntity>(params).getPage(),
                new EntityWrapper<GoumaicheweiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GoumaicheweiEntity> wrapper) {
		  Page<GoumaicheweiView> page =new Query<GoumaicheweiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GoumaicheweiVO> selectListVO(Wrapper<GoumaicheweiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GoumaicheweiVO selectVO(Wrapper<GoumaicheweiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GoumaicheweiView> selectListView(Wrapper<GoumaicheweiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GoumaicheweiView selectView(Wrapper<GoumaicheweiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<GoumaicheweiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<GoumaicheweiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<GoumaicheweiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
