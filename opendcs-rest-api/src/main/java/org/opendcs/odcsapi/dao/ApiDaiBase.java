/*
 *  Copyright 2023 OpenDCS Consortium
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.opendcs.odcsapi.dao;

import java.sql.ResultSet;

public interface ApiDaiBase
	extends AutoCloseable
{
	public ResultSet doQuery(String q)
		throws DbException;
	
	public ResultSet doQuery2(String q) 
		throws DbException;

	public int doModify(String q)
		throws DbException;

	public void close();
	
	public Long getKey(String tableName)
		throws DbException;
}
