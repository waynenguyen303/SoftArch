package umkc.log;


import org.apache.catalina.startup.Bootstrap;
import org.apache.catalina.startup.Catalina;

public class logImp implements IlogImp
{
	private logArch _arch;

    public logImp (){
    }

	public void setArch(logArch arch){
		_arch = arch;
	}
	public logArch getArch(){
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

	
	
	/*
	  Implementation primitives required by the architecture
	*/
	
	
	@Override
	public void sendlog(Bootstrap b) {
		// TODO Auto-generated method stub
		
		System.out.println("Got bootstrap instance from init component to log component");
		
		b.log.debug("Loading startup class");
		b.log.debug("Setting startup class properties");
		
	}

	@Override
	public void sendcatlog(Catalina cat) {
		// TODO Auto-generated method stub
		
		System.out.println("Got catalina instance from loadCatalina component to log component");
		
		cat.log.debug("Loading startup class");
		cat.log.debug("Setting startup class properties");
		
	}
}