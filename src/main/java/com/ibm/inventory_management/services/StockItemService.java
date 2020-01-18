package com.ibm.inventory_management.services;

import static java.util.Arrays.asList;

import java.util.List;

import com.ibm.inventory_management.models.StockItem;

import org.springframework.stereotype.Service;

@Service
public class StockItemService implements StockItemApi {
    @Override
    public List<StockItem> listStockItems() {
        return asList(new StockItem("1").withName("Item 1").withStock(100).withPrice(10.5).withManufacturer("Sony"),
                new StockItem("2").withName("Item 2").withStock(150).withPrice(100.0).withManufacturer("Insignia"),
                new StockItem("3").withName("Item 3").withStock(10).withPrice(1000.0).withManufacturer("Panasonic"),
                new StockItem("4").withName("Item 4").withStock(10).withPrice(1000.0).withManufacturer("Apple"),
                new StockItem("5").withName("Item 5").withStock(10).withPrice(1000.0).withManufacturer("Microsoft"));
    }
}