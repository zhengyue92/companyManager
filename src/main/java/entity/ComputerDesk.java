package entity;


/**
 * 电脑桌 实体类
 * @author zheng_000
 *
 */
public class ComputerDesk {
	
	/**
	 * id 唯一表示
	 */
	private int id;
	
	/**
	 * 颜色
	 */
	private String color;
	
	/**
	 * 尺寸
	 */
	private Integer size;
	
	/**
	 * 价格
	 */
	private Double price;
	
	/**
	 * 使用办公室（A-E办公室、未使用）
	 */
	private String useOffice;
	
	/**
	 * 电脑桌状态（使用中、维修中、未使用）
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
	 * 重写 equals 只要颜色和尺寸合适则表示 同一电脑
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
		
		if (this.color != null && other.getColor() != null && this.size != null && other.getSize() != null//传入电脑桌与本电脑桌颜色和尺寸参数均不为null
				&& this.color.equals(other.getColor()) && this.size == other.getSize()//判断 颜色和尺寸合适则表示为同一电脑桌
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
