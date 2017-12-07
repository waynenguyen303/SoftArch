package umkc.hostLife;


import java.beans.PropertyChangeListener;

import org.apache.catalina.ContainerListener;
import org.apache.catalina.Host;
import org.apache.catalina.LifecycleListener;

public class hostLifeImp implements IhostLifeImp
{
	private hostLifeArch _arch;
	
	ContainerListener CL;
	LifecycleListener LL;
	PropertyChangeListener PL;

    public hostLifeImp (){
    }

	public void setArch(hostLifeArch arch){
		_arch = arch;
	}
	public hostLifeArch getArch(){
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
	public void sendhostTolife(Host host) {
		// TODO Auto-generated method stub
		
		host.addContainerListener(CL);
		host.addLifecycleListener(LL);
		host.addPropertyChangeListener(PL);
		
	}

	/*
  	  Implementation primitives required by the architecture
	*/
  

}