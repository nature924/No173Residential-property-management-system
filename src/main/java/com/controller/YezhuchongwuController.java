package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YezhuchongwuEntity;
import com.entity.view.YezhuchongwuView;

import com.service.YezhuchongwuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 业主宠物
 * 后端接口
 * @author 
 * @email 
 * @date 2023-01-26 18:34:57
 */
@RestController
@RequestMapping("/yezhuchongwu")
public class YezhuchongwuController {
    @Autowired
    private YezhuchongwuService yezhuchongwuService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YezhuchongwuEntity yezhuchongwu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yezhu")) {
			yezhuchongwu.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YezhuchongwuEntity> ew = new EntityWrapper<YezhuchongwuEntity>();

		PageUtils page = yezhuchongwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yezhuchongwu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YezhuchongwuEntity yezhuchongwu, 
		HttpServletRequest request){
        EntityWrapper<YezhuchongwuEntity> ew = new EntityWrapper<YezhuchongwuEntity>();

		PageUtils page = yezhuchongwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yezhuchongwu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YezhuchongwuEntity yezhuchongwu){
       	EntityWrapper<YezhuchongwuEntity> ew = new EntityWrapper<YezhuchongwuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yezhuchongwu, "yezhuchongwu")); 
        return R.ok().put("data", yezhuchongwuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YezhuchongwuEntity yezhuchongwu){
        EntityWrapper< YezhuchongwuEntity> ew = new EntityWrapper< YezhuchongwuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yezhuchongwu, "yezhuchongwu")); 
		YezhuchongwuView yezhuchongwuView =  yezhuchongwuService.selectView(ew);
		return R.ok("查询业主宠物成功").put("data", yezhuchongwuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YezhuchongwuEntity yezhuchongwu = yezhuchongwuService.selectById(id);
        return R.ok().put("data", yezhuchongwu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YezhuchongwuEntity yezhuchongwu = yezhuchongwuService.selectById(id);
        return R.ok().put("data", yezhuchongwu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YezhuchongwuEntity yezhuchongwu, HttpServletRequest request){
    	yezhuchongwu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yezhuchongwu);
        yezhuchongwuService.insert(yezhuchongwu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody YezhuchongwuEntity yezhuchongwu, HttpServletRequest request){
    	yezhuchongwu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yezhuchongwu);
        yezhuchongwuService.insert(yezhuchongwu);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YezhuchongwuEntity yezhuchongwu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yezhuchongwu);
        yezhuchongwuService.updateById(yezhuchongwu);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yezhuchongwuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<YezhuchongwuEntity> wrapper = new EntityWrapper<YezhuchongwuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yezhu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = yezhuchongwuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
