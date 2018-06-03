package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import config.ResponseCode;
import entity.Base;
import entity.ComputerDesk;
import service.ComputerDeskService;

/**
 * 电脑桌管理
 * @author zheng_000
 *
 */
@Controller
@ResponseBody
public class ComputerDeskController {
	@Autowired
	ComputerDeskService deskService;
	
	/**
	 * 查询电脑 列表
	 * @param computerDesk
	 * @return
	 */
	@RequestMapping(path="/list")
	public Base list() {
		Base base = new Base();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<ComputerDesk> list = null;
		try {
			list = deskService.getDeskList();
		} catch (Exception e) {
			e.printStackTrace();
			base.setCode(ResponseCode.EXPECTATION_FAILED.code);
			base.setMessage(ResponseCode.EXPECTATION_FAILED.reasonPhrase);
			return base;
		}
		
		if (list == null) {
			list = new ArrayList<ComputerDesk>(0);
		}
		
		data.put("list", list);
		base.setCode(ResponseCode.SUCCESS.code);
		base.setMessage(ResponseCode.SUCCESS.reasonPhrase);
		base.setData(data);
		return base;
	}
	
	/**
	 * 采购电脑桌
	 * @param computerDesk
	 * @return
	 */
	@RequestMapping(path="/add")
	public Base add(ComputerDesk computerDesk) {
		Base base = new Base();
		computerDesk.setStatus("未使用");
		computerDesk.setUseOffice("未使用");
		try {
			deskService.save(computerDesk);
		} catch (Exception e) {
			e.printStackTrace();
			base.setCode(ResponseCode.EXPECTATION_FAILED.code);
			base.setMessage(ResponseCode.EXPECTATION_FAILED.reasonPhrase);
			return base;
		}
		
		base.setCode(ResponseCode.SUCCESS.code);
		base.setMessage(ResponseCode.SUCCESS.reasonPhrase);
		return base;
	}
	
	/**
	 * 报修电脑桌
	 * @param id
	 * @return
	 */
	@RequestMapping(path="/repairs")
	public Base repairs(Integer id) {
		Base base = new Base();
		
		int result = 0;
		
		try {
			result = deskService.repairs(id);
		} catch (Exception e) {
			e.printStackTrace();
			base.setCode(ResponseCode.EXPECTATION_FAILED.code);
			base.setMessage(ResponseCode.EXPECTATION_FAILED.reasonPhrase);
			return base;
		}
		
		if (result == 1) {
			base.setCode(ResponseCode.SUCCESS.code);
			base.setMessage(ResponseCode.SUCCESS.reasonPhrase);
		} else if(result == -1) {
			base.setCode(ResponseCode.EXPECTATION_FAILED.code);
			base.setMessage("仓库中已经没有该种类的电脑桌，请先采购该种类电脑桌");
		}
		return base;
	}
	
	/**
	 * 维修电脑桌
	 * @param id
	 * @return
	 */
	@RequestMapping(path="/maintain")
	public Base maintain(Integer id) {
		Base base = new Base();
		
		try {
			deskService.maintain(id);
		} catch (Exception e) {
			e.printStackTrace();
			base.setCode(ResponseCode.EXPECTATION_FAILED.code);
			base.setMessage(ResponseCode.EXPECTATION_FAILED.reasonPhrase);
			return base;
		}
		
		base.setCode(ResponseCode.SUCCESS.code);
		base.setMessage(ResponseCode.SUCCESS.reasonPhrase);
		return base;
	}
	
	/**
	 * 分配电脑
	 * @param id
	 * @param useOffice
	 * @return
	 */
	@RequestMapping(path="/allotCtro")
	public Base allot(Integer id, String useOffice) {
		Base base = new Base();
		
		try {
			deskService.allot(id, useOffice);
		} catch (Exception e) {
			e.printStackTrace();
			base.setCode(ResponseCode.EXPECTATION_FAILED.code);
			base.setMessage(ResponseCode.EXPECTATION_FAILED.reasonPhrase);
			return base;
		}
		
		base.setCode(ResponseCode.SUCCESS.code);
		base.setMessage(ResponseCode.SUCCESS.reasonPhrase);
		return base;
	}
	
}
