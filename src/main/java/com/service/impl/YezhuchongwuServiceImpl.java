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


import com.dao.YezhuchongwuDao;
import com.entity.YezhuchongwuEntity;
import com.service.YezhuchongwuService;
import com.entity.vo.YezhuchongwuVO;
import com.entity.view.YezhuchongwuView;

@Service("yezhuchongwuService")
public class YezhuchongwuServiceImpl extends ServiceImpl<YezhuchongwuDao, YezhuchongwuEntity> implements YezhuchongwuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YezhuchongwuEntity> page = this.selectPage(
                new Query<YezhuchongwuEntity>(params).getPage(),
                new EntityWrapper<YezhuchongwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YezhuchongwuEntity> wrapper) {
		  Page<YezhuchongwuView> page =new Query<YezhuchongwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YezhuchongwuVO> selectListVO(Wrapper<YezhuchongwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YezhuchongwuVO selectVO(Wrapper<YezhuchongwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YezhuchongwuView> selectListView(Wrapper<YezhuchongwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YezhuchongwuView selectView(Wrapper<YezhuchongwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
