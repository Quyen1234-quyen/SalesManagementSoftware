package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name="DonDatHang")
public class DonDatHang implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name="maDonDatHang")
	private int maDonDatHang;
	@Column(name="diaChiNhanHang")
	private String diaChiNhanHang;
	@Column(name="trangThaiDonHang")
	private String trangThaiDonHang;
	@Column(name="tongTien")
	private double tongTien;
	@Column(name="ngayDatHang",columnDefinition="DATETIME")
	private Date ngayDatHang;
	@ManyToOne()
	@JoinColumn(name="maKhachHang")
	private KhachHang khachHang;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="tenNhanVien")
	private NhanVien nhanVien;
	@OneToMany(mappedBy="DonDatHang")
	private List<ChiTietDonDatHang> donDatHang;
	public DonDatHang(int maDonDatHang, String diaChiNhanHang, String trangThaiDonHang, double tongTien,
			KhachHang khachHang, NhanVien nhanVien) {
		super();
		this.maDonDatHang = maDonDatHang;
		this.diaChiNhanHang = diaChiNhanHang;
		this.trangThaiDonHang = trangThaiDonHang;
		this.tongTien = tongTien;
		this.khachHang = khachHang;
		this.nhanVien = nhanVien;
	}
	
	public DonDatHang() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getMaDonDatHang() {
		return maDonDatHang;
	}
	public void setMaDonDatHang(int maDonDatHang) {
		this.maDonDatHang = maDonDatHang;
	}
	public String getDiaChiNhanHang() {
		return diaChiNhanHang;
	}
	public void setDiaChiNhanHang(String diaChiNhanHang) {
		this.diaChiNhanHang = diaChiNhanHang;
	}
	public String getTrangThaiDonHang() {
		return trangThaiDonHang;
	}
	public void setTrangThaiDonHang(String trangThaiDonHang) {
		this.trangThaiDonHang = trangThaiDonHang;
	}
	public double getTongTien() {
		return tongTien;
	}
	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}
	public KhachHang getKhachHang() {
		return khachHang;
	}
	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	public NhanVien getNhanVien() {
		return nhanVien;
	}
	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "DonDatHang [maHoaDon=" + maDonDatHang + ", diaChiNhanHang=" + diaChiNhanHang + ", trangThaiDonHang="
				+ trangThaiDonHang + ", tongTien=" + tongTien + ", khachHang=" + khachHang + ", nhanVien=" + nhanVien
				+ "]";
	}
	
	
	
	
	
	
}
