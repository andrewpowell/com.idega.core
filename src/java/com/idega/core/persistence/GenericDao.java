package com.idega.core.persistence;

import java.util.List;

import javax.persistence.Query;

/**
 * @author <a href="mailto:civilis@idega.com">Vytautas Čivilis</a>
 * @version $Revision: 1.5 $
 *
 * Last modified: $Date: 2008/05/26 11:04:37 $ by $Author: civilis $
 */
public interface GenericDao {

	public abstract void persist(Object product);

	public abstract <T>T merge(T product);

	public abstract <T> T find(Class<T> clazz, Object primaryKey);

	public abstract Query createNamedQuery(String queryName);

	public abstract void remove(Object obj);
	
	public abstract void flush();
	
	public abstract void refresh(Object product);
	
	public abstract <Expected>List<Expected> getResultList(String namedQueryName, Class<Expected> expectedReturnType, Param... params);
	
	public abstract <Expected>Expected getSingleResult(String namedQueryName, Class<Expected> expectedReturnType, Param... params);
	
	public abstract <Expected>Expected getSingleResultByInlineQuery(String query, Class<Expected> expectedReturnType, Param... params);
	
	public abstract <Expected>List<Expected> getResultListByInlineQuery(String query, Class<Expected> expectedReturnType, Param... params);
}