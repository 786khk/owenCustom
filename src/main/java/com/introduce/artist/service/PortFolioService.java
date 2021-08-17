package com.introduce.artist.service;

import java.util.List;

import com.introduce.artist.dao.PortfolioVO;

public interface PortFolioService {

	public List<PortfolioVO>  boardList();
	
	public int InsertRecode();
	
	int updateRecode();
	
	int deleteRecode();
	
	
}
