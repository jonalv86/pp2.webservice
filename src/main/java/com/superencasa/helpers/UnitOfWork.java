package com.superencasa.helpers;

public interface UnitOfWork {
	
	public void registrarNew ();
	
	public void registrarClean();
	
	public void registrarDirty();
	
	public void registrarRemoved();
	
	public void commit();
	
	public void rollback();
	
	public void clear();

}
