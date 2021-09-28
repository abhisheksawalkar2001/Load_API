package com.loadsapi.loadapi.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loadsapi.loadapi.entities.loadinfo;

public interface loadDao extends JpaRepository<loadinfo, Long> {

}
