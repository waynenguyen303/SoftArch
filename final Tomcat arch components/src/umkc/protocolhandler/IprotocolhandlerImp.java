package umkc.protocolhandler;


import org.apache.catalina.connector.Connector;

import umkc.protocolhandler.protocolhandlerArch;

public interface IprotocolhandlerImp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (protocolhandlerArch arch);
	public protocolhandlerArch getArch();
	
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
  
    //To be imported: Connector
    public void sendconToProtocolhandler (Connector con)  ;        
}