package com.ischoolbar.programmer.controller.admin;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ischoolbar.programmer.entity.admin.Authority;
import com.ischoolbar.programmer.entity.admin.Menu;
import com.ischoolbar.programmer.entity.admin.Role;
import com.ischoolbar.programmer.page.admin.Page;
import com.ischoolbar.programmer.service.admin.AuthorityService;
import com.ischoolbar.programmer.service.admin.MenuService;
import com.ischoolbar.programmer.service.admin.RoleService;


/**
<<<<<<< HEAD
 * è§’è‰²roleæ§åˆ¶å™¨
 * @author llq
=======
 * ½ÇÉ«role¿ØÖÆÆ÷
 * @author 12753
>>>>>>> å»ºæä¹‹å®¶
 *
 */
@RequestMapping("/admin/role")
@Controller
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@Autowired
	private AuthorityService authorityService;
	
	@Autowired
	private MenuService menuService;
	
	/**
<<<<<<< HEAD
	 * è§’è‰²åˆ—è¡¨é¡µé¢
=======
	 * ½ÇÉ«ÁĞ±íÒ³Ãæ
>>>>>>> å»ºæä¹‹å®¶
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public ModelAndView list(ModelAndView model){
		model.setViewName("/role/list");
		return model;
	}
	
	
	/**
<<<<<<< HEAD
	 * è·å–è§’è‰²åˆ—è¡¨
=======
	 * »ñÈ¡½ÇÉ«ÁĞ±í
>>>>>>> å»ºæä¹‹å®¶
	 * @param page
	 * @param name
	 * @return
	 */
	@RequestMapping(value="/list",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getList(Page page,
			@RequestParam(name="name",required=false,defaultValue="") String name
			){
		Map<String, Object> ret = new HashMap<String, Object>();
		Map<String, Object> queryMap = new HashMap<String, Object>();
		queryMap.put("name", name);
		queryMap.put("offset", page.getOffset());
		queryMap.put("pageSize", page.getRows());
		ret.put("rows", roleService.findList(queryMap));
		ret.put("total", roleService.getTotal(queryMap));
		return ret;
	}
	
	/**
<<<<<<< HEAD
	 * è§’è‰²æ·»åŠ 
=======
	 * ½ÇÉ«Ìí¼Ó
>>>>>>> å»ºæä¹‹å®¶
	 * @param role
	 * @return
	 */
	@RequestMapping(value="/add",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, String> add(Role role){
		Map<String, String> ret = new HashMap<String, String>();
		if(role == null){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "è¯·å¡«å†™æ­£ç¡®çš„è§’è‰²ä¿¡æ¯ï¼");
=======
			ret.put("msg", "ÇëÌîĞ´ÕıÈ·µÄ½ÇÉ«ĞÅÏ¢£¡");
>>>>>>> å»ºæä¹‹å®¶
			return ret;
		}
		if(StringUtils.isEmpty(role.getName())){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "è¯·å¡«å†™è§’è‰²åç§°ï¼");
=======
			ret.put("msg", "ÇëÌîĞ´½ÇÉ«Ãû³Æ£¡");
>>>>>>> å»ºæä¹‹å®¶
			return ret;
		}
		if(roleService.add(role) <= 0){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "è§’è‰²æ·»åŠ å¤±è´¥ï¼Œè¯·è”ç³»ç®¡ç†å‘˜ï¼");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "è§’è‰²æ·»åŠ æˆåŠŸï¼");
=======
			ret.put("msg", "½ÇÉ«Ìí¼ÓÊ§°Ü£¬ÇëÁªÏµ¹ÜÀíÔ±£¡");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "½ÇÉ«Ìí¼Ó³É¹¦£¡");
>>>>>>> å»ºæä¹‹å®¶
		return ret;
	}
	
	/**
<<<<<<< HEAD
	 * è§’è‰²ä¿®æ”¹
=======
	 * ½ÇÉ«ĞŞ¸Ä
>>>>>>> å»ºæä¹‹å®¶
	 * @param role
	 * @return
	 */
	@RequestMapping(value="/edit",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, String> edit(Role role){
		Map<String, String> ret = new HashMap<String, String>();
		if(role == null){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "è¯·å¡«å†™æ­£ç¡®çš„è§’è‰²ä¿¡æ¯ï¼");
=======
			ret.put("msg", "ÇëÌîĞ´ÕıÈ·µÄ½ÇÉ«ĞÅÏ¢£¡");
>>>>>>> å»ºæä¹‹å®¶
			return ret;
		}
		if(StringUtils.isEmpty(role.getName())){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "è¯·å¡«å†™è§’è‰²åç§°ï¼");
=======
			ret.put("msg", "ÇëÌîĞ´½ÇÉ«Ãû³Æ£¡");
>>>>>>> å»ºæä¹‹å®¶
			return ret;
		}
		if(roleService.edit(role) <= 0){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "è§’è‰²ä¿®æ”¹å¤±è´¥ï¼Œè¯·è”ç³»ç®¡ç†å‘˜ï¼");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "è§’è‰²ä¿®æ”¹æˆåŠŸï¼");
=======
			ret.put("msg", "½ÇÉ«ĞŞ¸ÄÊ§°Ü£¬ÇëÁªÏµ¹ÜÀíÔ±£¡");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "½ÇÉ«ĞŞ¸Ä³É¹¦£¡");
>>>>>>> å»ºæä¹‹å®¶
		return ret;
	}
	
	/**
<<<<<<< HEAD
	 * åˆ é™¤è§’è‰²ä¿¡æ¯
=======
	 * É¾³ı½ÇÉ«ĞÅÏ¢
>>>>>>> å»ºæä¹‹å®¶
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, String> delete(Long id){
		Map<String, String> ret = new HashMap<String, String>();
		if(id == null){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "è¯·é€‰æ‹©è¦åˆ é™¤çš„è§’è‰²ï¼");
=======
			ret.put("msg", "ÇëÑ¡ÔñÒªÉ¾³ıµÄ½ÇÉ«£¡");
>>>>>>> å»ºæä¹‹å®¶
			return ret;
		}
		try {
			if(roleService.delete(id) <= 0){
				ret.put("type", "error");
<<<<<<< HEAD
				ret.put("msg", "åˆ é™¤å¤±è´¥ï¼Œè¯·è”ç³»ç®¡ç†å‘˜ï¼");
=======
				ret.put("msg", "É¾³ıÊ§°Ü£¬ÇëÁªÏµ¹ÜÀíÔ±£¡");
>>>>>>> å»ºæä¹‹å®¶
				return ret;
			}
		} catch (Exception e) {
			// TODO: handle exception
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "è¯¥è§’è‰²ä¸‹å­˜åœ¨æƒé™æˆ–è€…ç”¨æˆ·ä¿¡æ¯ï¼Œä¸èƒ½åˆ é™¤ï¼");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "è§’è‰²åˆ é™¤æˆåŠŸï¼");
=======
			ret.put("msg", "¸Ã½ÇÉ«ÏÂ´æÔÚÈ¨ÏŞ»òÕßÓÃ»§ĞÅÏ¢£¬²»ÄÜÉ¾³ı£¡");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "½ÇÉ«É¾³ı³É¹¦£¡");
>>>>>>> å»ºæä¹‹å®¶
		return ret;
	}
	
	/**
<<<<<<< HEAD
	 * è·å–æ‰€æœ‰çš„èœå•ä¿¡æ¯
=======
	 * »ñÈ¡ËùÓĞµÄ²Ëµ¥ĞÅÏ¢
>>>>>>> å»ºæä¹‹å®¶
	 * @return
	 */
	@RequestMapping(value="/get_all_menu",method=RequestMethod.POST)
	@ResponseBody
	public List<Menu> getAllMenu(){
		Map<String, Object> queryMap = new HashMap<String, Object>();
		queryMap.put("offset", 0);
		queryMap.put("pageSize", 99999);
		return menuService.findList(queryMap);
	}
	
	/**
<<<<<<< HEAD
	 * æ·»åŠ æƒé™
=======
	 * Ìí¼ÓÈ¨ÏŞ
>>>>>>> å»ºæä¹‹å®¶
	 * @param ids
	 * @return
	 */
	@RequestMapping(value="/add_authority",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, String> addAuthority(
			@RequestParam(name="ids",required=true) String ids,
			@RequestParam(name="roleId",required=true) Long roleId
			){
		Map<String,String> ret = new HashMap<String, String>();
		if(StringUtils.isEmpty(ids)){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "è¯·é€‰æ‹©ç›¸åº”çš„æƒé™ï¼");
=======
			ret.put("msg", "ÇëÑ¡ÔñÏàÓ¦µÄÈ¨ÏŞ£¡");
>>>>>>> å»ºæä¹‹å®¶
			return ret;
		}
		if(roleId == null){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "è¯·é€‰æ‹©ç›¸åº”çš„è§’è‰²ï¼");
=======
			ret.put("msg", "ÇëÑ¡ÔñÏàÓ¦µÄ½ÇÉ«£¡");
>>>>>>> å»ºæä¹‹å®¶
			return ret;
		}
		if(ids.contains(",")){
			ids = ids.substring(0,ids.length()-1);
		}
		String[] idArr = ids.split(",");
		if(idArr.length > 0){
			authorityService.deleteByRoleId(roleId);
		}
		for(String id:idArr){
			Authority authority = new Authority();
			authority.setMenuId(Long.valueOf(id));
			authority.setRoleId(roleId);
			authorityService.add(authority);
		}
		ret.put("type", "success");
<<<<<<< HEAD
		ret.put("msg", "æƒé™ç¼–è¾‘æˆåŠŸï¼");
=======
		ret.put("msg", "È¨ÏŞ±à¼­³É¹¦£¡");
>>>>>>> å»ºæä¹‹å®¶
		return ret;
	}
	
	/**
<<<<<<< HEAD
	 * è·å–æŸä¸ªè§’è‰²çš„æ‰€æœ‰æƒé™
=======
	 * »ñÈ¡Ä³¸ö½ÇÉ«µÄËùÓĞÈ¨ÏŞ
>>>>>>> å»ºæä¹‹å®¶
	 * @param roleId
	 * @return
	 */
	@RequestMapping(value="/get_role_authority",method=RequestMethod.POST)
	@ResponseBody
	public List<Authority> getRoleAuthority(
			@RequestParam(name="roleId",required=true) Long roleId
		){
		return authorityService.findListByRoleId(roleId);
	}
}
