package umkc.protocolhandler;


import org.apache.catalina.connector.Connector;
import org.apache.coyote.ProtocolHandler;

public class protocolhandlerImp implements IprotocolhandlerImp
{
	private protocolhandlerArch _arch;
	
	ProtocolHandler ph;

    public protocolhandlerImp (){
    }

	public void setArch(protocolhandlerArch arch){
		_arch = arch;
	}
	public protocolhandlerArch getArch(){
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
	public void sendconToProtocolhandler(Connector con) {
		// TODO Auto-generated method stub
		
		ph = con.getProtocolHandler();
		
		_arch.OUT_IphCon.sendphTocon(ph);
		
	}

	/*
  	  Implementation primitives required by the architecture
	*/
  

}