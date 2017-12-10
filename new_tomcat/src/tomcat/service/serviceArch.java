package tomcat.service;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import org.apache.catalina.Engine;
import org.apache.catalina.Server;

import tomcat.Iengine_service;
import tomcat.Iserver_service;
import tomcat.Iservice_engine;
import tomcat.Iservice_server;

public class serviceArch extends AbstractMyxSimpleBrick implements Iserver_service,Iengine_service
{
    public static final IMyxName msg_Iserver_service = MyxUtils.createName("tomcat.Iserver_service");
    public static final IMyxName msg_Iservice_server = MyxUtils.createName("tomcat.Iservice_server");
    public static final IMyxName msg_Iservice_engine = MyxUtils.createName("tomcat.Iservice_engine");
    public static final IMyxName msg_Iengine_service = MyxUtils.createName("tomcat.Iengine_service");

    public Iservice_server OUT_Iservice_server;
    public Iservice_engine OUT_Iservice_engine;

	private IserviceImp _imp;

    public serviceArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IserviceImp getImplementation(){
        try{
			return new serviceImp();    
        } catch (Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void init(){
        _imp.init();
    }
    
    public void begin(){
        OUT_Iservice_server = (Iservice_server) MyxUtils.getFirstRequiredServiceObject(this,msg_Iservice_server);
        if (OUT_Iservice_server == null){
 			System.err.println("Error: Interface tomcat.Iservice_server returned null");
			return;       
        }
        OUT_Iservice_engine = (Iservice_engine) MyxUtils.getFirstRequiredServiceObject(this,msg_Iservice_engine);
        if (OUT_Iservice_engine == null){
 			System.err.println("Error: Interface tomcat.Iservice_engine returned null");
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
		if (arg0.equals(msg_Iserver_service)){
			return this;
		}        
		if (arg0.equals(msg_Iengine_service)){
			return this;
		}        
		return null;
	}
  
    //To be imported: Server
    public Server serverToservice (Server server)   {
		return _imp.serverToservice(server);
    }    
  
    //To be imported: Engine
    public void engineToservice (Engine engine)   {
		_imp.engineToservice(engine);
    }    
}