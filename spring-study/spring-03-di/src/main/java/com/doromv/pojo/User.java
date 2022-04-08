package com.doromv.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author shkstart
 * @create 2022-02-28-8:20
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private int age;
}
