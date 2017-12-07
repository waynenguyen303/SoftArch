package umkc.executorservice;


import java.util.concurrent.ExecutorService;

import org.apache.catalina.Host;

public class executorserviceImp implements IexecutorserviceImp
{
	private executorserviceArch _arch;
	
	ExecutorService ES;

    public executorserviceImp (){
    }

	public void setArch(executorserviceArch arch){
		_arch = arch;
	}
	public executorserviceArch getArch(){
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
	public void sendhostToexecutor(Host host) {
		// TODO Auto-generated method stub
		
		ES = host.getStartStopExecutor();
	
		
	}

	/*
  	  Implementation primitives required by the architecture
	*/
  

}