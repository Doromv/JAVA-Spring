package com.doromv.demo01;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author shkstart
 * @create 2022-02-28-15:34
 */
@AllArgsConstructor
@NoArgsConstructor
public class Proxy implements Rent {
    private Host host;

    @Override
    public void rent() {
        host.rent();
        seeHouse();
        contract();
        fare();
    }
    public void seeHouse(){
        System.out.println("中介带你看房");
    }
    public void fare(){
        System.out.println("收中介费");
    }
    public void contract(){
        System.out.println("签租赁合同");
    }
}
