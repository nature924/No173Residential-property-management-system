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


import com.dao.JiaofeitongzhiDao;
import com.entity.JiaofeitongzhiEntity;
import com.service.JiaofeitongzhiService;
import com.entity.vo.JiaofeitongzhiVO;
import com.entity.view.JiaofeitongzhiView;

@Service("jiaofeitongzhiService")
public class JiaofeitongzhiServiceImpl extends ServiceImpl<JiaofeitongzhiDao, JiaofeitongzhiEntity> implements JiaofeitongzhiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaofeitongzhiEntity> page = this.selectPage(
                new Query<JiaofeitongzhiEntity>(params).getPage(),
                new EntityWrapper<JiaofeitongzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaofeitongzhiEntity> wrapper) {
		  Page<JiaofeitongzhiView> page =new Query<JiaofeitongzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaofeitongzhiVO> selectListVO(Wrapper<JiaofeitongzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaofeitongzhiVO selectVO(Wrapper<JiaofeitongzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaofeitongzhiView> selectListView(Wrapper<JiaofeitongzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaofeitongzhiView selectView(Wrapper<JiaofeitongzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<JiaofeitongzhiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<JiaofeitongzhiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<JiaofeitongzhiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
