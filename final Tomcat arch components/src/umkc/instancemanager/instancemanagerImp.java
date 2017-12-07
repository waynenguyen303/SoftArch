package umkc.instancemanager;


import org.apache.catalina.Context;
import org.apache.tomcat.InstanceManager;

public class instancemanagerImp implements IinstancemanagerImp
{
	private instancemanagerArch _arch;
	
	InstanceManager IM;

    public instancemanagerImp (){
    }

	public void setArch(instancemanagerArch arch){
		_arch = arch;
	}
	public instancemanagerArch getArch(){
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
	public void sendcontextToOut(Context context) {
		// TODO Auto-generated method stub
		
		IM = context.getInstanceManager();
		
	}

	/*
  	  Implementation primitives required by the architecture
	*/
  

}