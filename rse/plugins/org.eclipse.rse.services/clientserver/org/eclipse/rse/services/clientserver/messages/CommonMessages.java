/********************************************************************************
 * Copyright (c) 2008 IBM Corporation. All rights reserved.
 * This program and the accompanying materials are made available under the terms
 * of the Eclipse Public License v1.0 which accompanies this distribution, and is 
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Initial Contributors:
 * The following IBM employees contributed to the Remote System Explorer
 * component that contains this file: David McKnight.
 * 
 * Contributors:
 * David McKnight   (IBM)        - [220547] [api][breaking] SimpleSystemMessage needs to specify a message id and some messages should be shared
 ********************************************************************************/
package org.eclipse.rse.services.clientserver.messages;

import org.eclipse.osgi.util.NLS;


public class CommonMessages extends NLS {
	private static String BUNDLE_NAME = "org.eclipse.rse.services.clientserver.messages.CommonMessages";//$NON-NLS-1$

	
	public static String MSG_EXCEPTION_OCCURRED;
	public static String MSG_ERROR_UNEXPECTED;
	
	
	public static String MSG_COMM_AUTH_FAILED;
	public static String MSG_COMM_PWD_INVALID;
	public static String MSG_COMM_AUTH_FAILED_DETAILS;
	public static String MSG_COMM_PWD_INVALID_DETAILS;

	public static String MSG_EXPAND_FAILED;
	public static String MSG_EXPAND_CANCELED;
	
	// operation status
	public static String MSG_OPERATION_RUNNING;
	public static String MSG_OPERATION_FINISHED;
	public static String MSG_OPERTION_STOPPED;
	public static String MSG_OPERATION_DISCONNECTED;	
	
	public static String MSG_CONNECT_CANCELED;
	public static String MSG_CONNECT_PROGRESS;
	public static String MSG_CONNECTWITHPORT_PROGRESS;
	public static String MSG_CONNECT_FAILED;
	public static String MSG_CONNECT_UNKNOWNHOST;
	
	public static String MSG_DISCONNECT_PROGRESS;
	public static String MSG_DISCONNECTWITHPORT_PROGRESS;
	public static String MSG_DISCONNECT_FAILED;
	public static String MSG_DISCONNECT_CANCELED;
	
	public static String MSG_OPERATION_FAILED;
	public static String MSG_OPERATION_CANCELED;
	
	public static String MSG_RESOLVE_PROGRESS;

	public static String MSG_QUERY_PROGRESS;
	public static String MSG_QUERY_PROPERTIES_PROGRESS;
	
	public static String MSG_SET_PROGRESS;
	public static String MSG_SET_PROPERTIES_PROGRESS;

	public static String MSG_RUN_PROGRESS;
	public static String MSG_COPY_PROGRESS;

	
	static {
		// load message values from bundle file
		NLS.initializeMessages(BUNDLE_NAME, CommonMessages.class);
	}
}