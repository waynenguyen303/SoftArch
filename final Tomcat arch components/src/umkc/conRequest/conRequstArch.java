package umkc.conRequest;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import org.apache.catalina.connector.Connector;

import umkc.IreqCon;
import umkc.Irequest;

public class conRequstArch extends AbstractMyxSimpleBrick implements Irequest
{
    public static final IMyxName msg_Irequest = MyxUtils.createName("umkc.Irequest");
    public static final IMyxName msg_IreqCon = MyxUtils.createName("umkc.IreqCon");

    public IreqCon OUT_IreqCon;

	private IconRequestImp _imp;

    public conRequstArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IconRequestImp getImplementation(){
        try{
			return new conRequstImp();    
        } catch (Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void init(){
        _imp.init();
    }
    
    public void begin(){
        OUT_IreqCon = (IreqCon) MyxUtils.getFirstRequiredServiceObject(this,msg_IreqCon);
        if (OUT_IreqCon == null){
 			System.err.println("Error: Interface umkc.IreqCon returned null");
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
		if (arg0.equals(msg_Irequest)){
			return this;
		}        
		return null;
	}
  
    //To be imported: Connector
    public void sendconToRequest (Connector con)   {
		_imp.sendconToRequest(con);
    }    
}