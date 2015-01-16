package fr.ensimag.dao;

import fr.ensimag.entity.IEntity;

import java.util.List;

/**
 * @param <T> The type of Entity for this EJB
 */
public interface AbstractLocal<T extends IEntity> {

	T create(T support) throws Exception;

	;

	void edit(T support) throws Exception;

	;

	void remove(T support) throws Exception;

	;

	T find(Object id) throws Exception;

	;

	List<T> findAll() throws Exception;

	;

	int count() throws Exception;

	;

}