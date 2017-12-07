package umkc.conSSLconfig;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import org.apache.catalina.connector.Connector;

import umkc.ISSLconfig;

public class conSSLconfigArch extends AbstractMyxSimpleBrick implements ISSLconfig
{
    public static final IMyxName msg_ISSLconfig = MyxUtils.createName("umkc.ISSLconfig");


	private IconSSLconfigImp _imp;

    public conSSLconfigArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IconSSLconfigImp getImplementation(){
        try{
			return new conSSLconfigImp();    
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
		if (arg0.equals(msg_ISSLconfig)){
			return this;
		}        
		return null;
	}
  
    //To be imported: Connector
    public void sendconToSSL (Connector con)   {
		_imp.sendconToSSL(con);
    }    
}