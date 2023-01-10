package com.cucumber.demo.helper.object;

import lombok.Data;

@Data
public class StockObject {
    private String code;
    private String name;
    private String change;
    private String volume;
}
