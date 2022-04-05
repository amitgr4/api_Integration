package com.binance.api.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trade {
	@Id
	private long id;
    private double price;
    private double qty;
    private double quoteQty;
    private long time;
    private boolean isBuyerMaker;
    private boolean isBestMatch;
    
	public Trade() {
		super();
		
	}

	public Trade(long id, double price, double qty, double quoteQty, long time, boolean isBuyerMaker,
			boolean isBestMatch) {
		super();
		this.id = id;
		this.price = price;
		this.qty = qty;
		this.quoteQty = quoteQty;
		this.time = time;
		this.isBuyerMaker = isBuyerMaker;
		this.isBestMatch = isBestMatch;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getQty() {
		return qty;
	}

	public void setQty(double qty) {
		this.qty = qty;
	}

	public double getQuoteQty() {
		return quoteQty;
	}

	public void setQuoteQty(double quoteQty) {
		this.quoteQty = quoteQty;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public boolean isBuyerMaker() {
		return isBuyerMaker;
	}

	public void setBuyerMaker(boolean isBuyerMaker) {
		this.isBuyerMaker = isBuyerMaker;
	}

	public boolean isBestMatch() {
		return isBestMatch;
	}

	public void setBestMatch(boolean isBestMatch) {
		this.isBestMatch = isBestMatch;
	}

	@Override
	public String toString() {
		return "Trade [id=" + id + ", price=" + price + ", qty=" + qty + ", quoteQty=" + quoteQty + ", time=" + time
				+ ", isBuyerMaker=" + isBuyerMaker + ", isBestMatch=" + isBestMatch + "]";
	}
	
	
    
    

}
