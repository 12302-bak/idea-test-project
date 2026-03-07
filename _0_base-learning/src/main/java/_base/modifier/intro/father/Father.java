package _base.modifier.intro.father;

import _base.modifier.intro.p0.Son01;
import _base.modifier.intro.p0.Son02;
import _base.modifier.intro.pz.GrandChild0401;
import _base.modifier.intro.pz.Son04;

/**
 *
 * Copyright https://wtfu.site Inc. All Rights Reserved.
 *
 * @date 2026/3/6
 *                          @since  1.0
 *                          @author 12302
 *
 */
public class Father {

    protected void f(){}

    public void testWithFather() throws CloneNotSupportedException {

        Father father = new Father();
        father.f();
        father.clone();

        Son01 son01 = new Son01();
        son01.f();
        son01.clone();


        Son02 son02 = new Son02();
        son02.f();                      // compile error
        son02.clone();

        Son03 son03 = new Son03();
        son03.f();
        son03.clone();

        Son04 son04 = new Son04();
        son04.f();
        son04.clone();

        // Specifically for the scenario of multiple inheritance
        GrandChild0401 grandChild0401 = new GrandChild0401();
        grandChild0401.f();
        grandChild0401.clone();
    }
}
