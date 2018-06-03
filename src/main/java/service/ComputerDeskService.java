package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ComputerDeskDao;
import entity.ComputerDesk;

/**
 * 电脑桌业务逻辑层
 * @author zheng_000
 *
 */
@Service
public class ComputerDeskService {
	@Autowired
	ComputerDeskDao computerDeskDao;
	
	/**
	 * 采购电脑桌 入库
	 * @param computerDesk
	 */
	public void save(ComputerDesk computerDesk) throws Exception {
		computerDeskDao.add(computerDesk);
	}
	
	/**
	 * 获取电脑桌列表
	 * @return
	 * @throws Exception
	 */
	public List<ComputerDesk> getDeskList()  throws Exception {
		return computerDeskDao.getWarehouse();
	}
	
	/**
	 * 报修电脑桌
	 * @param id
	 * @return
	 */
	public int repairs(Integer id) throws Exception {
		int result = 0;
		//获取电脑桌集合
		List<ComputerDesk> warehouse = computerDeskDao.getWarehouse();
		ComputerDesk thisDesk = warehouse.get(id - 1);//获取当前电脑桌
		boolean flag = false;//定义查找标记，当仓库中有同款未使用的电脑桌时改为true
		for (ComputerDesk computerDesk : warehouse) {
			if ("未使用".equals(computerDesk.getUseOffice()) && "未使用".equals(computerDesk.getStatus())
					&& computerDesk.equals(thisDesk)) {//判断 该电脑桌 处于无人使用状态 并且与报修的电脑桌为同一款
				flag = true;//修改标记
				computerDesk.setUseOffice(thisDesk.getUseOffice());//分配该电脑桌到损坏电脑桌的办公室
				computerDesk.setStatus("使用中");//更改电脑桌状态为使用中
				
				thisDesk.setStatus("维修中");//将之前电脑桌修改为维修中
				break;//跳出循环
			}
		}
		if (flag) {
			result = 1;
		} else {
			result = -1;
		} 
		return result;
	}
	
	/**
	 * 维修电脑桌
	 * @param id
	 */
	public void maintain(Integer id) {
		//获取电脑桌集合
		List<ComputerDesk> warehouse = computerDeskDao.getWarehouse();
		ComputerDesk thisDesk = warehouse.get(id - 1);//获取当前电脑桌
		thisDesk.setUseOffice("未使用");//将电脑桌设置为未使用 放回仓库
		thisDesk.setStatus("未使用");//更改电脑桌状态为未使用
	}
	
	/**
	 * 分配电脑桌
	 * @param id
	 * @param useOffice
	 */
	public void allot(Integer id, String useOffice) {
		//获取电脑桌集合
		List<ComputerDesk> warehouse = computerDeskDao.getWarehouse();
		ComputerDesk thisDesk = warehouse.get(id - 1);//获取当前电脑桌
		thisDesk.setUseOffice(useOffice);
		thisDesk.setStatus("使用中");
		
	}

}
