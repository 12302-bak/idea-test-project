package _base.modifier.test1.p0;

import _base.modifier.test1.father.Father010;
import _base.modifier.test1.father.Son013;
import _base.modifier.test1.pz.Son018;
import _base.modifier.test1.pz.Son019;

/**
 *
 * Copyright https://wtfu.site Inc. All Rights Reserved.
 *
 * @date 2026/3/6
 *                          @since  1.0
 *                          @author 12302
 *
 */
public class Son011 extends Father010 {

    public void test(){

        Father010 father010 = new Father010();
        father010.f();

        Son011 son011 = new Son011();
        son011.f();

        Son012 son012 = new Son012();
        son012.f();

        Son013 son013 = new Son013();
        son013.f();


        // other package
        Son018 son018 = new Son018();
        son018.f();

        Son019 son019 = new Son019();
        son019.f();
    }
}
