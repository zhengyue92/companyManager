package dao;

import java.util.ArrayList;
import java.util.List;

import entity.ComputerDesk;

public interface ComputerDeskDao {
	
	/**
	 * 电脑桌仓库 所有的电脑桌全部存放至该仓库 包括已分配、报修、未分配
	 */
	static List<ComputerDesk> warehouse = new ArrayList<ComputerDesk>();
	
	
	/**
	 * 采购电脑桌入库
	 * @param computerDesk
	 */
	void add(ComputerDesk computerDesk);
	
	/**
	 * 获取所有电脑桌列表
	 * @return
	 */
	List<ComputerDesk> getWarehouse();
	
}
