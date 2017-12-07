package umkc.connector;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import org.apache.catalina.Service;

import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;

import org.apache.coyote.ProtocolHandler;

import umkc.ISSLconfig;
import umkc.IconMBeans;
import umkc.Iconnector;
import umkc.Ihost;
import umkc.IphCon;
import umkc.Iprotocolhandler;
import umkc.IreqCon;
import umkc.Irequest;
import umkc.IresCon;
import umkc.Iresponse1;
import umkc.IservletRequest;
import umkc.IservletResponse;

public class connectorArch extends AbstractMyxSimpleBrick implements Iconnector,IphCon,IresCon,IreqCon
{
    public static final IMyxName msg_Iconnector = MyxUtils.createName("umkc.Iconnector");
    public static final IMyxName msg_Iprotocolhandler = MyxUtils.createName("umkc.Iprotocolhandler");
    public static final IMyxName msg_Irequest = MyxUtils.createName("umkc.Irequest");
    public static final IMyxName msg_Ihost = MyxUtils.createName("umkc.Ihost");
    public static final IMyxName msg_Iresponse1 = MyxUtils.createName("umkc.Iresponse1");
    public static final IMyxName msg_ISSLconfig = MyxUtils.createName("umkc.ISSLconfig");
    public static final IMyxName msg_IphCon = MyxUtils.createName("umkc.IphCon");
    public static final IMyxName msg_IresCon = MyxUtils.createName("umkc.IresCon");
    public static final IMyxName msg_IservletResponse = MyxUtils.createName("umkc.IservletResponse");
    public static final IMyxName msg_IreqCon = MyxUtils.createName("umkc.IreqCon");
    public static final IMyxName msg_IservletRequest = MyxUtils.createName("umkc.IservletRequest");
    public static final IMyxName msg_IconMBeans = MyxUtils.createName("umkc.IconMBeans");

    public Iprotocolhandler OUT_Iprotocolhandler;
    public Irequest OUT_Irequest;
    public Ihost OUT_Ihost;
    public Iresponse1 OUT_Iresponse1;
    public ISSLconfig OUT_ISSLconfig;
    public IservletResponse OUT_IservletResponse;
    public IservletRequest OUT_IservletRequest;
    public IconMBeans OUT_IconMBeans;

	private IconnectorImp _imp;

    public connectorArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IconnectorImp getImplementation(){
        try{
			return new connectorImp();    
        } catch (Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void init(){
        _imp.init();
    }
    
    public void begin(){
        OUT_Iprotocolhandler = (Iprotocolhandler) MyxUtils.getFirstRequiredServiceObject(this,msg_Iprotocolhandler);
        if (OUT_Iprotocolhandler == null){
 			System.err.println("Error: Interface umkc.Iprotocolhandler returned null");
			return;       
        }
        OUT_Irequest = (Irequest) MyxUtils.getFirstRequiredServiceObject(this,msg_Irequest);
        if (OUT_Irequest == null){
 			System.err.println("Error: Interface umkc.Irequest returned null");
			return;       
        }
        OUT_Ihost = (Ihost) MyxUtils.getFirstRequiredServiceObject(this,msg_Ihost);
        if (OUT_Ihost == null){
 			System.err.println("Error: Interface umkc.Ihost returned null");
			return;       
        }
        OUT_Iresponse1 = (Iresponse1) MyxUtils.getFirstRequiredServiceObject(this,msg_Iresponse1);
        if (OUT_Iresponse1 == null){
 			System.err.println("Error: Interface umkc.Iresponse1 returned null");
			return;       
        }
        OUT_ISSLconfig = (ISSLconfig) MyxUtils.getFirstRequiredServiceObject(this,msg_ISSLconfig);
        if (OUT_ISSLconfig == null){
 			System.err.println("Error: Interface umkc.ISSLconfig returned null");
			return;       
        }
        OUT_IservletResponse = (IservletResponse) MyxUtils.getFirstRequiredServiceObject(this,msg_IservletResponse);
        if (OUT_IservletResponse == null){
 			System.err.println("Error: Interface umkc.IservletResponse returned null");
			return;       
        }
        OUT_IservletRequest = (IservletRequest) MyxUtils.getFirstRequiredServiceObject(this,msg_IservletRequest);
        if (OUT_IservletRequest == null){
 			System.err.println("Error: Interface umkc.IservletRequest returned null");
			return;       
        }
        OUT_IconMBeans = (IconMBeans) MyxUtils.getFirstRequiredServiceObject(this,msg_IconMBeans);
        if (OUT_IconMBeans == null){
 			System.err.println("Error: Interface umkc.IconMBeans returned null");
			return;       
        }
        _imp.begin();
    }
    
    public void end(){
        _imp.end();
    }
    
    public void destroy(){
        _imp.destroy();
    }
    
	public Object getServiceObject(IMyxName arg0) {
		if (arg0.equals(msg_Iconnector)){
			return this;
		}        
		if (arg0.equals(msg_IphCon)){
			return this;
		}        
		if (arg0.equals(msg_IresCon)){
			return this;
		}        
		if (arg0.equals(msg_IreqCon)){
			return this;
		}        
		return null;
	}
  
    //To be imported: Service
    public void sendToConnector (Service service)   {
		_imp.sendToConnector(service);
    }    
  
    //To be imported: ProtocolHandler
    public void sendphTocon (ProtocolHandler ph)   {
		_imp.sendphTocon(ph);
    }    
  
    //To be imported: Response
    public void resTocon (Response res)   {
		_imp.resTocon(res);
    }    
  
    //To be imported: Request
    public void sendreqTocon (Request req)   {
		_imp.sendreqTocon(req);
    }    
}