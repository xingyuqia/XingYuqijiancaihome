package com.ischoolbar.programmer.interceptor.admin;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.ischoolbar.programmer.entity.admin.Menu;
import com.ischoolbar.programmer.util.MenuUtil;
/**
<<<<<<< HEAD
 * åå°ç™»å½•æ‹¦æˆªå™¨
 * @author llq
=======
 * ºóÌ¨µÇÂ¼À¹½ØÆ÷
 * @author 12753
>>>>>>> å»ºæä¹‹å®¶
 *
 */
public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object arg2) throws Exception {
		// TODO Auto-generated method stub
		String requestURI = request.getRequestURI();
		Object admin = request.getSession().getAttribute("admin");
		if(admin == null){
<<<<<<< HEAD
			//è¡¨ç¤ºæœªç™»å½•æˆ–è€…ç™»å½•å¤±æ•ˆ
			System.out.println("é“¾æ¥"+requestURI+"è¿›å…¥æ‹¦æˆªå™¨ï¼");
			String header = request.getHeader("X-Requested-With");
			//åˆ¤æ–­æ˜¯å¦æ˜¯ajaxè¯·æ±‚
			if("XMLHttpRequest".equals(header)){
				//è¡¨ç¤ºæ˜¯ajaxè¯·æ±‚
				Map<String, String> ret = new HashMap<String, String>();
				ret.put("type", "error");
				ret.put("msg", "ç™»å½•ä¼šè¯è¶…æ—¶æˆ–è¿˜æœªç™»å½•ï¼Œè¯·é‡æ–°ç™»å½•!");
				response.getWriter().write(JSONObject.fromObject(ret).toString());
				return false;
			}
			//è¡¨ç¤ºæ˜¯æ™®é€šé“¾æ¥è·³è½¬ï¼Œç›´æ¥é‡å®šå‘åˆ°ç™»å½•é¡µé¢
			response.sendRedirect(request.getServletContext().getContextPath() + "/system/login");
			return false;
		}
		//è·å–èœå•id
=======
			//±íÊ¾Î´µÇÂ¼»òÕßµÇÂ¼Ê§Ğ§
			System.out.println("Á´½Ó"+requestURI+"½øÈëÀ¹½ØÆ÷£¡");
			String header = request.getHeader("X-Requested-With");
			//ÅĞ¶ÏÊÇ·ñÊÇajaxÇëÇó
			if("XMLHttpRequest".equals(header)){
				//±íÊ¾ÊÇajaxÇëÇó
				Map<String, String> ret = new HashMap<String, String>();
				ret.put("type", "error");
				ret.put("msg", "µÇÂ¼»á»°³¬Ê±»ò»¹Î´µÇÂ¼£¬ÇëÖØĞÂµÇÂ¼!");
				response.getWriter().write(JSONObject.fromObject(ret).toString());
				return false;
			}
			//±íÊ¾ÊÇÆÕÍ¨Á´½ÓÌø×ª£¬Ö±½ÓÖØ¶¨Ïòµ½µÇÂ¼Ò³Ãæ
			response.sendRedirect(request.getServletContext().getContextPath() + "/system/login");
			return false;
		}
		//»ñÈ¡²Ëµ¥id
>>>>>>> å»ºæä¹‹å®¶
		String mid = request.getParameter("_mid");
		if(!StringUtils.isEmpty(mid)){
			List<Menu> allThirdMenu = MenuUtil.getAllThirdMenu((List<Menu>)request.getSession().getAttribute("userMenus"), Long.valueOf(mid));
			request.setAttribute("thirdMenuList", allThirdMenu);
		}
		return true;
	}

}
