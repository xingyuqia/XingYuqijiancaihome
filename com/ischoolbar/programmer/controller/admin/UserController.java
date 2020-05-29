package com.ischoolbar.programmer.controller.admin;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.ischoolbar.programmer.entity.admin.Role;
import com.ischoolbar.programmer.entity.admin.User;
import com.ischoolbar.programmer.page.admin.Page;
import com.ischoolbar.programmer.service.admin.RoleService;
import com.ischoolbar.programmer.service.admin.UserService;

/**
<<<<<<< HEAD
 * ç”¨æˆ·ç®¡ç†æ§åˆ¶å™¨
 * @author llq
=======
 * ÓÃ»§¹ÜÀí¿ØÖÆÆ÷
 * @author 12753
>>>>>>> å»ºæä¹‹å®¶
 *
 */
@RequestMapping("/admin/user")
@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private RoleService roleService;
	
	/**
<<<<<<< HEAD
	 * ç”¨æˆ·åˆ—è¡¨é¡µé¢
=======
	 * ÓÃ»§ÁĞ±íÒ³Ãæ
>>>>>>> å»ºæä¹‹å®¶
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public ModelAndView list(ModelAndView model){
		Map<String, Object> queryMap = new HashMap<String, Object>();
		model.addObject("roleList", roleService.findList(queryMap));
		model.setViewName("user/list");
		return model;
	}
	
	/**
<<<<<<< HEAD
	 * è·å–ç”¨æˆ·åˆ—è¡¨
=======
	 * »ñÈ¡ÓÃ»§ÁĞ±í
>>>>>>> å»ºæä¹‹å®¶
	 * @param page
	 * @param username
	 * @param roleId
	 * @param sex
	 * @return
	 */
	@RequestMapping(value="/list",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getList(Page page,
			@RequestParam(name="username",required=false,defaultValue="") String username,
			@RequestParam(name="roleId",required=false) Long roleId,
			@RequestParam(name="sex",required=false) Integer sex
			){
		Map<String, Object> ret = new HashMap<String, Object>();
		Map<String, Object> queryMap = new HashMap<String, Object>();
		queryMap.put("username", username);
		queryMap.put("roleId", roleId);
		queryMap.put("sex", sex);
		queryMap.put("offset", page.getOffset());
		queryMap.put("pageSize", page.getRows());
		ret.put("rows", userService.findList(queryMap));
		ret.put("total", userService.getTotal(queryMap));
		return ret;
	}
	
	/**
<<<<<<< HEAD
	 * æ·»åŠ ç”¨æˆ·
=======
	 * Ìí¼ÓÓÃ»§
>>>>>>> å»ºæä¹‹å®¶
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/add",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, String> add(User user){
		Map<String, String> ret = new HashMap<String, String>();
		if(user == null){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "è¯·å¡«å†™æ­£ç¡®çš„ç”¨æˆ·ä¿¡æ¯ï¼");
=======
			ret.put("msg", "ÇëÌîĞ´ÕıÈ·µÄÓÃ»§ĞÅÏ¢£¡");
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
		if(user.getRoleId() == null){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "è¯·é€‰æ‹©æ‰€å±è§’è‰²ï¼");
=======
			ret.put("msg", "ÇëÑ¡ÔñËùÊô½ÇÉ«£¡");
>>>>>>> å»ºæä¹‹å®¶
			return ret;
		}
		if(isExist(user.getUsername(), 0l)){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "è¯¥ç”¨æˆ·åå·²ç»å­˜åœ¨ï¼Œè¯·é‡æ–°è¾“å…¥ï¼");
=======
			ret.put("msg", "¸ÃÓÃ»§ÃûÒÑ¾­´æÔÚ£¬ÇëÖØĞÂÊäÈë£¡");
>>>>>>> å»ºæä¹‹å®¶
			return ret;
		}
		if(userService.add(user) <= 0){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "ç”¨æˆ·æ·»åŠ å¤±è´¥ï¼Œè¯·è”ç³»ç®¡ç†å‘˜ï¼");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "è§’è‰²æ·»åŠ æˆåŠŸï¼");
=======
			ret.put("msg", "ÓÃ»§Ìí¼ÓÊ§°Ü£¬ÇëÁªÏµ¹ÜÀíÔ±£¡");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "½ÇÉ«Ìí¼Ó³É¹¦£¡");
>>>>>>> å»ºæä¹‹å®¶
		return ret;
	}
	
	/**
<<<<<<< HEAD
	 * ç¼–è¾‘ç”¨æˆ·
=======
	 * ±à¼­ÓÃ»§
>>>>>>> å»ºæä¹‹å®¶
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/edit",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, String> edit(User user){
		Map<String, String> ret = new HashMap<String, String>();
		if(user == null){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "è¯·å¡«å†™æ­£ç¡®çš„ç”¨æˆ·ä¿¡æ¯ï¼");
=======
			ret.put("msg", "ÇëÌîĞ´ÕıÈ·µÄÓÃ»§ĞÅÏ¢£¡");
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
//		if(StringUtils.isEmpty(user.getPassword())){
//			ret.put("type", "error");
<<<<<<< HEAD
//			ret.put("msg", "è¯·å¡«å†™å¯†ç ï¼");
=======
//			ret.put("msg", "ÇëÌîĞ´ÃÜÂë£¡");
>>>>>>> å»ºæä¹‹å®¶
//			return ret;
//		}
		if(user.getRoleId() == null){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "è¯·é€‰æ‹©æ‰€å±è§’è‰²ï¼");
=======
			ret.put("msg", "ÇëÑ¡ÔñËùÊô½ÇÉ«£¡");
>>>>>>> å»ºæä¹‹å®¶
			return ret;
		}
		if(isExist(user.getUsername(), user.getId())){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "è¯¥ç”¨æˆ·åå·²ç»å­˜åœ¨ï¼Œè¯·é‡æ–°è¾“å…¥ï¼");
=======
			ret.put("msg", "¸ÃÓÃ»§ÃûÒÑ¾­´æÔÚ£¬ÇëÖØĞÂÊäÈë£¡");
>>>>>>> å»ºæä¹‹å®¶
			return ret;
		}
		if(userService.edit(user) <= 0){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "ç”¨æˆ·æ·»åŠ å¤±è´¥ï¼Œè¯·è”ç³»ç®¡ç†å‘˜ï¼");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "è§’è‰²æ·»åŠ æˆåŠŸï¼");
=======
			ret.put("msg", "ÓÃ»§Ìí¼ÓÊ§°Ü£¬ÇëÁªÏµ¹ÜÀíÔ±£¡");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "½ÇÉ«Ìí¼Ó³É¹¦£¡");
>>>>>>> å»ºæä¹‹å®¶
		return ret;
	}
	
	/**
<<<<<<< HEAD
	 * æ‰¹é‡åˆ é™¤ç”¨æˆ·
=======
	 * ÅúÁ¿É¾³ıÓÃ»§
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
		if(userService.delete(ids) <= 0){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "ç”¨æˆ·åˆ é™¤å¤±è´¥ï¼Œè¯·è”ç³»ç®¡ç†å‘˜ï¼");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "ç”¨æˆ·åˆ é™¤æˆåŠŸï¼");
=======
			ret.put("msg", "ÓÃ»§É¾³ıÊ§°Ü£¬ÇëÁªÏµ¹ÜÀíÔ±£¡");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "ÓÃ»§É¾³ı³É¹¦£¡");
>>>>>>> å»ºæä¹‹å®¶
		return ret;
	}
	
	/**
<<<<<<< HEAD
	 * ä¸Šä¼ å›¾ç‰‡
=======
	 * ÉÏ´«Í¼Æ¬
>>>>>>> å»ºæä¹‹å®¶
	 * @param photo
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/upload_photo",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, String> uploadPhoto(MultipartFile photo,HttpServletRequest request){
		Map<String, String> ret = new HashMap<String, String>();
		if(photo == null){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "é€‰æ‹©è¦ä¸Šä¼ çš„æ–‡ä»¶ï¼");
=======
			ret.put("msg", "Ñ¡ÔñÒªÉÏ´«µÄÎÄ¼ş£¡");
>>>>>>> å»ºæä¹‹å®¶
			return ret;
		}
		if(photo.getSize() > 1024*1024*1024){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "æ–‡ä»¶å¤§å°ä¸èƒ½è¶…è¿‡10Mï¼");
			return ret;
		}
		//è·å–æ–‡ä»¶åç¼€
		String suffix = photo.getOriginalFilename().substring(photo.getOriginalFilename().lastIndexOf(".")+1,photo.getOriginalFilename().length());
		if(!"jpg,jpeg,gif,png".toUpperCase().contains(suffix.toUpperCase())){
			ret.put("type", "error");
			ret.put("msg", "è¯·é€‰æ‹©jpg,jpeg,gif,pngæ ¼å¼çš„å›¾ç‰‡ï¼");
=======
			ret.put("msg", "ÎÄ¼ş´óĞ¡²»ÄÜ³¬¹ı10M£¡");
			return ret;
		}
		//»ñÈ¡ÎÄ¼şºó×º
		String suffix = photo.getOriginalFilename().substring(photo.getOriginalFilename().lastIndexOf(".")+1,photo.getOriginalFilename().length());
		if(!"jpg,jpeg,gif,png".toUpperCase().contains(suffix.toUpperCase())){
			ret.put("type", "error");
			ret.put("msg", "ÇëÑ¡Ôñjpg,jpeg,gif,png¸ñÊ½µÄÍ¼Æ¬£¡");
>>>>>>> å»ºæä¹‹å®¶
			return ret;
		}
		String savePath = request.getServletContext().getRealPath("/") + "/resources/upload/";
		File savePathFile = new File(savePath);
		if(!savePathFile.exists()){
<<<<<<< HEAD
			//è‹¥ä¸å­˜åœ¨æ”¹ç›®å½•ï¼Œåˆ™åˆ›å»ºç›®å½•
=======
			//Èô²»´æÔÚ¸ÄÄ¿Â¼£¬Ôò´´½¨Ä¿Â¼
>>>>>>> å»ºæä¹‹å®¶
			savePathFile.mkdir();
		}
		String filename = new Date().getTime()+"."+suffix;
		try {
<<<<<<< HEAD
			//å°†æ–‡ä»¶ä¿å­˜è‡³æŒ‡å®šç›®å½•
=======
			//½«ÎÄ¼ş±£´æÖÁÖ¸¶¨Ä¿Â¼
>>>>>>> å»ºæä¹‹å®¶
			photo.transferTo(new File(savePath+filename));
		}catch (Exception e) {
			// TODO Auto-generated catch block
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "ä¿å­˜æ–‡ä»¶å¼‚å¸¸ï¼");
=======
			ret.put("msg", "±£´æÎÄ¼şÒì³££¡");
>>>>>>> å»ºæä¹‹å®¶
			e.printStackTrace();
			return ret;
		}
		ret.put("type", "success");
<<<<<<< HEAD
		ret.put("msg", "ç”¨æˆ·åˆ é™¤æˆåŠŸï¼");
=======
		ret.put("msg", "ÓÃ»§É¾³ı³É¹¦£¡");
>>>>>>> å»ºæä¹‹å®¶
		ret.put("filepath",request.getServletContext().getContextPath() + "/resources/upload/" + filename );
		return ret;
	}
	/**
<<<<<<< HEAD
	 * åˆ¤æ–­è¯¥ç”¨æˆ·åæ˜¯å¦å­˜åœ¨
=======
	 * ÅĞ¶Ï¸ÃÓÃ»§ÃûÊÇ·ñ´æÔÚ
>>>>>>> å»ºæä¹‹å®¶
	 * @param username
	 * @param id
	 * @return
	 */
	private boolean isExist(String username,Long id){
		User user = userService.findByUsername(username);
		if(user == null)return false;
		if(user.getId().longValue() == id.longValue())return false;
		return true;
	}
}
