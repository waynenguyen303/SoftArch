package umkc.adapter;



import org.apache.coyote.Adapter;
import org.apache.coyote.Request;
import org.apache.coyote.Response;


public class adapterImp implements IadapterImp
{
	private adapterArch _arch;
	
	Response response;
	Request request;
	Adapter adapter;

    public adapterImp (){
    }

	public void setArch(adapterArch arch){
		_arch = arch;
	}
	public adapterArch getArch(){
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
		
		
		try {
			
			adapter.service(request, response);
			_arch.OUT_Iadapter.sendadapterToservice(adapter);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void end(){
		//TODO Auto-generated method stub
	}
	public void destroy(){
		//TODO Auto-generated method stub
	}



	@Override
	public void resTocon(org.apache.catalina.connector.Response res) {
		// TODO Auto-generated method stub
		
		response = res.getCoyoteResponse();
		
	}

	@Override
	public void sendreqTocon(org.apache.catalina.connector.Request req) {
		// TODO Auto-generated method stub
		
		request= req.getCoyoteRequest();
		
	}

	/*
  	  Implementation primitives required by the architecture
	*/
  

}