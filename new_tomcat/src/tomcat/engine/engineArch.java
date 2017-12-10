package tomcat.engine;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import org.apache.catalina.Service;

import tomcat.Iengine_service;
import tomcat.Iservice_engine;

public class engineArch extends AbstractMyxSimpleBrick implements Iservice_engine
{
    public static final IMyxName msg_Iservice_engine = MyxUtils.createName("tomcat.Iservice_engine");
    public static final IMyxName msg_Iengine_service = MyxUtils.createName("tomcat.Iengine_service");

    public Iengine_service OUT_Iengine_service;

	private IengineImp _imp;

    public engineArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IengineImp getImplementation(){
        try{
			return new engineImp();    
        } catch (Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void init(){
        _imp.init();
    }
    
    public void begin(){
        OUT_Iengine_service = (Iengine_service) MyxUtils.getFirstRequiredServiceObject(this,msg_Iengine_service);
        if (OUT_Iengine_service == null){
 			System.err.println("Error: Interface tomcat.Iengine_service returned null");
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
		if (arg0.equals(msg_Iservice_engine)){
			return this;
		}        
		return null;
	}
  
    //To be imported: Service
    public void serviceToengine (Service service)   {
		_imp.serviceToengine(service);
    }    
}