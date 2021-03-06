package controller;

import java.util.List;

import dao.TaiKhoanDao;
import entity.TaiKhoan;

public class XuLy_TaiKhoan {
	TaiKhoanDao daoTK=new TaiKhoanDao();
	
	// tim tai khoan theo ten
	public TaiKhoan timTheoTen(String ten){
		try {
			TaiKhoan tk=daoTK.timTheoTenTaiKhoan(ten);
			return tk;
		}catch(Exception e) {
			return null;
		}
	}
	// lay tat ca tai khoan
	public List<TaiKhoan> getAllTaiKhoan(){
		try {
			List<TaiKhoan> list=daoTK.getAllTaiKhoan();
			return list;
		}catch(Exception e) {
			return null;
		}
	}
	// them tai khoan
	public boolean themTaiKhoan(TaiKhoan tk) {
		try {
			if(daoTK.themTaiKhoan(tk)) {
				return true;
			}else {
				return false;
			}
		}catch(Exception e) {
			return false;
		}
	}
	// xoa tai khoan
	public boolean xoaTaiKhoan(TaiKhoan tk) {
		try {
			if(daoTK.xoaTaiKhoan(tk)) {
				return true;
			}else {
				return false;
			}
		}catch(Exception e) {
			return false;
		}
	}
	// doi mat khau
	public boolean doiMatKhauTaiKhoan(String ten,String pass) {
		try {
			if(daoTK.doiMatKhau(ten, pass)) {
				return true;
			}else {
				return false;
			}
		}catch(Exception e) {
			return false;
		}
	}
	// cap nhat trang thai dang lam
	public boolean updateTKDangLam(String ten) {
		try {
			if(daoTK.updateTrangThaiDangLam(ten)) {
				return true;
			}else {
				return false;
			}
			
		}catch(Exception e) {
			return false;
		}
	}
	// cap nhat trang thai khong lam
	public boolean updateTKKhongLam(String ten) {
		try {
			if(daoTK.updateTrangThaiKhongLam(ten)) {
				return true;
			}else {
				return false;
			}
		}catch(Exception e) {
			return false;
		}
	}
}
