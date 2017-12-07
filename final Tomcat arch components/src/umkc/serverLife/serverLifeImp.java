package umkc.serverLife;


import org.apache.catalina.LifecycleListener;
import org.apache.catalina.Server;

public class serverLifeImp implements IserverLifeImp
{
	private serverLifeArch _arch;
	
	LifecycleListener listener = null;

    public serverLifeImp (){
    }

	public void setArch(serverLifeArch arch){
		_arch = arch;
	}
	public serverLifeArch getArch(){
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
	public void sendToServerLife(Server serve) {
		// TODO Auto-generated method stub
		
		//can add other methods to the new listener
		serve.addLifecycleListener(listener);
		serve.getState();
		
		
	}

	/*
  	  Implementation primitives required by the architecture
	*/
  

}