package umkc.connector;


import org.apache.catalina.Service;

import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;

import org.apache.coyote.ProtocolHandler;

import umkc.connector.connectorArch;

public interface IconnectorImp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (connectorArch arch);
	public connectorArch getArch();
	
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
  
    //To be imported: Service
    public void sendToConnector (Service service)  ;        
  
    //To be imported: ProtocolHandler
    public void sendphTocon (ProtocolHandler ph)  ;        
  
    //To be imported: Response
    public void resTocon (Response res)  ;        
  
    //To be imported: Request
    public void sendreqTocon (Request req)  ;        
}