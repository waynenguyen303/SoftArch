package umkc.server;


import org.apache.catalina.Server;
import org.apache.catalina.Container;
import org.apache.catalina.LifecycleListener;
import org.apache.catalina.startup.Catalina;

public class serverImp implements IserverImp
{
	private serverArch _arch;
	
	LifecycleListener serverlife ;
	Server serve;

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
	}
	public void end(){
		//TODO Auto-generated method stub
	}
	public void destroy(){
		//TODO Auto-generated method stub
	}

	@Override
	public void sendCatToServer(Catalina cat) {
		// TODO Auto-generated method stub
		
		//issue with server being null
		serve.addLifecycleListener(serverlife);
		serve = cat.getServer();
		cat.setServer(serve);
		
		
		_arch.OUT_IserverLife.sendToServerLife(serve);
		_arch.OUT_Iservice.sendToService(serve);
		
		
		
	}

	@Override
	public void sendcontainer(Container container) {
		// TODO Auto-generated method stub
		
	}

	/*
  	  Implementation primitives required by the architecture
	*/

}