package tomcat.server;

import org.apache.catalina.*;
import org.apache.catalina.startup.Catalina;


public class serverImp implements IserverImp
{
	private serverArch _arch;
	
	Server server = null;
	
	Catalina catalina = new Catalina();
	
    public serverImp (){
    }

	public void setArch(serverArch arch){
		_arch = arch;
	}
	public serverArch getArch(){
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
		
		System.out.println("in server begin");
		
		//catalina.setAwait(true);
		catalina.load();
		catalina.start();
		
		server = catalina.getServer();
		
		_arch.OUT_Iserver_service.serverToservice(server);
		
	}
	public void end(){
		//TODO Auto-generated method stub
	}
	public void destroy(){
		//TODO Auto-generated method stub
	}

	@Override
	public void serviceToserver(Service service) {
		// TODO Auto-generated method stub
		System.out.println("in server sTs");
		
		service.setServer(server);
		
	}

	/*
  	  Implementation primitives required by the architecture
	*/
}