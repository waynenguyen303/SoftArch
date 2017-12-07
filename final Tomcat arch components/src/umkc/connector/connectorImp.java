package umkc.connector;

import org.apache.catalina.connector.*;

import javax.servlet.ServletResponse;
import javax.servlet.ServletRequest;
import org.apache.catalina.Service;
import org.apache.coyote.Adapter;
import org.apache.coyote.ProtocolHandler;


public class connectorImp implements IconnectorImp
{
	private connectorArch _arch;

	Connector connector = new Connector();
	ServletResponse SR;
	ServletRequest SReq;
	Adapter adapter;
	
    public connectorImp (){
    }

	public void setArch(connectorArch arch){
		_arch = arch;
	}
	public connectorArch getArch(){
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
	public void sendToConnector(Service service) {
		// TODO Auto-generated method stub
		
		service.addConnector(connector);
		service.getServer();
		service.findConnectors();
		
		connector.getDomain();
		
		
		_arch.OUT_Iprotocolhandler.sendconToProtocolhandler(connector);
		_arch.OUT_Irequest.sendconToRequest(connector);
		_arch.OUT_Ihost.sendconToHost(connector);
		_arch.OUT_Iresponse1.sendconToresponse(connector);
		_arch.OUT_ISSLconfig.sendconToSSL(connector);
		
		
		
		
		
		
	}

	@Override
	public void sendphTocon(ProtocolHandler ph) {
		// TODO Auto-generated method stub
		
		try {
			
			ph.init();
			ph.start();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void resTocon(Response res) {
		// TODO Auto-generated method stub
		
		SR = res.getResponse();
		_arch.OUT_IservletResponse.sendresToServletres(SR);
		
	}

	@Override
	public void sendreqTocon(Request req) {
		// TODO Auto-generated method stub
		
		SReq = req.getRequest();
		_arch.OUT_IservletRequest.sendreqToservletreq(SReq);
		
	}

	/*
  	  Implementation primitives required by the architecture
	*/
  

}