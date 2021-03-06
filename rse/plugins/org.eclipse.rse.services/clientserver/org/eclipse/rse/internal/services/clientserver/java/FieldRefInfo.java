/*******************************************************************************
 * Copyright (c) 2006, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Initial Contributors:
 * The following IBM employees contributed to the Remote System Explorer
 * component that contains this file: David McKnight, Kushal Munir, 
 * Michael Berger, David Dykstal, Phil Coulthard, Don Yantzi, Eric Simpson, 
 * Emily Bruner, Mazen Faraj, Adrian Storisteanu, Li Ding, and Kent Hawley.
 * 
 * Contributors:
 * {Name} (company) - description of contribution.
 *******************************************************************************/

package org.eclipse.rse.internal.services.clientserver.java;

/**
 * This class represents field reference inforamtion.
 */
public class FieldRefInfo extends AbstractRefInfo {

	/**
	 * Constructor.
	 * @param tag the tag.
	 * @param classIndex the class index.
	 * @param nameAndTypeIndex the name and type index.
	 */
	public FieldRefInfo(short tag, int classIndex, int nameAndTypeIndex) {
		super(tag, classIndex, nameAndTypeIndex);
	}
}
