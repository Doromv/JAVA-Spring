package com.doromv.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author shkstart
 * @create 2022-02-28-11:22
 */
@Component//等价于   <bean id="user" class="com.doromv.pojo.User"/>
@Data
public class User {
    @Value("Doromv")//等价于   <property name="name" value="Doromv"/>
    public String name;
}
