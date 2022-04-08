package com.doromv.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author shkstart
 * @create 2022-02-28-9:14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class People {
    private String name;
    @Autowired
    private Dog dog;
    @Autowired
    @Qualifier(value = "cat222")
    private Cat cat;
}
