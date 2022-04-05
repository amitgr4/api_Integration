package com.binance.api.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.binance.api.Dao.TradeRepository;
import com.binance.api.Model.Trade;

@Service
public class TradeService_Impl implements TradeService {

 @Autowired
 TradeRepository tradeRepository;
	
	

	@Override
	public List<Trade> getAllTrade() {
	
		return null;
	}



	@Override
	public Integer saveAllTrade(List<Trade> lt) {
		Iterable<Trade> saveAll = tradeRepository.saveAll(lt);
		return lt.size();
	}


}
