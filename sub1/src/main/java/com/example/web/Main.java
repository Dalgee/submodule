package com.example.web;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * write description
 *
 * @author Kim Seok Yoon <seokyoon.kim@linecorp.com>
 * @since 2018. 12. 10.
 */
@SpringBootApplication
@EnableZuulProxy
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }
}


class Merong {

    public int getHome() {
        String name = null;

        return name.length();
    }

}
