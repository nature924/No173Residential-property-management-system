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


import com.dao.YezhucheliangDao;
import com.entity.YezhucheliangEntity;
import com.service.YezhucheliangService;
import com.entity.vo.YezhucheliangVO;
import com.entity.view.YezhucheliangView;

@Service("yezhucheliangService")
public class YezhucheliangServiceImpl extends ServiceImpl<YezhucheliangDao, YezhucheliangEntity> implements YezhucheliangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YezhucheliangEntity> page = this.selectPage(
                new Query<YezhucheliangEntity>(params).getPage(),
                new EntityWrapper<YezhucheliangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YezhucheliangEntity> wrapper) {
		  Page<YezhucheliangView> page =new Query<YezhucheliangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YezhucheliangVO> selectListVO(Wrapper<YezhucheliangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YezhucheliangVO selectVO(Wrapper<YezhucheliangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YezhucheliangView> selectListView(Wrapper<YezhucheliangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YezhucheliangView selectView(Wrapper<YezhucheliangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
