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
 * 用户管理控制器
 * @author llq
=======
 * �û����������
 * @author 12753
>>>>>>> 建材之家
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
	 * 用户列表页面
=======
	 * �û��б�ҳ��
>>>>>>> 建材之家
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
	 * 获取用户列表
=======
	 * ��ȡ�û��б�
>>>>>>> 建材之家
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
	 * 添加用户
=======
	 * ����û�
>>>>>>> 建材之家
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
			ret.put("msg", "请填写正确的用户信息！");
=======
			ret.put("msg", "����д��ȷ���û���Ϣ��");
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
		if(user.getRoleId() == null){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "请选择所属角色！");
=======
			ret.put("msg", "��ѡ��������ɫ��");
>>>>>>> 建材之家
			return ret;
		}
		if(isExist(user.getUsername(), 0l)){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "该用户名已经存在，请重新输入！");
=======
			ret.put("msg", "���û����Ѿ����ڣ����������룡");
>>>>>>> 建材之家
			return ret;
		}
		if(userService.add(user) <= 0){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "用户添加失败，请联系管理员！");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "角色添加成功！");
=======
			ret.put("msg", "�û����ʧ�ܣ�����ϵ����Ա��");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "��ɫ��ӳɹ���");
>>>>>>> 建材之家
		return ret;
	}
	
	/**
<<<<<<< HEAD
	 * 编辑用户
=======
	 * �༭�û�
>>>>>>> 建材之家
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
			ret.put("msg", "请填写正确的用户信息！");
=======
			ret.put("msg", "����д��ȷ���û���Ϣ��");
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
//		if(StringUtils.isEmpty(user.getPassword())){
//			ret.put("type", "error");
<<<<<<< HEAD
//			ret.put("msg", "请填写密码！");
=======
//			ret.put("msg", "����д���룡");
>>>>>>> 建材之家
//			return ret;
//		}
		if(user.getRoleId() == null){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "请选择所属角色！");
=======
			ret.put("msg", "��ѡ��������ɫ��");
>>>>>>> 建材之家
			return ret;
		}
		if(isExist(user.getUsername(), user.getId())){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "该用户名已经存在，请重新输入！");
=======
			ret.put("msg", "���û����Ѿ����ڣ����������룡");
>>>>>>> 建材之家
			return ret;
		}
		if(userService.edit(user) <= 0){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "用户添加失败，请联系管理员！");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "角色添加成功！");
=======
			ret.put("msg", "�û����ʧ�ܣ�����ϵ����Ա��");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "��ɫ��ӳɹ���");
>>>>>>> 建材之家
		return ret;
	}
	
	/**
<<<<<<< HEAD
	 * 批量删除用户
=======
	 * ����ɾ���û�
>>>>>>> 建材之家
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
			ret.put("msg", "选择要删除的数据！");
=======
			ret.put("msg", "ѡ��Ҫɾ�������ݣ�");
>>>>>>> 建材之家
			return ret;
		}
		if(ids.contains(",")){
			ids = ids.substring(0,ids.length()-1);
		}
		if(userService.delete(ids) <= 0){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "用户删除失败，请联系管理员！");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "用户删除成功！");
=======
			ret.put("msg", "�û�ɾ��ʧ�ܣ�����ϵ����Ա��");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "�û�ɾ���ɹ���");
>>>>>>> 建材之家
		return ret;
	}
	
	/**
<<<<<<< HEAD
	 * 上传图片
=======
	 * �ϴ�ͼƬ
>>>>>>> 建材之家
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
			ret.put("msg", "选择要上传的文件！");
=======
			ret.put("msg", "ѡ��Ҫ�ϴ����ļ���");
>>>>>>> 建材之家
			return ret;
		}
		if(photo.getSize() > 1024*1024*1024){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "文件大小不能超过10M！");
			return ret;
		}
		//获取文件后缀
		String suffix = photo.getOriginalFilename().substring(photo.getOriginalFilename().lastIndexOf(".")+1,photo.getOriginalFilename().length());
		if(!"jpg,jpeg,gif,png".toUpperCase().contains(suffix.toUpperCase())){
			ret.put("type", "error");
			ret.put("msg", "请选择jpg,jpeg,gif,png格式的图片！");
=======
			ret.put("msg", "�ļ���С���ܳ���10M��");
			return ret;
		}
		//��ȡ�ļ���׺
		String suffix = photo.getOriginalFilename().substring(photo.getOriginalFilename().lastIndexOf(".")+1,photo.getOriginalFilename().length());
		if(!"jpg,jpeg,gif,png".toUpperCase().contains(suffix.toUpperCase())){
			ret.put("type", "error");
			ret.put("msg", "��ѡ��jpg,jpeg,gif,png��ʽ��ͼƬ��");
>>>>>>> 建材之家
			return ret;
		}
		String savePath = request.getServletContext().getRealPath("/") + "/resources/upload/";
		File savePathFile = new File(savePath);
		if(!savePathFile.exists()){
<<<<<<< HEAD
			//若不存在改目录，则创建目录
=======
			//�������ڸ�Ŀ¼���򴴽�Ŀ¼
>>>>>>> 建材之家
			savePathFile.mkdir();
		}
		String filename = new Date().getTime()+"."+suffix;
		try {
<<<<<<< HEAD
			//将文件保存至指定目录
=======
			//���ļ�������ָ��Ŀ¼
>>>>>>> 建材之家
			photo.transferTo(new File(savePath+filename));
		}catch (Exception e) {
			// TODO Auto-generated catch block
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "保存文件异常！");
=======
			ret.put("msg", "�����ļ��쳣��");
>>>>>>> 建材之家
			e.printStackTrace();
			return ret;
		}
		ret.put("type", "success");
<<<<<<< HEAD
		ret.put("msg", "用户删除成功！");
=======
		ret.put("msg", "�û�ɾ���ɹ���");
>>>>>>> 建材之家
		ret.put("filepath",request.getServletContext().getContextPath() + "/resources/upload/" + filename );
		return ret;
	}
	/**
<<<<<<< HEAD
	 * 判断该用户名是否存在
=======
	 * �жϸ��û����Ƿ����
>>>>>>> 建材之家
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
