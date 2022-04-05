package com.binance.api.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.binance.api.Model.Trade;
import com.binance.api.Service.TradeService;



@RestController
@RequestMapping(value = "/tradeApi")
public class TradeController {
	@Autowired
	TradeService tradeService;
	
	String URL="https://api.binance.com/api/v3/trades?symbol=ETHUSDT&limit=1000";
   

	@GetMapping("/allTrade")
	public List<Trade> getAllTrade()
	{
		RestTemplate restTemplate=new RestTemplate();
		// "TradeArray"
		Trade[] TradeArray = restTemplate.getForObject(URL, Trade[].class); 
		return Arrays.asList(TradeArray);
	}
	@PostMapping("/saveAllTrade")
	public Integer saveAllTrade()
	{
	
		RestTemplate restTemplate=new RestTemplate();
		// "TradeArray"
		Trade[] TradeArray = restTemplate.getForObject(URL, Trade[].class); 
		tradeService.saveAllTrade( Arrays.asList(TradeArray));
		return TradeArray.length;
	}
	
}
	
	


