package umkc.conRequest;


import org.apache.catalina.connector.Connector;
import org.apache.catalina.connector.Request;

public class conRequstImp implements IconRequestImp
{
	private conRequstArch _arch;
	
	Request request;

    public conRequstImp (){
    }

	public void setArch(conRequstArch arch){
		_arch = arch;
	}
	public conRequstArch getArch(){
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
	public void sendconToRequest(Connector con) {
		// TODO Auto-generated method stub
		
		request = con.createRequest();
		
		//get coyote request
		request.getCoyoteRequest();
		
		_arch.OUT_IreqCon.sendreqTocon(request);
		
		
		
	}

	/*
  	  Implementation primitives required by the architecture
	*/
  

}