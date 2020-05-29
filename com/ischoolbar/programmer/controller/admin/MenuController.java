package com.ischoolbar.programmer.controller.admin;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ischoolbar.programmer.entity.admin.Menu;
import com.ischoolbar.programmer.page.admin.Page;
import com.ischoolbar.programmer.service.admin.MenuService;

/**
<<<<<<< HEAD
 * èœå•ç®¡ç†æ§åˆ¶å™¨
 * @author llq
=======
 * ²Ëµ¥¹ÜÀí¿ØÖÆÆ÷
 * @author 12753
>>>>>>> å»ºæä¹‹å®¶
 *
 */
@RequestMapping("/admin/menu")
@Controller
public class MenuController {
	
	@Autowired
	private MenuService menuService;
	
	
	/**
<<<<<<< HEAD
	 * èœå•ç®¡ç†åˆ—è¡¨é¡µ
=======
	 * ²Ëµ¥¹ÜÀíÁĞ±íÒ³
>>>>>>> å»ºæä¹‹å®¶
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public ModelAndView list(ModelAndView model){
		model.addObject("topList", menuService.findTopList());
		model.setViewName("menu/list");
		return model;
	}
	
	/**
<<<<<<< HEAD
	 * è·å–èœå•åˆ—è¡¨
=======
	 * »ñÈ¡²Ëµ¥ÁĞ±í
>>>>>>> å»ºæä¹‹å®¶
	 * @param page
	 * @param name
	 * @return
	 */
	@RequestMapping(value="/list",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getMenuList(Page page,
			@RequestParam(name="name",required=false,defaultValue="") String name
			){
		Map<String, Object> ret = new HashMap<String, Object>();
		Map<String, Object> queryMap = new HashMap<String, Object>();
		queryMap.put("offset", page.getOffset());
		queryMap.put("pageSize", page.getRows());
		queryMap.put("name", name);
		List<Menu> findList = menuService.findList(queryMap);
		ret.put("rows", findList);
		ret.put("total", menuService.getTotal(queryMap));
		return ret;
	}
	
	/**
<<<<<<< HEAD
	 * è·å–æŒ‡å®šç›®å½•ä¸‹çš„ç³»ç»Ÿiconé›†åˆ
=======
	 * »ñÈ¡Ö¸¶¨Ä¿Â¼ÏÂµÄÏµÍ³icon¼¯ºÏ
>>>>>>> å»ºæä¹‹å®¶
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/get_icons",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getIconList(HttpServletRequest request){
		Map<String, Object> ret = new HashMap<String, Object>();
		String realPath = request.getServletContext().getRealPath("/");
		File file = new File(realPath + "\\resources\\admin\\easyui\\css\\icons");
		List<String> icons = new ArrayList<String>();
		if(!file.exists()){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "æ–‡ä»¶ç›®å½•ä¸å­˜åœ¨ï¼");
=======
			ret.put("msg", "ÎÄ¼şÄ¿Â¼²»´æÔÚ£¡");
>>>>>>> å»ºæä¹‹å®¶
			return ret;
		}
		File[] listFiles = file.listFiles();
		for(File f:listFiles){
			if(f!= null && f.getName().contains("png")){
				icons.add("icon-" + f.getName().substring(0, f.getName().indexOf(".")).replace("_", "-"));
			}
		}
		ret.put("type", "success");
		ret.put("content", icons);
		return ret;
	}
	
	/**
<<<<<<< HEAD
	 * èœå•æ·»åŠ 
=======
	 * ²Ëµ¥Ìí¼Ó
>>>>>>> å»ºæä¹‹å®¶
	 * @param menu
	 * @return
	 */
	@RequestMapping(value="/add",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, String> add(Menu menu){
		Map<String, String> ret = new HashMap<String, String>();
		if(menu == null){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "è¯·å¡«å†™æ­£ç¡®çš„èœå•ä¿¡æ¯!");
=======
			ret.put("msg", "ÇëÌîĞ´ÕıÈ·µÄ²Ëµ¥ĞÅÏ¢!");
>>>>>>> å»ºæä¹‹å®¶
			return ret;
		}
		if(StringUtils.isEmpty(menu.getName())){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "è¯·å¡«å†™èœå•åç§°!");
=======
			ret.put("msg", "ÇëÌîĞ´²Ëµ¥Ãû³Æ!");
>>>>>>> å»ºæä¹‹å®¶
			return ret;
		}
		if(StringUtils.isEmpty(menu.getIcon())){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "è¯·å¡«å†™èœå•å›¾æ ‡ç±»!");
=======
			ret.put("msg", "ÇëÌîĞ´²Ëµ¥Í¼±êÀà!");
>>>>>>> å»ºæä¹‹å®¶
			return ret;
		}
		if(menu.getParentId() == null){
			menu.setParentId(0l);
		}
		if(menuService.add(menu) <= 0){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "æ·»åŠ å¤±è´¥ï¼Œè¯·è”ç³»ç®¡ç†å‘˜!");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "æ·»åŠ æˆåŠŸ!");
=======
			ret.put("msg", "Ìí¼ÓÊ§°Ü£¬ÇëÁªÏµ¹ÜÀíÔ±!");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "Ìí¼Ó³É¹¦!");
>>>>>>> å»ºæä¹‹å®¶
		return ret;
	}
	
	/**
<<<<<<< HEAD
	 * èœå•ä¿®æ”¹
=======
	 * ²Ëµ¥ĞŞ¸Ä
>>>>>>> å»ºæä¹‹å®¶
	 * @param menu
	 * @return
	 */
	@RequestMapping(value="/edit",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, String> edit(Menu menu){
		Map<String, String> ret = new HashMap<String, String>();
		if(menu == null){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "è¯·é€‰æ‹©æ­£ç¡®çš„èœå•ä¿¡æ¯!");
=======
			ret.put("msg", "ÇëÑ¡ÔñÕıÈ·µÄ²Ëµ¥ĞÅÏ¢!");
>>>>>>> å»ºæä¹‹å®¶
			return ret;
		}
		if(StringUtils.isEmpty(menu.getName())){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "è¯·å¡«å†™èœå•åç§°!");
=======
			ret.put("msg", "ÇëÌîĞ´²Ëµ¥Ãû³Æ!");
>>>>>>> å»ºæä¹‹å®¶
			return ret;
		}
		if(StringUtils.isEmpty(menu.getIcon())){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "è¯·å¡«å†™èœå•å›¾æ ‡ç±»!");
=======
			ret.put("msg", "ÇëÌîĞ´²Ëµ¥Í¼±êÀà!");
>>>>>>> å»ºæä¹‹å®¶
			return ret;
		}
		if(menu.getParentId() == null){
			menu.setParentId(0l);
		}
		if(menuService.edit(menu) <= 0){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "ä¿®æ”¹å¤±è´¥ï¼Œè¯·è”ç³»ç®¡ç†å‘˜!");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "ä¿®æ”¹æˆåŠŸ!");
=======
			ret.put("msg", "ĞŞ¸ÄÊ§°Ü£¬ÇëÁªÏµ¹ÜÀíÔ±!");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "ĞŞ¸Ä³É¹¦!");
>>>>>>> å»ºæä¹‹å®¶
		return ret;
	}
	
	/**
<<<<<<< HEAD
	 * åˆ é™¤èœå•ä¿¡æ¯
=======
	 * É¾³ı²Ëµ¥ĞÅÏ¢
>>>>>>> å»ºæä¹‹å®¶
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, String> delete(
			@RequestParam(name="id",required=true) Long id
			){
		Map<String, String> ret = new HashMap<String, String>();
		if(id == null){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "è¯·é€‰æ‹©è¦åˆ é™¤çš„èœå•ä¿¡æ¯!");
=======
			ret.put("msg", "ÇëÑ¡ÔñÒªÉ¾³ıµÄ²Ëµ¥ĞÅÏ¢!");
>>>>>>> å»ºæä¹‹å®¶
			return ret;
		}
		List<Menu> findChildernList = menuService.findChildernList(id);
		if(findChildernList != null && findChildernList.size() > 0){
<<<<<<< HEAD
			//è¡¨ç¤ºè¯¥åˆ†ç±»ä¸‹å­˜åœ¨å­åˆ†ç±»ï¼Œä¸èƒ½åˆ é™¤
			ret.put("type", "error");
			ret.put("msg", "è¯¥åˆ†ç±»ä¸‹å­˜åœ¨å­åˆ†ç±»ï¼Œä¸èƒ½åˆ é™¤!");
=======
			//±íÊ¾¸Ã·ÖÀàÏÂ´æÔÚ×Ó·ÖÀà£¬²»ÄÜÉ¾³ı
			ret.put("type", "error");
			ret.put("msg", "¸Ã·ÖÀàÏÂ´æÔÚ×Ó·ÖÀà£¬²»ÄÜÉ¾³ı!");
>>>>>>> å»ºæä¹‹å®¶
			return ret;
		}
		if(menuService.delete(id) <= 0){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "åˆ é™¤å¤±è´¥ï¼Œè¯·è”ç³»ç®¡ç†å‘˜!");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "åˆ é™¤æˆåŠŸ!");
=======
			ret.put("msg", "É¾³ıÊ§°Ü£¬ÇëÁªÏµ¹ÜÀíÔ±!");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "É¾³ı³É¹¦!");
>>>>>>> å»ºæä¹‹å®¶
		return ret;
	}
}
