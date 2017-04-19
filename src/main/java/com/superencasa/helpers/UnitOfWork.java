package com.superencasa.helpers;

public interface UnitOfWork {
	
//	public void registrarNew ();
//	
//	public void registrarDirty();
//	
//	public void registrarRemoved();
	
	public boolean commit();
	
	public void rollback();
	
	public void clear();

}
