package com.spring.ioc;

/**
 * @author novLi
 * @date 2020年03月03日 15:13
 */
public class FineSpring {

    private String tell;

    public FineSpring(String tell) {
        this.tell = tell;
    }


    @Override
    public String toString() {
        return "FineSpring{" +
                "tell='" + tell + '\'' +
                '}';
    }
}
