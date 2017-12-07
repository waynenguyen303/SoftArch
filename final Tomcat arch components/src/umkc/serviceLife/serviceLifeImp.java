package umkc.serviceLife;

import org.apache.catalina.LifecycleListener;
import org.apache.catalina.Service;

public class serviceLifeImp implements IserviceLifeImp
{
	private serviceLifeArch _arch;
	
	LifecycleListener listen;

    public serviceLifeImp (){
    }

	public void setArch(serviceLifeArch arch){
		_arch = arch;
	}
	public serviceLifeArch getArch(){
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
	public void sendServiceToLife(Service service) {
		// TODO Auto-generated method stub
		
		service.addLifecycleListener(listen);
		service.getState();
		
	}

	/*
  	  Implementation primitives required by the architecture
	*/
  

}