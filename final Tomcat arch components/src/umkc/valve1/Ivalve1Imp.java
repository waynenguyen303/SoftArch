package umkc.valve1;


import org.apache.catalina.Pipeline;

import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;

import umkc.valve1.valve1Arch;

public interface Ivalve1Imp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (valve1Arch arch);
	public valve1Arch getArch();
	
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
    public void sendpipeTovalve1 (Pipeline pl)  ;        
  
    //To be imported: Response
    public void resTocon (Response res)  ;        
  
    //To be imported: Request
    public void sendreqTocon (Request req)  ;        
}