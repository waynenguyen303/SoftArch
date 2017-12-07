package umkc.adapter;


import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;

import umkc.adapter.adapterArch;

public interface IadapterImp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (adapterArch arch);
	public adapterArch getArch();
	
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
  
    //To be imported: Response
    public void resTocon (Response res)  ;        
  
    //To be imported: Request
    public void sendreqTocon (Request req)  ;        
}