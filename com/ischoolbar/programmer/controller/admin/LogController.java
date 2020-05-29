package com.ischoolbar.programmer.controller.admin;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ischoolbar.programmer.entity.admin.Log;
import com.ischoolbar.programmer.page.admin.Page;
import com.ischoolbar.programmer.service.admin.LogService;

/**
<<<<<<< HEAD
 * æ—¥å¿—ç®¡ç†æ§åˆ¶å™¨
 * @author llq
=======
 * ÈÕÖ¾¹ÜÀí¿ØÖÆÆ÷
 * @author 12753
>>>>>>> å»ºæä¹‹å®¶
 *
 */
@RequestMapping("/admin/log")
@Controller
public class LogController {
	@Autowired
	private LogService logService;
	
	/**
<<<<<<< HEAD
	 * æ—¥å¿—åˆ—è¡¨é¡µé¢
=======
	 * ÈÕÖ¾ÁĞ±íÒ³Ãæ
>>>>>>> å»ºæä¹‹å®¶
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public ModelAndView list(ModelAndView model){
		model.setViewName("log/list");
		return model;
	}
	
	/**
<<<<<<< HEAD
	 * è·å–æ—¥å¿—åˆ—è¡¨
=======
	 * »ñÈ¡ÈÕÖ¾ÁĞ±í
>>>>>>> å»ºæä¹‹å®¶
	 * @param page
	 * @param content
	 * @param roleId
	 * @param sex
	 * @return
	 */
	@RequestMapping(value="/list",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getList(Page page,
			@RequestParam(name="content",required=false,defaultValue="") String content
			){
		Map<String, Object> ret = new HashMap<String, Object>();
		Map<String, Object> queryMap = new HashMap<String, Object>();
		queryMap.put("content", content);
		queryMap.put("offset", page.getOffset());
		queryMap.put("pageSize", page.getRows());
		ret.put("rows", logService.findList(queryMap));
		ret.put("total", logService.getTotal(queryMap));
		return ret;
	}
	
	/**
<<<<<<< HEAD
	 * æ·»åŠ æ—¥å¿—
=======
	 * Ìí¼ÓÈÕÖ¾
>>>>>>> å»ºæä¹‹å®¶
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/add",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, String> add(Log log){
		Map<String, String> ret = new HashMap<String, String>();
		if(log == null){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "è¯·å¡«å†™æ­£ç¡®çš„æ—¥å¿—ä¿¡æ¯ï¼");
=======
			ret.put("msg", "ÇëÌîĞ´ÕıÈ·µÄÈÕÖ¾ĞÅÏ¢£¡");
>>>>>>> å»ºæä¹‹å®¶
			return ret;
		}
		if(StringUtils.isEmpty(log.getContent())){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "è¯·å¡«å†™æ—¥å¿—å†…å®¹ï¼");
=======
			ret.put("msg", "ÇëÌîĞ´ÈÕÖ¾ÄÚÈİ£¡");
>>>>>>> å»ºæä¹‹å®¶
			return ret;
		}
		log.setCreateTime(new Date());
		if(logService.add(log) <= 0){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "æ—¥å¿—æ·»åŠ å¤±è´¥ï¼Œè¯·è”ç³»ç®¡ç†å‘˜ï¼");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "æ—¥å¿—æ·»åŠ æˆåŠŸï¼");
=======
			ret.put("msg", "ÈÕÖ¾Ìí¼ÓÊ§°Ü£¬ÇëÁªÏµ¹ÜÀíÔ±£¡");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "ÈÕÖ¾Ìí¼Ó³É¹¦£¡");
>>>>>>> å»ºæä¹‹å®¶
		return ret;
	}
	
	
	
	/**
<<<<<<< HEAD
	 * æ‰¹é‡åˆ é™¤æ—¥å¿—
=======
	 * ÅúÁ¿É¾³ıÈÕÖ¾
>>>>>>> å»ºæä¹‹å®¶
	 * @param ids
	 * @return
	 */
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, String> delete(String ids){
		Map<String, String> ret = new HashMap<String, String>();
		if(StringUtils.isEmpty(ids)){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "é€‰æ‹©è¦åˆ é™¤çš„æ•°æ®ï¼");
=======
			ret.put("msg", "Ñ¡ÔñÒªÉ¾³ıµÄÊı¾İ£¡");
>>>>>>> å»ºæä¹‹å®¶
			return ret;
		}
		if(ids.contains(",")){
			ids = ids.substring(0,ids.length()-1);
		}
		if(logService.delete(ids) <= 0){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "æ—¥å¿—åˆ é™¤å¤±è´¥ï¼Œè¯·è”ç³»ç®¡ç†å‘˜ï¼");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "æ—¥å¿—åˆ é™¤æˆåŠŸï¼");
=======
			ret.put("msg", "ÈÕÖ¾É¾³ıÊ§°Ü£¬ÇëÁªÏµ¹ÜÀíÔ±£¡");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "ÈÕÖ¾É¾³ı³É¹¦£¡");
>>>>>>> å»ºæä¹‹å®¶
		return ret;
	}
	
	
}
