package umkc.executorservice;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import org.apache.catalina.Host;

import umkc.Iexecutorservice;

public class executorserviceArch extends AbstractMyxSimpleBrick implements Iexecutorservice
{
    public static final IMyxName msg_Iexecutorservice = MyxUtils.createName("umkc.Iexecutorservice");


	private IexecutorserviceImp _imp;

    public executorserviceArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IexecutorserviceImp getImplementation(){
        try{
			return new executorserviceImp();    
        } catch (Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void init(){
        _imp.init();
    }
    
    public void begin(){
        _imp.begin();
    }
    
    public void end(){
        _imp.end();
    }
    
    public void destroy(){
        _imp.destroy();
    }
    
	public Object getServiceObject(IMyxName arg0) {
		if (arg0.equals(msg_Iexecutorservice)){
			return this;
		}        
		return null;
	}
  
    //To be imported: Host
    public void sendhostToexecutor (Host host)   {
		_imp.sendhostToexecutor(host);
    }    
}