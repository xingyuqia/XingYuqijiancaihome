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
 * 系统操作类控制器
 * @author llq
=======
 * ϵͳ�����������
 * @author 12753
>>>>>>> 建材之家
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
	 * 系统登录后的主页
=======
	 * ϵͳ��¼�����ҳ
>>>>>>> 建材之家
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
	 * 系统登录后的欢迎页
=======
	 * ϵͳ��¼��Ļ�ӭҳ
>>>>>>> 建材之家
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
	 * 登陆页面
=======
	 * ��½ҳ��
>>>>>>> 建材之家
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
	 * 登录表单提交处理控制器
=======
	 * ��¼���ύ���������
>>>>>>> 建材之家
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
			ret.put("msg", "请填写用户信息！");
=======
			ret.put("msg", "����д�û���Ϣ��");
>>>>>>> 建材之家
			return ret;
		}
		if(StringUtils.isEmpty(cpacha)){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "请填写验证码！");
=======
			ret.put("msg", "����д��֤�룡");
>>>>>>> 建材之家
			return ret;
		}
		if(StringUtils.isEmpty(user.getUsername())){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "请填写用户名！");
=======
			ret.put("msg", "����д�û�����");
>>>>>>> 建材之家
			return ret;
		}
		if(StringUtils.isEmpty(user.getPassword())){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "请填写密码！");
=======
			ret.put("msg", "����д���룡");
>>>>>>> 建材之家
			return ret;
		}
		Object loginCpacha = request.getSession().getAttribute("loginCpacha");
		if(loginCpacha == null){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "会话超时，请刷新页面！");
=======
			ret.put("msg", "�Ự��ʱ����ˢ��ҳ�棡");
>>>>>>> 建材之家
			return ret;
		}
		if(!cpacha.toUpperCase().equals(loginCpacha.toString().toUpperCase())){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "验证码错误！");
			logService.add("用户名为"+user.getUsername()+"的用户登录时输入验证码错误!");
=======
			ret.put("msg", "��֤�����");
			logService.add("�û���Ϊ"+user.getUsername()+"���û���¼ʱ������֤�����!");
>>>>>>> 建材之家
			return ret;
		}
		User findByUsername = userService.findByUsername(user.getUsername());
		if(findByUsername == null){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "该用户名不存在！");
			logService.add("登录时，用户名为"+user.getUsername()+"的用户不存在!");
=======
			ret.put("msg", "���û��������ڣ�");
			logService.add("��¼ʱ���û���Ϊ"+user.getUsername()+"���û�������!");
>>>>>>> 建材之家
			return ret;
		}
		if(!user.getPassword().equals(findByUsername.getPassword())){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "密码错误！");
			logService.add("用户名为"+user.getUsername()+"的用户登录时输入密码错误!");
			return ret;
		}
		//说明用户名密码及验证码都正确
		//此时需要查询用户的角色权限
		Role role = roleService.find(findByUsername.getRoleId());
		List<Authority> authorityList = authorityService.findListByRoleId(role.getId());//根据角色获取权限列表
=======
			ret.put("msg", "�������");
			logService.add("�û���Ϊ"+user.getUsername()+"���û���¼ʱ�����������!");
			return ret;
		}
		//˵���û������뼰��֤�붼��ȷ
		//��ʱ��Ҫ��ѯ�û��Ľ�ɫȨ��
		Role role = roleService.find(findByUsername.getRoleId());
		List<Authority> authorityList = authorityService.findListByRoleId(role.getId());//���ݽ�ɫ��ȡȨ���б�
>>>>>>> 建材之家
		String menuIds = "";
		for(Authority authority:authorityList){
			menuIds += authority.getMenuId() + ",";
		}
		if(!StringUtils.isEmpty(menuIds)){
			menuIds = menuIds.substring(0,menuIds.length()-1);
		}
		List<Menu> userMenus = menuService.findListByIds(menuIds);
<<<<<<< HEAD
		//把角色信息、菜单信息放到session中
=======
		//�ѽ�ɫ��Ϣ���˵���Ϣ�ŵ�session��
>>>>>>> 建材之家
		request.getSession().setAttribute("admin", findByUsername);
		request.getSession().setAttribute("role", role);
		request.getSession().setAttribute("userMenus", userMenus);
		ret.put("type", "success");
<<<<<<< HEAD
		ret.put("msg", "登录成功！");
		logService.add("用户名为{"+user.getUsername()+"}，角色为{"+role.getName()+"}的用户登录成功!");
=======
		ret.put("msg", "��¼�ɹ���");
		logService.add("�û���Ϊ{"+user.getUsername()+"}����ɫΪ{"+role.getName()+"}���û���¼�ɹ�!");
>>>>>>> 建材之家
		return ret;
	}
	
	/**
<<<<<<< HEAD
	 * 后台退出注销功能
=======
	 * ��̨�˳�ע������
>>>>>>> 建材之家
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
	 * 修改密码页面
=======
	 * �޸�����ҳ��
>>>>>>> 建材之家
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
			ret.put("msg", "请填写新密码！");
=======
			ret.put("msg", "����д�����룡");
>>>>>>> 建材之家
			return ret;
		}
		User user = (User)request.getSession().getAttribute("admin");
		if(!user.getPassword().equals(oldpassword)){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "原密码错误！");
=======
			ret.put("msg", "ԭ�������");
>>>>>>> 建材之家
			return ret;
		}
		user.setPassword(newpassword);
		if(userService.editPassword(user) <= 0){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "密码修改失败，请联系管理员！");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "密码修改成功！");
		logService.add("用户名为{"+user.getUsername()+"}，的用户成功修改密码!");
=======
			ret.put("msg", "�����޸�ʧ�ܣ�����ϵ����Ա��");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "�����޸ĳɹ���");
		logService.add("�û���Ϊ{"+user.getUsername()+"}�����û��ɹ��޸�����!");
>>>>>>> 建材之家
		return ret;
	} 
	
	/**
<<<<<<< HEAD
	 * 本系统所有的验证码均采用此方法
	 * @param vcodeLen
	 * @param width
	 * @param height
	 * @param cpachaType:用来区别验证码的类型，传入字符串
=======
	 * ��ϵͳ���е���֤������ô˷���
	 * @param vcodeLen
	 * @param width
	 * @param height
	 * @param cpachaType:����������֤������ͣ������ַ���
>>>>>>> 建材之家
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
