package com.binance.api.Service;

import java.util.List;

import com.binance.api.Model.Trade;

public interface TradeService {
	public List<Trade> getAllTrade();
	public Integer saveAllTrade(List<Trade> lt);
	

}
