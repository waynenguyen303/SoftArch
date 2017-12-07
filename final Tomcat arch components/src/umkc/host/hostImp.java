package umkc.host;

import org.apache.catalina.Container;
import org.apache.catalina.Host;
import org.apache.catalina.Pipeline;
import org.apache.catalina.connector.Connector;

public class hostImp implements IhostImp
{
	private hostArch _arch;
	
	Host host;

    public hostImp (){
    }

	public void setArch(hostArch arch){
		_arch = arch;
	}
	public hostArch getArch(){
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
		
		_arch.OUT_IhostLife.sendhostTolife(host);
		
		_arch.OUT_Icontext.sendhostTocontext(host);
		
		_arch.OUT_Ipattern.sendhostTopattern(host);
		
		_arch.OUT_Iexecutorservice.sendhostToexecutor(host);
		
		_arch.OUT_Ifile.sendhostTofile(host);
		
		_arch.OUT_IgetAndsetHost.sendhostTogetandset(host);
		
		
	}
	public void end(){
		//TODO Auto-generated method stub
	}
	public void destroy(){
		//TODO Auto-generated method stub
	}

	@Override
	public void sendconToHost(Connector con) {
		// TODO Auto-generated method stub
		
		
		
		
	}

	@Override
	public void sendcontainerTohost(Container container) {
		// TODO Auto-generated method stub
		
		container.addChild(host);
		
	}



	/*
  	  Implementation primitives required by the architecture
	*/
  

}