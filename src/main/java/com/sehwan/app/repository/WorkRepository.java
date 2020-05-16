package com.sehwan.app.repository;

import com.sehwan.app.entity.Work;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkRepository extends JpaRepository <Work, Long> {
}
