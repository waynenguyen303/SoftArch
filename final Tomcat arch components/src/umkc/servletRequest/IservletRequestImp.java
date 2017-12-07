package umkc.servletRequest;


import javax.servlet.ServletRequest;

import umkc.servletRequest.servletRequestArch;

public interface IservletRequestImp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (servletRequestArch arch);
	public servletRequestArch getArch();
	
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
  
    //To be imported: ServletRequest
    public void sendreqToservletreq (ServletRequest req)  ;        
}