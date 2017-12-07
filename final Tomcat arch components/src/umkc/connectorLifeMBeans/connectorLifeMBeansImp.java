package umkc.connectorLifeMBeans;

import org.apache.catalina.util.LifecycleMBeanBase;
import org.apache.catalina.LifecycleListener;
import org.apache.catalina.connector.Connector;

public class connectorLifeMBeansImp implements IconnectorLifeMBeansImp
{
	private connectorLifeMBeansArch _arch;
	
	LifecycleMBeanBase MB;
	LifecycleListener LL;

    public connectorLifeMBeansImp (){
    }

	public void setArch(connectorLifeMBeansArch arch){
		_arch = arch;
	}
	public connectorLifeMBeansArch getArch(){
		return _arch;
	}

	/*
  	  Myx Lifecycle Methods: these methods are called automatically by the framework
  	  as the bricks are created, attached, detached, and destroyed respectively.
	*/	
	public void init(){
	    //TODO Auto-generated method stub
	}
	public void begin(){
		//TODO Auto-generated method stub
	}
	public void end(){
		//TODO Auto-generated method stub
	}
	public void destroy(){
		//TODO Auto-generated method stub
	}

	@Override
	public void extendconToMBeans(Connector con) {
		// TODO Auto-generated method stub
		
		con.addLifecycleListener(LL);
		MB.addLifecycleListener(LL);
		
	}

	/*
  	  Implementation primitives required by the architecture
	*/
  

}