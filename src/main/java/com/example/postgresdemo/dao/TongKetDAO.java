package com.example.postgresdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.postgresdemo.model.Tongket;

public interface TongKetDAO extends JpaRepository<Tongket, Integer> {
    List<Tongket> findByNguoiDungIdND(String idND);
}