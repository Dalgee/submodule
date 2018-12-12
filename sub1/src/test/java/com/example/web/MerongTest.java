package com.example.web;

import org.junit.Test;

import static org.junit.Assert.*;

public class MerongTest {


    @Test(expected = NullPointerException.class)
    public void getHome1() {
        Merong merong = new Merong();


        System.out.println(merong.getHome());
    }
}