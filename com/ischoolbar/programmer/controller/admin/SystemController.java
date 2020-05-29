package com.ischoolbar.programmer.controller.admin;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
import com.ischoolbar.programmer.entity.admin.User;
import com.ischoolbar.programmer.service.admin.AuthorityService;
import com.ischoolbar.programmer.service.admin.LogService;
import com.ischoolbar.programmer.service.admin.MenuService;
import com.ischoolbar.programmer.service.admin.RoleService;
import com.ischoolbar.programmer.service.admin.UserService;
import com.ischoolbar.programmer.util.CpachaUtil;
import com.ischoolbar.programmer.util.MenuUtil;

/**
<<<<<<< HEAD
 * ç³»ç»Ÿæ“ä½œç±»æ§åˆ¶å™¨
 * @author llq
=======
 * ÏµÍ³²Ù×÷Àà¿ØÖÆÆ÷
 * @author 12753
>>>>>>> å»ºæä¹‹å®¶
 *
 */
@Controller
@RequestMapping("/system")
public class SystemController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private RoleService roleService;
	
	@Autowired
	private AuthorityService authorityService;
	
	@Autowired
	private MenuService menuService;
	
	@Autowired
	private LogService logService;
	
	/**
<<<<<<< HEAD
	 * ç³»ç»Ÿç™»å½•åçš„ä¸»é¡µ
=======
	 * ÏµÍ³µÇÂ¼ºóµÄÖ÷Ò³
>>>>>>> å»ºæä¹‹å®¶
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public ModelAndView index(ModelAndView model,HttpServletRequest request){
		List<Menu> userMenus = (List<Menu>)request.getSession().getAttribute("userMenus");
		model.addObject("topMenuList", MenuUtil.getAllTopMenu(userMenus));
		model.addObject("secondMenuList", MenuUtil.getAllSecondMenu(userMenus));
		model.setViewName("system/index");
		return model;//WEB-INF/views/+system/index+.jsp = WEB-INF/views/system/index.jsp
	}
	
	/**
<<<<<<< HEAD
	 * ç³»ç»Ÿç™»å½•åçš„æ¬¢è¿é¡µ
=======
	 * ÏµÍ³µÇÂ¼ºóµÄ»¶Ó­Ò³
>>>>>>> å»ºæä¹‹å®¶
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/welcome",method=RequestMethod.GET)
	public ModelAndView welcome(ModelAndView model){
		model.setViewName("system/welcome");
		return model;
	}
	/**
<<<<<<< HEAD
	 * ç™»é™†é¡µé¢
=======
	 * µÇÂ½Ò³Ãæ
>>>>>>> å»ºæä¹‹å®¶
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView login(ModelAndView model){
		model.setViewName("system/login");
		return model;
	}
	
	/**
<<<<<<< HEAD
	 * ç™»å½•è¡¨å•æäº¤å¤„ç†æ§åˆ¶å™¨
=======
	 * µÇÂ¼±íµ¥Ìá½»´¦Àí¿ØÖÆÆ÷
>>>>>>> å»ºæä¹‹å®¶
	 * @param user
	 * @param cpacha
	 * @return
	 */
	@RequestMapping(value="/login",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, String> loginAct(User user,String cpacha,HttpServletRequest request){
		Map<String, String> ret = new HashMap<String, String>();
		if(user == null){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "è¯·å¡«å†™ç”¨æˆ·ä¿¡æ¯ï¼");
=======
			ret.put("msg", "ÇëÌîĞ´ÓÃ»§ĞÅÏ¢£¡");
>>>>>>> å»ºæä¹‹å®¶
			return ret;
		}
		if(StringUtils.isEmpty(cpacha)){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "è¯·å¡«å†™éªŒè¯ç ï¼");
=======
			ret.put("msg", "ÇëÌîĞ´ÑéÖ¤Âë£¡");
>>>>>>> å»ºæä¹‹å®¶
			return ret;
		}
		if(StringUtils.isEmpty(user.getUsername())){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "è¯·å¡«å†™ç”¨æˆ·åï¼");
=======
			ret.put("msg", "ÇëÌîĞ´ÓÃ»§Ãû£¡");
>>>>>>> å»ºæä¹‹å®¶
			return ret;
		}
		if(StringUtils.isEmpty(user.getPassword())){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "è¯·å¡«å†™å¯†ç ï¼");
=======
			ret.put("msg", "ÇëÌîĞ´ÃÜÂë£¡");
>>>>>>> å»ºæä¹‹å®¶
			return ret;
		}
		Object loginCpacha = request.getSession().getAttribute("loginCpacha");
		if(loginCpacha == null){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "ä¼šè¯è¶…æ—¶ï¼Œè¯·åˆ·æ–°é¡µé¢ï¼");
=======
			ret.put("msg", "»á»°³¬Ê±£¬ÇëË¢ĞÂÒ³Ãæ£¡");
>>>>>>> å»ºæä¹‹å®¶
			return ret;
		}
		if(!cpacha.toUpperCase().equals(loginCpacha.toString().toUpperCase())){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "éªŒè¯ç é”™è¯¯ï¼");
			logService.add("ç”¨æˆ·åä¸º"+user.getUsername()+"çš„ç”¨æˆ·ç™»å½•æ—¶è¾“å…¥éªŒè¯ç é”™è¯¯!");
=======
			ret.put("msg", "ÑéÖ¤Âë´íÎó£¡");
			logService.add("ÓÃ»§ÃûÎª"+user.getUsername()+"µÄÓÃ»§µÇÂ¼Ê±ÊäÈëÑéÖ¤Âë´íÎó!");
>>>>>>> å»ºæä¹‹å®¶
			return ret;
		}
		User findByUsername = userService.findByUsername(user.getUsername());
		if(findByUsername == null){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "è¯¥ç”¨æˆ·åä¸å­˜åœ¨ï¼");
			logService.add("ç™»å½•æ—¶ï¼Œç”¨æˆ·åä¸º"+user.getUsername()+"çš„ç”¨æˆ·ä¸å­˜åœ¨!");
=======
			ret.put("msg", "¸ÃÓÃ»§Ãû²»´æÔÚ£¡");
			logService.add("µÇÂ¼Ê±£¬ÓÃ»§ÃûÎª"+user.getUsername()+"µÄÓÃ»§²»´æÔÚ!");
>>>>>>> å»ºæä¹‹å®¶
			return ret;
		}
		if(!user.getPassword().equals(findByUsername.getPassword())){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "å¯†ç é”™è¯¯ï¼");
			logService.add("ç”¨æˆ·åä¸º"+user.getUsername()+"çš„ç”¨æˆ·ç™»å½•æ—¶è¾“å…¥å¯†ç é”™è¯¯!");
			return ret;
		}
		//è¯´æ˜ç”¨æˆ·åå¯†ç åŠéªŒè¯ç éƒ½æ­£ç¡®
		//æ­¤æ—¶éœ€è¦æŸ¥è¯¢ç”¨æˆ·çš„è§’è‰²æƒé™
		Role role = roleService.find(findByUsername.getRoleId());
		List<Authority> authorityList = authorityService.findListByRoleId(role.getId());//æ ¹æ®è§’è‰²è·å–æƒé™åˆ—è¡¨
=======
			ret.put("msg", "ÃÜÂë´íÎó£¡");
			logService.add("ÓÃ»§ÃûÎª"+user.getUsername()+"µÄÓÃ»§µÇÂ¼Ê±ÊäÈëÃÜÂë´íÎó!");
			return ret;
		}
		//ËµÃ÷ÓÃ»§ÃûÃÜÂë¼°ÑéÖ¤Âë¶¼ÕıÈ·
		//´ËÊ±ĞèÒª²éÑ¯ÓÃ»§µÄ½ÇÉ«È¨ÏŞ
		Role role = roleService.find(findByUsername.getRoleId());
		List<Authority> authorityList = authorityService.findListByRoleId(role.getId());//¸ù¾İ½ÇÉ«»ñÈ¡È¨ÏŞÁĞ±í
>>>>>>> å»ºæä¹‹å®¶
		String menuIds = "";
		for(Authority authority:authorityList){
			menuIds += authority.getMenuId() + ",";
		}
		if(!StringUtils.isEmpty(menuIds)){
			menuIds = menuIds.substring(0,menuIds.length()-1);
		}
		List<Menu> userMenus = menuService.findListByIds(menuIds);
<<<<<<< HEAD
		//æŠŠè§’è‰²ä¿¡æ¯ã€èœå•ä¿¡æ¯æ”¾åˆ°sessionä¸­
=======
		//°Ñ½ÇÉ«ĞÅÏ¢¡¢²Ëµ¥ĞÅÏ¢·Åµ½sessionÖĞ
>>>>>>> å»ºæä¹‹å®¶
		request.getSession().setAttribute("admin", findByUsername);
		request.getSession().setAttribute("role", role);
		request.getSession().setAttribute("userMenus", userMenus);
		ret.put("type", "success");
<<<<<<< HEAD
		ret.put("msg", "ç™»å½•æˆåŠŸï¼");
		logService.add("ç”¨æˆ·åä¸º{"+user.getUsername()+"}ï¼Œè§’è‰²ä¸º{"+role.getName()+"}çš„ç”¨æˆ·ç™»å½•æˆåŠŸ!");
=======
		ret.put("msg", "µÇÂ¼³É¹¦£¡");
		logService.add("ÓÃ»§ÃûÎª{"+user.getUsername()+"}£¬½ÇÉ«Îª{"+role.getName()+"}µÄÓÃ»§µÇÂ¼³É¹¦!");
>>>>>>> å»ºæä¹‹å®¶
		return ret;
	}
	
	/**
<<<<<<< HEAD
	 * åå°é€€å‡ºæ³¨é”€åŠŸèƒ½
=======
	 * ºóÌ¨ÍË³ö×¢Ïú¹¦ÄÜ
>>>>>>> å»ºæä¹‹å®¶
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public String logout(HttpServletRequest request){
		HttpSession session = request.getSession();
		session.setAttribute("admin", null);
		session.setAttribute("role", null);
		request.getSession().setAttribute("userMenus", null);
		return "redirect:login";
	}
	
	/**
<<<<<<< HEAD
	 * ä¿®æ”¹å¯†ç é¡µé¢
=======
	 * ĞŞ¸ÄÃÜÂëÒ³Ãæ
>>>>>>> å»ºæä¹‹å®¶
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/edit_password",method=RequestMethod.GET)
	public ModelAndView editPassword(ModelAndView model){
		model.setViewName("system/edit_password");
		return model;
	}
	
	@RequestMapping(value="/edit_password",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, String> editPasswordAct(String newpassword,String oldpassword,HttpServletRequest request){
		Map<String, String> ret = new HashMap<String, String>();
		if(StringUtils.isEmpty(newpassword)){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "è¯·å¡«å†™æ–°å¯†ç ï¼");
=======
			ret.put("msg", "ÇëÌîĞ´ĞÂÃÜÂë£¡");
>>>>>>> å»ºæä¹‹å®¶
			return ret;
		}
		User user = (User)request.getSession().getAttribute("admin");
		if(!user.getPassword().equals(oldpassword)){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "åŸå¯†ç é”™è¯¯ï¼");
=======
			ret.put("msg", "Ô­ÃÜÂë´íÎó£¡");
>>>>>>> å»ºæä¹‹å®¶
			return ret;
		}
		user.setPassword(newpassword);
		if(userService.editPassword(user) <= 0){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "å¯†ç ä¿®æ”¹å¤±è´¥ï¼Œè¯·è”ç³»ç®¡ç†å‘˜ï¼");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "å¯†ç ä¿®æ”¹æˆåŠŸï¼");
		logService.add("ç”¨æˆ·åä¸º{"+user.getUsername()+"}ï¼Œçš„ç”¨æˆ·æˆåŠŸä¿®æ”¹å¯†ç !");
=======
			ret.put("msg", "ÃÜÂëĞŞ¸ÄÊ§°Ü£¬ÇëÁªÏµ¹ÜÀíÔ±£¡");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "ÃÜÂëĞŞ¸Ä³É¹¦£¡");
		logService.add("ÓÃ»§ÃûÎª{"+user.getUsername()+"}£¬µÄÓÃ»§³É¹¦ĞŞ¸ÄÃÜÂë!");
>>>>>>> å»ºæä¹‹å®¶
		return ret;
	} 
	
	/**
<<<<<<< HEAD
	 * æœ¬ç³»ç»Ÿæ‰€æœ‰çš„éªŒè¯ç å‡é‡‡ç”¨æ­¤æ–¹æ³•
	 * @param vcodeLen
	 * @param width
	 * @param height
	 * @param cpachaType:ç”¨æ¥åŒºåˆ«éªŒè¯ç çš„ç±»å‹ï¼Œä¼ å…¥å­—ç¬¦ä¸²
=======
	 * ±¾ÏµÍ³ËùÓĞµÄÑéÖ¤Âë¾ù²ÉÓÃ´Ë·½·¨
	 * @param vcodeLen
	 * @param width
	 * @param height
	 * @param cpachaType:ÓÃÀ´Çø±ğÑéÖ¤ÂëµÄÀàĞÍ£¬´«Èë×Ö·û´®
>>>>>>> å»ºæä¹‹å®¶
	 * @param request
	 * @param response
	 */
	@RequestMapping(value="/get_cpacha",method=RequestMethod.GET)
	public void generateCpacha(
			@RequestParam(name="vl",required=false,defaultValue="4") Integer vcodeLen,
			@RequestParam(name="w",required=false,defaultValue="100") Integer width,
			@RequestParam(name="h",required=false,defaultValue="30") Integer height,
			@RequestParam(name="type",required=true,defaultValue="loginCpacha") String cpachaType,
			HttpServletRequest request,
			HttpServletResponse response){
		CpachaUtil cpachaUtil = new CpachaUtil(vcodeLen, width, height);
		String generatorVCode = cpachaUtil.generatorVCode();
		request.getSession().setAttribute(cpachaType, generatorVCode);
		BufferedImage generatorRotateVCodeImage = cpachaUtil.generatorRotateVCodeImage(generatorVCode, true);
		try {
			ImageIO.write(generatorRotateVCodeImage, "gif", response.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
