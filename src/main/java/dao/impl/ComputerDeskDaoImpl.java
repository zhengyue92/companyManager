package dao.impl;



import java.util.List;

import org.springframework.stereotype.Repository;

import dao.ComputerDeskDao;
import entity.ComputerDesk;
@Repository("computerDeskDao")
public class ComputerDeskDaoImpl implements ComputerDeskDao{
	
	public ComputerDeskDaoImpl() {
		super();
		warehouse.add(new ComputerDesk(1, "黑色", 120, 200.00, "A办公室", "使用中"));
		warehouse.add(new ComputerDesk(2, "白色", 160, 200.00, "B办公室", "使用中"));
		warehouse.add(new ComputerDesk(3, "白色", 120, 200.00, "C办公室", "使用中"));
		warehouse.add(new ComputerDesk(4, "黑色", 160, 300.00, "D办公室", "使用中"));
		warehouse.add(new ComputerDesk(5, "白色", 120, 300.00, "E办公室", "使用中"));
		warehouse.add(new ComputerDesk(6, "黑色", 120, 200.00, "A办公室", "使用中"));
		warehouse.add(new ComputerDesk(7, "白色", 160, 300.00, "B办公室", "使用中"));
		warehouse.add(new ComputerDesk(8, "黑色", 120, 200.00, "C办公室", "使用中"));
		warehouse.add(new ComputerDesk(9, "黑色", 160, 200.00, "D办公室", "使用中"));
		warehouse.add(new ComputerDesk(10, "黑色", 120, 200.00, "E办公室", "使用中"));
		warehouse.add(new ComputerDesk(11, "黑色", 120, 200.00, "未使用", "未使用"));
		warehouse.add(new ComputerDesk(12, "白色", 160, 200.00, "B办公室", "维修中"));
		warehouse.add(new ComputerDesk(13, "白色", 120, 200.00, "未使用", "未使用"));
		warehouse.add(new ComputerDesk(14, "黑色", 160, 300.00, "未使用", "未使用"));
		warehouse.add(new ComputerDesk(15, "白色", 120, 300.00, "未使用", "未使用"));
		warehouse.add(new ComputerDesk(16, "黑色", 120, 200.00, "未使用", "未使用"));
		warehouse.add(new ComputerDesk(17, "白色", 160, 300.00, "未使用", "未使用"));
		warehouse.add(new ComputerDesk(18, "黑色", 120, 200.00, "未使用", "未使用"));
		warehouse.add(new ComputerDesk(19, "黑色", 160, 200.00, "未使用", "未使用"));
		warehouse.add(new ComputerDesk(20, "黑色", 120, 200.00, "未使用", "未使用"));
	}
	
	/**
	 * 采购电脑 入库
	 */
	public synchronized void add(ComputerDesk computerDesk) {
		computerDesk.setId(warehouse.size() + 1);
		warehouse.add(computerDesk);
	}
	
	/**
	 * 获取电脑桌列表
	 */
	public List<ComputerDesk> getWarehouse() {
		return warehouse;
	}
	
	
	
	
}
