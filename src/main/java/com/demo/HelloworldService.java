package com.demo;

/**
 * @author john.jiang@wehotelglobal.com jiangzs@gmail.com
 **/
public class HelloworldService {
    private String words;

    private String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public String sayHello() {
        return "hello, " + words;
    }

    public String sayHello2(){
        return "2b";
    }
}
