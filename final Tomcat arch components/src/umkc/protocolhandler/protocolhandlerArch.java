package umkc.protocolhandler;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import org.apache.catalina.connector.Connector;

import umkc.IphCon;
import umkc.Iprotocolhandler;

public class protocolhandlerArch extends AbstractMyxSimpleBrick implements Iprotocolhandler
{
    public static final IMyxName msg_Iprotocolhandler = MyxUtils.createName("umkc.Iprotocolhandler");
    public static final IMyxName msg_IphCon = MyxUtils.createName("umkc.IphCon");

    public IphCon OUT_IphCon;

	private IprotocolhandlerImp _imp;

    public protocolhandlerArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IprotocolhandlerImp getImplementation(){
        try{
			return new protocolhandlerImp();    
        } catch (Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void init(){
        _imp.init();
    }
    
    public void begin(){
        OUT_IphCon = (IphCon) MyxUtils.getFirstRequiredServiceObject(this,msg_IphCon);
        if (OUT_IphCon == null){
 			System.err.println("Error: Interface umkc.IphCon returned null");
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
		if (arg0.equals(msg_Iprotocolhandler)){
			return this;
		}        
		return null;
	}
  
    //To be imported: Connector
    public void sendconToProtocolhandler (Connector con)   {
		_imp.sendconToProtocolhandler(con);
    }    
}