package dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDAO {
	public void persist(Object obj);
	public void merge(Object obj);
	public void remove(Object obj);
	public <AnyType> AnyType find(Class<AnyType> className, Serializable primaryKey );
	<AnyType> List<AnyType> findAll(String entityName);
}
