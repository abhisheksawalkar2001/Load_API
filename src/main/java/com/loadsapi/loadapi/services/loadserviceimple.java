package com.loadsapi.loadapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loadsapi.loadapi.Dao.loadDao;
import com.loadsapi.loadapi.entities.loadinfo;

@Service
public class loadserviceimple implements loadservice {
	
	@Autowired
	private loadDao dao;

	@Override
	public List<loadinfo> getloads() {
		return dao.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public loadinfo getloads(long loadId) {
		return dao.getOne(loadId);
	}


	@Override
	public loadinfo addloads(loadinfo info) {
		dao.save(info);
		return info;
	}


	@Override
	public loadinfo updateloadinfo(loadinfo info) {
		dao.save(info);
		return info;
	}


	@SuppressWarnings("deprecation")
	@Override
	public void deleteload(long parseLong) {
		dao.delete(dao.getOne(parseLong));
	}

}
