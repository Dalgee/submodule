package com.example.web;

import org.junit.Test;

import static org.junit.Assert.*;

public class MerongTest {


    @Test(expected = NullPointerException.class)
    public int getHome1() {
        Merong merong = new Merong();

        return merong.getHome();
    }

    @Test
    public void getHome2() {
        Merong merong = new Merong();


        int val = merong.getHome();


        assert val > 0;
    }

}