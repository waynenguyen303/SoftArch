package umkc.valve1;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import org.apache.catalina.Pipeline;

import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;

import umkc.IreqCon;
import umkc.IresCon;
import umkc.Ivalve1;

public class valve1Arch extends AbstractMyxSimpleBrick implements Ivalve1,IresCon,IreqCon
{
    public static final IMyxName msg_Ivalve1 = MyxUtils.createName("umkc.Ivalve1");
    public static final IMyxName msg_IresCon = MyxUtils.createName("umkc.IresCon");
    public static final IMyxName msg_IreqCon = MyxUtils.createName("umkc.IreqCon");


	private Ivalve1Imp _imp;

    public valve1Arch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected Ivalve1Imp getImplementation(){
        try{
			return new valve1Imp();    
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
		if (arg0.equals(msg_Ivalve1)){
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
  
    //To be imported: Pipeline
    public void sendpipeTovalve1 (Pipeline pl)   {
		_imp.sendpipeTovalve1(pl);
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