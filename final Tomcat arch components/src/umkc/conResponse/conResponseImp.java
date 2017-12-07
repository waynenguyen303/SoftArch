package umkc.conResponse;


import org.apache.catalina.connector.Connector;
import org.apache.catalina.connector.Response;

public class conResponseImp implements IconResponseImp
{
	private conResponseArch _arch;
	
	Response response;

    public conResponseImp (){
    }

	public void setArch(conResponseArch arch){
		_arch = arch;
	}
	public conResponseArch getArch(){
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
	public void sendconToresponse(Connector con) {
		// TODO Auto-generated method stub
		
		response = con.createResponse();
		response.getCoyoteResponse();
		
		_arch.OUT_IresCon.resTocon(response);
		
		
	}


  

}