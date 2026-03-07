package _base.modifier.intro.p0;

import _base.modifier.intro.father.Father;
import _base.modifier.intro.father.Son03;
import _base.modifier.intro.pz.GrandChild0401;
import _base.modifier.intro.pz.Son04;

/**
 *
 * Copyright https://wtfu.site Inc. All Rights Reserved.
 *
 * @date 2026/3/7
 *                          @since  1.0
 *                          @author 12302
 *
 */
public class Son02 extends Father {

    @Override
    protected void f() { System.out.println();}


    public void testWithSon02() throws CloneNotSupportedException {

        Father father = new Father();
        father.f();                     // compile error
        father.clone();                 // compile error

        Son01 son01 = new Son01();
        son01.f();                      // compile error
        son01.clone();                  // compile error


        Son02 son02 = new Son02();
        son02.f();
        son02.clone();

        Son03 son03 = new Son03();
        son03.f();                       // compile error
        son03.clone();                   // compile error

        Son04 son04 = new Son04();
        son04.f();                      // compile error
        son04.clone();                  // compile error

        // Specifically for the scenario of multiple inheritance
        GrandChild0401 grandChild0401 = new GrandChild0401();
        grandChild0401.f();             // compile error
        grandChild0401.clone();         // compile error
    }

}
