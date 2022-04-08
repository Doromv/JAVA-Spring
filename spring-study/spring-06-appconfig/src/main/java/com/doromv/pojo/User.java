package com.doromv.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author shkstart
 * @create 2022-02-28-14:32
 */
@Data

public class User {
    @Value("Doromv")
    private String name;
}
