package com.company.dto;

import lombok.*;
@NoArgsConstructor
@AllArgsConstructor
public class order {
    @Getter
    @Setter
    private int id;
    @Getter
    @Setter
    private int userid;
    @Getter
    @Setter
    private String dateorder;
    @Getter
    @Setter
    private int idstatus;
    @Getter
    @Setter
    private int iddisheslist;
    @Getter
    @Setter
    private int cost;

}
