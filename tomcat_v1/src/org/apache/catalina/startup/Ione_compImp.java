package org.apache.catalina.startup;


import org.apache.catalina.startup.one_compArch;

public interface Ione_compImp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (one_compArch arch);
	public one_compArch getArch();
	
	/*
  	  Myx Lifecycle Methods: these methods are called automatically by the framework
  	  as the bricks are created, attached, detached, and destroyed respectively.
	*/	
	public void init();	
	public void begin();
	public void end();
	public void destroy();

	/*
  	  Implementation primitives required by the architecture
	*/
}