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
 * 日志管理控制器
 * @author llq
=======
 * ��־����������
 * @author 12753
>>>>>>> 建材之家
 *
 */
@RequestMapping("/admin/log")
@Controller
public class LogController {
	@Autowired
	private LogService logService;
	
	/**
<<<<<<< HEAD
	 * 日志列表页面
=======
	 * ��־�б�ҳ��
>>>>>>> 建材之家
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
	 * 获取日志列表
=======
	 * ��ȡ��־�б�
>>>>>>> 建材之家
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
	 * 添加日志
=======
	 * ������־
>>>>>>> 建材之家
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
			ret.put("msg", "请填写正确的日志信息！");
=======
			ret.put("msg", "����д��ȷ����־��Ϣ��");
>>>>>>> 建材之家
			return ret;
		}
		if(StringUtils.isEmpty(log.getContent())){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "请填写日志内容！");
=======
			ret.put("msg", "����д��־���ݣ�");
>>>>>>> 建材之家
			return ret;
		}
		log.setCreateTime(new Date());
		if(logService.add(log) <= 0){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "日志添加失败，请联系管理员！");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "日志添加成功！");
=======
			ret.put("msg", "��־����ʧ�ܣ�����ϵ����Ա��");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "��־���ӳɹ���");
>>>>>>> 建材之家
		return ret;
	}
	
	
	
	/**
<<<<<<< HEAD
	 * 批量删除日志
=======
	 * ����ɾ����־
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
		if(logService.delete(ids) <= 0){
			ret.put("type", "error");
<<<<<<< HEAD
			ret.put("msg", "日志删除失败，请联系管理员！");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "日志删除成功！");
=======
			ret.put("msg", "��־ɾ��ʧ�ܣ�����ϵ����Ա��");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "��־ɾ���ɹ���");
>>>>>>> 建材之家
		return ret;
	}
	
	
}
