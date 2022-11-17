package com.example.gestionmagasin.controllers;

import com.example.gestionmagasin.entities.Stock;
import com.example.gestionmagasin.entities.Stock;
import com.example.gestionmagasin.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/stock")
@RestController
public class StockRestController {

    @Autowired
    StockService stockService;


    @GetMapping("/retrieveAllStock")
    public List<Stock> retrieveAllStock(){
        return stockService.retrieveAllStocks();
    }

    @PostMapping("/addStock")
    public Stock addStock(@RequestBody Stock s)
    {
        return stockService.addStock(s);
    }



    @PutMapping("/updateStock")
    public Stock updateStock(@RequestBody Stock s){
        return stockService.updateStock(s);

    }

    @GetMapping("/retrieveStock/{id}")
    public Stock retrieveStock(@PathVariable(value="id") Long id){
        return stockService.retrieveStock(id);
    }
}
