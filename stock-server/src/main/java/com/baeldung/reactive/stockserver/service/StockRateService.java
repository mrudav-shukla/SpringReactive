package com.baeldung.reactive.stockserver.service;

import com.baeldung.reactive.stockserver.model.Stock;

public interface StockRateService {

	public Stock getLiveStockRates(String stockName);
	
}
