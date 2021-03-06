package controller;

import java.util.List;

import dao.KhachHangDao;
import entity.KhachHang;

public class XuLy_KhachHang {
	KhachHangDao daoKH=new KhachHangDao();
	// tim khach hang theo ma
	public KhachHang timKhachHangTheoMa(int ma) {
		KhachHang kh=daoKH.timKhachHangTheoMa(ma);
		if(kh!=null) {
			return kh;
		}else {
			return null;
		}
	}
	// tim khach hang theo cmnd
	public List<KhachHang> timKhachHangTheoCMND(String cmnd){
		List<KhachHang> list=daoKH.timKhachHangTheoCMND(cmnd);
		if(list.size()>0) {
			return list;
		}else {
			return null;
		}
	}
	// tim khach hang theo sdt
	public List<KhachHang> timKhachHangTheoSDT(String sdt){
		List<KhachHang> list=daoKH.timKhachHangTheoSDT(sdt);
		if(list.size()>0) {
			return list;
		}else {
			return null;
		}
	}
	// tim khach hang theo ten
	public List<KhachHang> timKhachHangTheoTen(String ten){
		List<KhachHang> list=daoKH.timKhachHangTheoTen(ten);
		if(list.size()>0) {
			return list;
		}else {
			return null;
		}
	}
 	// tim khach hang theo gt
	public List<KhachHang> timKhachHangTheoGioiTinh(String gt){
		List<KhachHang> list=daoKH.timKhachHangTheoGioiTinh(gt);
		if(list.size()>0) {
			return list;
		}else {
			return null;
		}
	}
	// danh sahc khach hang
	public List<KhachHang> getAllKhachHang(){
		List<KhachHang> list=daoKH.getAllKhachHang();
		if(list.size()>0) {
			return list;
		}else {
			return null;
		}
	}
	// them khach hang
	public boolean themKhachHang(KhachHang kh) {
		if(daoKH.themKhachHang(kh)) {
			return true;
		}else {
			return false;
		}
	}
	// xoa khach hang
	public boolean xoaKhachHang(KhachHang kh) {
		if(daoKH.xoaKhachHang(kh)) {
			return true;
		}else {
			return false;
		}
	}
	// cap nhat khach hang
	public boolean suaKhachHang(KhachHang kh) {
		if(daoKH.suaKhachHang(kh)) {
			return true;
		}else {
			return false;
		}
	}
}
