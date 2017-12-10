package tomcat.service;


import org.apache.catalina.Engine;
import org.apache.catalina.Server;
import org.apache.catalina.Service;
import org.apache.catalina.core.StandardService;


public class serviceImp implements IserviceImp
{
	private serviceArch _arch;
	private StandardService _service = new StandardService();

    public serviceImp (){
    }

	public void setArch(serviceArch arch){
		_arch = arch;
	}
	public serviceArch getArch(){
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
		System.out.println("in service begin");
		
	_arch.OUT_Iservice_server.serviceToserver(_service);
		
	}
	public void end(){
		//TODO Auto-generated method stub
	}
	public void destroy(){
		//TODO Auto-generated method stub
	}

	
	@Override
	public Server serverToservice(Server server) {
		// TODO Auto-generated method stub
		System.out.println("in service sTs");
		
		
		
		
		_service.setServer(server);
		
		return server;
		
	}

	@Override
	public void engineToservice(Engine engine) {
		// TODO Auto-generated method stub
		System.out.println("in service eTs");
		
		_service.setContainer(engine);
		
	}

	/*
  	  Implementation primitives required by the architecture
	*/
  

}