package entity;


/**
 * ������ ʵ����
 * @author zheng_000
 *
 */
public class ComputerDesk {
	
	/**
	 * id Ψһ��ʾ
	 */
	private int id;
	
	/**
	 * ��ɫ
	 */
	private String color;
	
	/**
	 * �ߴ�
	 */
	private Integer size;
	
	/**
	 * �۸�
	 */
	private Double price;
	
	/**
	 * ʹ�ð칫�ң�A-E�칫�ҡ�δʹ�ã�
	 */
	private String useOffice;
	
	/**
	 * ������״̬��ʹ���С�ά���С�δʹ�ã�
	 */
	private String status;

	
	
	public ComputerDesk() {
		super();
	}

	public ComputerDesk(int id, String color, Integer size, Double price, String useOffice, String status) {
		super();
		this.id = id;
		this.color = color;
		this.size = size;
		this.price = price;
		this.useOffice = useOffice;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getUseOffice() {
		return useOffice;
	}

	public void setUseOffice(String useOffice) {
		this.useOffice = useOffice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + id;
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((useOffice == null) ? 0 : useOffice.hashCode());
		return result;
	}
	
	/**
	 * ��д equals ֻҪ��ɫ�ͳߴ�������ʾ ͬһ����
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		ComputerDesk other = (ComputerDesk) obj;
		
		if (this.color != null && other.getColor() != null && this.size != null && other.getSize() != null//����������뱾��������ɫ�ͳߴ��������Ϊnull
				&& this.color.equals(other.getColor()) && this.size == other.getSize()//�ж� ��ɫ�ͳߴ�������ʾΪͬһ������
				) {
			return true;
		} else {
			return true;
		}
		
	}

	@Override
	public String toString() {
		return "ComputerDesk [id=" + id + ", color=" + color + ", size=" + size + ", price=" + price + ", useOffice="
				+ useOffice + ", status=" + status + "]";
	}
	
}
