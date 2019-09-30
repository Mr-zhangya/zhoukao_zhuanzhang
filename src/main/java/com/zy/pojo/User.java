package com.zy.pojo;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private int money;
    private int sum;
}
