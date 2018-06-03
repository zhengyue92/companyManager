package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ComputerDeskDao;
import entity.ComputerDesk;

/**
 * ������ҵ���߼���
 * @author zheng_000
 *
 */
@Service
public class ComputerDeskService {
	@Autowired
	ComputerDeskDao computerDeskDao;
	
	/**
	 * �ɹ������� ���
	 * @param computerDesk
	 */
	public void save(ComputerDesk computerDesk) throws Exception {
		computerDeskDao.add(computerDesk);
	}
	
	/**
	 * ��ȡ�������б�
	 * @return
	 * @throws Exception
	 */
	public List<ComputerDesk> getDeskList()  throws Exception {
		return computerDeskDao.getWarehouse();
	}
	
	/**
	 * ���޵�����
	 * @param id
	 * @return
	 */
	public int repairs(Integer id) throws Exception {
		int result = 0;
		//��ȡ����������
		List<ComputerDesk> warehouse = computerDeskDao.getWarehouse();
		ComputerDesk thisDesk = warehouse.get(id - 1);//��ȡ��ǰ������
		boolean flag = false;//������ұ�ǣ����ֿ�����ͬ��δʹ�õĵ�����ʱ��Ϊtrue
		for (ComputerDesk computerDesk : warehouse) {
			if ("δʹ��".equals(computerDesk.getUseOffice()) && "δʹ��".equals(computerDesk.getStatus())
					&& computerDesk.equals(thisDesk)) {//�ж� �õ����� ��������ʹ��״̬ �����뱨�޵ĵ�����Ϊͬһ��
				flag = true;//�޸ı��
				computerDesk.setUseOffice(thisDesk.getUseOffice());//����õ��������𻵵������İ칫��
				computerDesk.setStatus("ʹ����");//���ĵ�����״̬Ϊʹ����
				
				thisDesk.setStatus("ά����");//��֮ǰ�������޸�Ϊά����
				break;//����ѭ��
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
	 * ά�޵�����
	 * @param id
	 */
	public void maintain(Integer id) {
		//��ȡ����������
		List<ComputerDesk> warehouse = computerDeskDao.getWarehouse();
		ComputerDesk thisDesk = warehouse.get(id - 1);//��ȡ��ǰ������
		thisDesk.setUseOffice("δʹ��");//������������Ϊδʹ�� �Żزֿ�
		thisDesk.setStatus("δʹ��");//���ĵ�����״̬Ϊδʹ��
	}
	
	/**
	 * ���������
	 * @param id
	 * @param useOffice
	 */
	public void allot(Integer id, String useOffice) {
		//��ȡ����������
		List<ComputerDesk> warehouse = computerDeskDao.getWarehouse();
		ComputerDesk thisDesk = warehouse.get(id - 1);//��ȡ��ǰ������
		thisDesk.setUseOffice(useOffice);
		thisDesk.setStatus("ʹ����");
		
	}

}
