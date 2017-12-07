package umkc.valve2;


import org.apache.catalina.Pipeline;

import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;

import umkc.valve2.valve2Arch;

public interface Ivalve2Imp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (valve2Arch arch);
	public valve2Arch getArch();
	
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
  
    //To be imported: Pipeline
    public void sendpipeTovalve2 (Pipeline pl)  ;        
  
    //To be imported: Response
    public void resTocon (Response res)  ;        
  
    //To be imported: Request
    public void sendreqTocon (Request req)  ;        
}