package com.doromv.demo01;

/**
 * @author shkstart
 * @create 2022-02-28-15:33
 */
public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
