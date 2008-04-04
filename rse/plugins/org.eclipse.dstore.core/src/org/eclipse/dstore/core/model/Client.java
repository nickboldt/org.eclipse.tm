/*******************************************************************************
 * Copyright (c) 2006, 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Initial Contributors:
 * The following IBM employees contributed to the Remote System Explorer
 * component that contains this file: Noriaki Takatsu and Masao Nishimoto
 *            
 * Contributors:
 *  Noriaki Takatsu    (IBM)   [220126] [dstore][api][breaking] Single process server for multiple clients
 *  Jacob Garcowski    (IBM)   [225175] [dstore] [dstore] error handling change for Client
 *  David McKnight   (IBM) - [225507][api][breaking] RSE dstore API leaks non-API types
 *******************************************************************************/

package org.eclipse.dstore.core.model;

import org.eclipse.dstore.core.server.IServerLogger;
import org.eclipse.dstore.core.server.ServerReceiver;

public class Client 
{
	public  String _userid;
	private IServerLogger _logger;
	protected ServerReceiver _receiver;
	
	public void setUserid(String userid)
    {
    	_userid = userid;
    }
	
	public String getUserid()
	{
		return _userid;
	}
	
	public void setLogger(IServerLogger logger)
	{
		_logger = logger;
	}
	
	public IServerLogger getLogger()
	{
		return _logger;
	}
	
	public String getProperty(String key)
	{
		return System.getProperty(key);
	}
	
	 public void disconnectServerReceiver()
	 {
	  if (_receiver != null)
	   _receiver.finish();
	 }
	 
	 public void setServerReceiver(ServerReceiver receiver)
	 {
	  _receiver = receiver;
	 }
}
