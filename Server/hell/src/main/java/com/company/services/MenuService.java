package com.company.services;

import com.company.dto.Dish;
import org.springframework.stereotype.Controller;
import org.thymeleaf.expression.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class MenuService {
    public MenuService() {
    }
    public List<Dish> getMenu(){
        return Collections.EMPTY_LIST;
    }
}
