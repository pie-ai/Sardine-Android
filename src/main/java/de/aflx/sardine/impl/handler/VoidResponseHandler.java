/*
 * Copyright 2009-2011 Jon Stevens et al.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.aflx.sardine.impl.handler;

import cz.msebera.android.httpclient.HttpResponse;

import java.io.IOException;

/**
 * {@link cz.msebera.android.httpclient.client.ResponseHandler} which just executes the request and checks the answer is
 * in the valid range of {@link ValidatingResponseHandler#validateResponse(cz.msebera.android.httpclient.HttpResponse)}.
 *
 * @author mirko
 * @version $Id: VoidResponseHandler.java 233 2011-05-24 11:55:15Z dkocher@sudo.ch $
 */
public class VoidResponseHandler extends ValidatingResponseHandler<Void>
{

	public Void handleResponse(HttpResponse response) throws IOException
	{
		this.validateResponse(response);
		return null;
	}
}
