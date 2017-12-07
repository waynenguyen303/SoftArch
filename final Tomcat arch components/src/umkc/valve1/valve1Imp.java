package umkc.valve1;


import java.io.IOException;

import javax.servlet.ServletException;

import org.apache.catalina.Pipeline;
import org.apache.catalina.Valve;
import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;

public class valve1Imp implements Ivalve1Imp
{
	private valve1Arch _arch;
	
	
	Response response;
	Request request;
	Valve[] valve;

    public valve1Imp (){
    }

	public void setArch(valve1Arch arch){
		_arch = arch;
	}
	public valve1Arch getArch(){
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
			valve[1].invoke(request, response);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
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
	public void sendpipeTovalve1(Pipeline pl) {
		// TODO Auto-generated method stub
		
		valve= pl.getValves();
		
	}

	@Override
	public void resTocon(Response res) {
		// TODO Auto-generated method stub
		response = res;
	}

	@Override
	public void sendreqTocon(Request req) {
		// TODO Auto-generated method stub
		
		request = req;
		
	}

	/*
  	  Implementation primitives required by the architecture
	*/
  

}