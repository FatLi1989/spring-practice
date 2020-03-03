package com.spring.ioc;

/**
 * @author novLi
 * @date 2020年03月03日 12:20
 */
public class HelloSpring {

    private String name;

    private String sex;

    private FineSpring fineSpring;

    public HelloSpring(String name, String sex, FineSpring fineSpring) {
        System.out.println("this is hello spring");
        this.name = name;
        this.sex = sex;
        this.fineSpring = fineSpring;
    }

    public HelloSpring(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public HelloSpring() {
        System.out.println(" hi ");
    }

    public void sayHi() {
        System.out.println(" hi ");
    }

    @Override
    public String toString() {
        return "HelloSpring{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public FineSpring getFineSpring() {
        return fineSpring;
    }

    public void setFineSpring(FineSpring fineSpring) {
        this.fineSpring = fineSpring;
    }
}
