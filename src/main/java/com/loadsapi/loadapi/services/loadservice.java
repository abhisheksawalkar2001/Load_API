package com.loadsapi.loadapi.services;

import java.util.List;

import com.loadsapi.loadapi.entities.loadinfo;

public interface loadservice {
	
	public List<loadinfo> getloads();

	public loadinfo getloads(long loadId);

	public loadinfo addloads(loadinfo info);
	
	public loadinfo updateloadinfo(loadinfo info);

	public void deleteload(long parseLong);


}
