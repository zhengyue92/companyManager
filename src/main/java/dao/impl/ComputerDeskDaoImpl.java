package dao.impl;



import java.util.List;

import org.springframework.stereotype.Repository;

import dao.ComputerDeskDao;
import entity.ComputerDesk;
@Repository("computerDeskDao")
public class ComputerDeskDaoImpl implements ComputerDeskDao{
	
	public ComputerDeskDaoImpl() {
		super();
		warehouse.add(new ComputerDesk(1, "��ɫ", 120, 200.00, "A�칫��", "ʹ����"));
		warehouse.add(new ComputerDesk(2, "��ɫ", 160, 200.00, "B�칫��", "ʹ����"));
		warehouse.add(new ComputerDesk(3, "��ɫ", 120, 200.00, "C�칫��", "ʹ����"));
		warehouse.add(new ComputerDesk(4, "��ɫ", 160, 300.00, "D�칫��", "ʹ����"));
		warehouse.add(new ComputerDesk(5, "��ɫ", 120, 300.00, "E�칫��", "ʹ����"));
		warehouse.add(new ComputerDesk(6, "��ɫ", 120, 200.00, "A�칫��", "ʹ����"));
		warehouse.add(new ComputerDesk(7, "��ɫ", 160, 300.00, "B�칫��", "ʹ����"));
		warehouse.add(new ComputerDesk(8, "��ɫ", 120, 200.00, "C�칫��", "ʹ����"));
		warehouse.add(new ComputerDesk(9, "��ɫ", 160, 200.00, "D�칫��", "ʹ����"));
		warehouse.add(new ComputerDesk(10, "��ɫ", 120, 200.00, "E�칫��", "ʹ����"));
		warehouse.add(new ComputerDesk(11, "��ɫ", 120, 200.00, "δʹ��", "δʹ��"));
		warehouse.add(new ComputerDesk(12, "��ɫ", 160, 200.00, "B�칫��", "ά����"));
		warehouse.add(new ComputerDesk(13, "��ɫ", 120, 200.00, "δʹ��", "δʹ��"));
		warehouse.add(new ComputerDesk(14, "��ɫ", 160, 300.00, "δʹ��", "δʹ��"));
		warehouse.add(new ComputerDesk(15, "��ɫ", 120, 300.00, "δʹ��", "δʹ��"));
		warehouse.add(new ComputerDesk(16, "��ɫ", 120, 200.00, "δʹ��", "δʹ��"));
		warehouse.add(new ComputerDesk(17, "��ɫ", 160, 300.00, "δʹ��", "δʹ��"));
		warehouse.add(new ComputerDesk(18, "��ɫ", 120, 200.00, "δʹ��", "δʹ��"));
		warehouse.add(new ComputerDesk(19, "��ɫ", 160, 200.00, "δʹ��", "δʹ��"));
		warehouse.add(new ComputerDesk(20, "��ɫ", 120, 200.00, "δʹ��", "δʹ��"));
	}
	
	/**
	 * �ɹ����� ���
	 */
	public synchronized void add(ComputerDesk computerDesk) {
		computerDesk.setId(warehouse.size() + 1);
		warehouse.add(computerDesk);
	}
	
	/**
	 * ��ȡ�������б�
	 */
	public List<ComputerDesk> getWarehouse() {
		return warehouse;
	}
	
	
	
	
}
