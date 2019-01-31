package com.company.dto;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
public class user {
    @Getter
    @Setter
    private int iduser;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private int idrole;
}
