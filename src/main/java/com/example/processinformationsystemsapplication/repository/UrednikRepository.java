package com.example.processinformationsystemsapplication.repository;

import com.example.processinformationsystemsapplication.entity.Urednik;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UrednikRepository extends JpaRepository<Urednik, String> {
    // You can add custom queries or methods here if needed
}