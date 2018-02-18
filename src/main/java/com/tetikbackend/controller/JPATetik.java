package com.tetikbackend.controller;

import com.tetikbackend.tetik.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * Created by suior on 16.02.2018.
 */

public interface JPATetik extends JpaRepository<Manufacturer, Long> {
}
