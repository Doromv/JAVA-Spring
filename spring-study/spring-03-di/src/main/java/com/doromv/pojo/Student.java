package com.doromv.pojo;

import lombok.Data;
import lombok.ToString;

import java.util.*;

/**
 * @author shkstart
 * @create 2022-02-27-19:17
 */
@Data
public class Student {
    private String name;
    private Address address;
    private String[] books;
    private List<String> hobbies;
    private Map<String,String> card;
    private Set<String> games;
    private Properties info;
    private String wife;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address.toString() +
                ", books=" + Arrays.toString(books) +
                ", hobbies=" + hobbies +
                ", card=" + card +
                ", games=" + games +
                ", info=" + info +
                ", wife='" + wife + '\'' +
                '}';
    }
}
