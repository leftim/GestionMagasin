package com.example.gestionmagasin.services;

import com.example.gestionmagasin.entities.Stock;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StockService {
    List<Stock> retrieveAllStocks();

    Stock addStock(Stock s);

    Stock updateStock(Stock u);

    Stock retrieveStock(Long id);
}
