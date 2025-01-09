package model;

public class KhachHang2 {

	private String id;
	private String hoVaTen;
	private int ngaySinh;
	private String diaChi;

	public KhachHang2() {
		super();
	}

	public KhachHang2(String id, String hoVaTen, int ngaySinh, String diaChi) {
		super();
		this.id = id;
		this.hoVaTen = hoVaTen;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "KhachHang2 [id=" + id + ", hoVaTen=" + hoVaTen + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + "]";
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public int getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(int ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
}
