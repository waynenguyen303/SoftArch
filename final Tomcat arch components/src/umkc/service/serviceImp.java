package umkc.service;

import org.apache.catalina.Service;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.LifecycleListener;
import org.apache.catalina.Server;
import org.apache.catalina.startup.Catalina;
import org.apache.coyote.Response;
import org.apache.coyote.Adapter;
import org.apache.coyote.Request;


public class serviceImp implements IserviceImp
{
	private serviceArch _arch;

	LifecycleListener servicelife;
	Service service;
	Response response;
	Request request;
	Boolean servicebool;
	
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
		
		
		_arch.OUT_Imapper.sendserviceTomapper(service);
		
	}
	public void end(){
		//TODO Auto-generated method stub
	}
	public void destroy(){
		//TODO Auto-generated method stub
	}

	@Override
	public void sendToService(Server serve) {
		// TODO Auto-generated method stub
		
		serve.addService(service);
		service.getServer();
		
		try {
			
			//init lifeCycle
			
			service.init();
			service.start();
			
		} catch (LifecycleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		_arch.OUT_IserviceLife.sendServiceToLife(service);
		
		_arch.OUT_Iconnector.sendToConnector(service);
		
		
		
	}

	@Override
	public void sendCatToService(Catalina cat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendadapterToservice(Adapter adapter) {
		// TODO Auto-generated method stub
		
		try {
			
			servicebool = adapter.prepare(request, response);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}





	
	
	
	/*
  	  Implementation primitives required by the architecture
	*/

}