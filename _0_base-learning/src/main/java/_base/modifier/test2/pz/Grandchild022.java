package _base.modifier.test2.pz;

import _base.modifier.test2.father.Father020;
import _base.modifier.test2.father.Grandchild023;
import _base.modifier.test2.p0.Grandchild021;
import _base.modifier.test2.p0.Son021;

/**
 *
 * Copyright https://wtfu.site Inc. All Rights Reserved.
 *
 * @date 2026/3/6
 *                          @since  1.0
 *                          @author 12302
 *
 */
public class Grandchild022 extends Son021 {

    public static void main(String[] args) throws CloneNotSupportedException {

        Father020 father020 = new Father020();
        father020.clone();
        father020.f();

        Son021 son021 = new Son021();
        son021.clone();
        son021.f();

        Grandchild021 grandchild021 = new Grandchild021();
        grandchild021.clone();
        grandchild021.f();

        Grandchild022 grandchild022 = new Grandchild022();
        grandchild022.clone();
        grandchild022.f();

        Grandchild023 grandchild023 = new Grandchild023();
        grandchild023.clone();
        grandchild023.f();
    }
}
