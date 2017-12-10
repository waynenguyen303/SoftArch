package tomcat.engine;


import org.apache.catalina.Engine;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.Service;

public class engineImp implements IengineImp
{
	private engineArch _arch;
	
	Service s;
	
	Engine engine = null;

    public engineImp (){
    }

	public void setArch(engineArch arch){
		_arch = arch;
	}
	public engineArch getArch(){
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
		System.out.println("in engine begin");
		
		engine.setService(s);
		
		try {
			engine.start();
		} catch (LifecycleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		_arch.OUT_Iengine_service.engineToservice(engine);
		
	}
	public void end(){
		//TODO Auto-generated method stub
	}
	public void destroy(){
		//TODO Auto-generated method stub
	}

	@Override
	public void serviceToengine(Service service) {
		// TODO Auto-generated method stub
		System.out.println("in engine sTe");
		
		engine.setService(service);
		
		s= service;
		
	}


	
	/*
  	  Implementation primitives required by the architecture
	*/
  

}