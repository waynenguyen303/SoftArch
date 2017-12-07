package umkc.conResponse;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import org.apache.catalina.connector.Connector;

import umkc.IresCon;
import umkc.Iresponse1;

public class conResponseArch extends AbstractMyxSimpleBrick implements Iresponse1
{
    public static final IMyxName msg_Iresponse1 = MyxUtils.createName("umkc.Iresponse1");
    public static final IMyxName msg_IresCon = MyxUtils.createName("umkc.IresCon");

    public IresCon OUT_IresCon;

	private IconResponseImp _imp;

    public conResponseArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IconResponseImp getImplementation(){
        try{
			return new conResponseImp();    
        } catch (Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void init(){
        _imp.init();
    }
    
    public void begin(){
        OUT_IresCon = (IresCon) MyxUtils.getFirstRequiredServiceObject(this,msg_IresCon);
        if (OUT_IresCon == null){
 			System.err.println("Error: Interface umkc.IresCon returned null");
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
		if (arg0.equals(msg_Iresponse1)){
			return this;
		}        
		return null;
	}
  
    //To be imported: Connector
    public void sendconToresponse (Connector con)   {
		_imp.sendconToresponse(con);
    }    
}