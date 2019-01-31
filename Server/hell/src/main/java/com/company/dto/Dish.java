package com.company.dto;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
public class Dish implements Serializable {
    public int iddish;
    public String name;
    public int cost;
}
