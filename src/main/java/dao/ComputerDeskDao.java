package dao;

import java.util.ArrayList;
import java.util.List;

import entity.ComputerDesk;

public interface ComputerDeskDao {
	
	/**
	 * �������ֿ� ���еĵ�����ȫ��������òֿ� �����ѷ��䡢���ޡ�δ����
	 */
	static List<ComputerDesk> warehouse = new ArrayList<ComputerDesk>();
	
	
	/**
	 * �ɹ����������
	 * @param computerDesk
	 */
	void add(ComputerDesk computerDesk);
	
	/**
	 * ��ȡ���е������б�
	 * @return
	 */
	List<ComputerDesk> getWarehouse();
	
}
