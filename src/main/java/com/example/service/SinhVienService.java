package com.example.service;

import com.example.entity.SinhVien;

import java.util.List;

public class SinhVienService {
    public SinhVien createSinhVien(String id, String hoten, String malop, String tenlop, String masv) {
        return new SinhVien(id, hoten, malop, tenlop, masv);
    }

    public SinhVien getSinhVienById(List<SinhVien> sinhVienList, String id) {
        return sinhVienList.stream().filter(sv -> sv.getId().equals(id)).findFirst().orElse(null);
    }

    public void updateSinhVien(SinhVien sinhVien, String hoten, String malop, String tenlop, String masv) {
        sinhVien.setHoten(hoten);
        sinhVien.setMalop(malop);
        sinhVien.setTenlop(tenlop);
        sinhVien.setMasv(masv);
    }
}

