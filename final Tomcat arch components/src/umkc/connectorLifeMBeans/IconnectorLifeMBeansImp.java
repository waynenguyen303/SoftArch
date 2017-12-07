package umkc.connectorLifeMBeans;


import org.apache.catalina.connector.Connector;

import umkc.connectorLifeMBeans.connectorLifeMBeansArch;

public interface IconnectorLifeMBeansImp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (connectorLifeMBeansArch arch);
	public connectorLifeMBeansArch getArch();
	
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
    public void extendconToMBeans (Connector con)  ;        
}