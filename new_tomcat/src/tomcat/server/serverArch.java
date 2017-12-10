package tomcat.server;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import org.apache.catalina.Service;

import tomcat.Iserver_service;
import tomcat.Iservice_server;

public class serverArch extends AbstractMyxSimpleBrick implements Iservice_server
{
    public static final IMyxName msg_Iserver_service = MyxUtils.createName("tomcat.Iserver_service");
    public static final IMyxName msg_Iservice_server = MyxUtils.createName("tomcat.Iservice_server");

    public Iserver_service OUT_Iserver_service;

	private IserverImp _imp;

    public serverArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IserverImp getImplementation(){
        try{
			return new serverImp();    
        } catch (Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void init(){
        _imp.init();
    }
    
    public void begin(){
        OUT_Iserver_service = (Iserver_service) MyxUtils.getFirstRequiredServiceObject(this,msg_Iserver_service);
        if (OUT_Iserver_service == null){
 			System.err.println("Error: Interface tomcat.Iserver_service returned null");
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
		if (arg0.equals(msg_Iservice_server)){
			return this;
		}        
		return null;
	}
  
    //To be imported: Service
    public void serviceToserver (Service service)   {
		_imp.serviceToserver(service);
    }    
}