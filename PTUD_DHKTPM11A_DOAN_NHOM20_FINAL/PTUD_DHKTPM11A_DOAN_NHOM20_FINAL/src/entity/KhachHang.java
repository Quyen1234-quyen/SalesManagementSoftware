package entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name="KhachHang")
public class KhachHang implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="maKhachHang")
	private int maKhachHang;
	@Column(name="tenKH")
	private String tenKH;
	@Column(name="cmndKH")
	private String cmndKH;
	@Column(name="diaChi")
	private String daiChi;
	@Column(name="gioiTinh")
	private String gioiTinh;
	@Column(name="soDienThoai")
	private String soDienThoai;
	@OneToMany(mappedBy="khachHang")
	private List<DonDatHang> DonDatHang;
	
	public KhachHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public KhachHang(int maKhachHang, String tenKH, String cmndKH, String daiChi, String gioiTinh, String soDienThoai) {
		super();
		this.maKhachHang = maKhachHang;
		this.tenKH = tenKH;
		this.cmndKH = cmndKH;
		this.daiChi = daiChi;
		this.gioiTinh = gioiTinh;
		this.soDienThoai = soDienThoai;
	}

	public KhachHang(String tenKH, String cmndKH, String daiChi, String gioiTinh, String soDienThoai) {
		super();
		this.tenKH = tenKH;
		this.cmndKH = cmndKH;
		this.daiChi = daiChi;
		this.gioiTinh = gioiTinh;
		this.soDienThoai = soDienThoai;
	}
	
	public int getMaKhachHang() {
		return maKhachHang;
	}
	public void setMaKhachHang(int maKhachHang) {
		this.maKhachHang = maKhachHang;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public String getCmndKH() {
		return cmndKH;
	}
	public void setCmndKH(String cmndKH) {
		this.cmndKH = cmndKH;
	}
	public String getDaiChi() {
		return daiChi;
	}
	public void setDaiChi(String daiChi) {
		this.daiChi = daiChi;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public List<DonDatHang> getDonDatHang() {
		return DonDatHang;
	}
	public void setDonDatHang(List<DonDatHang> donDatHang) {
		DonDatHang = donDatHang;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "KhachHang [maKhachHang=" + maKhachHang + ", tenKH=" + tenKH + ", cmndKH=" + cmndKH + ", daiChi="
				+ daiChi + ", gioiTinh=" + gioiTinh + ", soDienThoai=" + soDienThoai + "]";
	}
	
	
	
	
	
	
	
	

}
