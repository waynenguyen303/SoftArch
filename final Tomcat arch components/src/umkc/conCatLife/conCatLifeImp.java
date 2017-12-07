package umkc.conCatLife;


import org.apache.catalina.Container;
import org.apache.catalina.ContainerListener;
import org.apache.catalina.LifecycleListener;

public class conCatLifeImp implements IconCatLifeImp
{
	private conCatLifeArch _arch;
	
	LifecycleListener LL;
	ContainerListener CL;

    public conCatLifeImp (){
    }

	public void setArch(conCatLifeArch arch){
		_arch = arch;
	}
	public conCatLifeArch getArch(){
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
	public void sendcontainerTohost(Container container) {
		// TODO Auto-generated method stub
		
		container.addLifecycleListener(LL);
		container.addContainerListener(CL);
		
	}

	/*
  	  Implementation primitives required by the architecture
	*/
  
  
}