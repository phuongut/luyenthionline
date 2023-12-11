package com.example.postgresdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.postgresdemo.model.KetQua;

public interface KetQuaDAO extends JpaRepository<KetQua, Long> {
    List<KetQua> findAllByNguoiDungIdND(Long userId);

}
