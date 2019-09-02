package javaGuide;

/**
 * Create with IDEA.
 *
 * @Package: javaGuide
 * @Description:
 * @Date: 2019/5/26 21:11
 * @Author: Wyj
 */
public class testField {

    public boolean equals(Object object){

        return (this == object);
    }

    public static void main(String[] args) {

        testField t = new testField();
        System.out.println(t.equals("a"));
    }
}
