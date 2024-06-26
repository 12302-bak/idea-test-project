package me.maupassant.examples.ltw;

/*
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Matthew Webster    initial implementation
 */
public aspect
Tracing {

	private pointcut mainMethod () :
		execution(public static void main(String[]));

	before () : mainMethod() {
		System.out.println("> " + thisJoinPoint + "itw.Tracing.mainMethod(pointcut)before");
	}

	after () : mainMethod() {
		System.out.println("< " + thisJoinPoint  + "itw.Tracing.mainMethod(pointcut)after");
	}
}
