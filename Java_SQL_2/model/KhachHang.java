package model;

public class KhachHang {

	private String id;
	private String hoVaTen;
	private int ngaySinh;
	private String diaChi;

	public KhachHang() {
		super();
	}

	public KhachHang(String id, String hoVaTen, int ngaySinh, String diaChi) {
		super();
		this.id = id;
		this.hoVaTen = hoVaTen;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
	}

	public String getId() {
		return id;
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
