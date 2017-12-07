package umkc.adapter;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;

import umkc.Iadapter;
import umkc.IreqCon;
import umkc.IresCon;

public class adapterArch extends AbstractMyxSimpleBrick implements IresCon,IreqCon
{
    public static final IMyxName msg_IresCon = MyxUtils.createName("umkc.IresCon");
    public static final IMyxName msg_IreqCon = MyxUtils.createName("umkc.IreqCon");
    public static final IMyxName msg_Iadapter = MyxUtils.createName("umkc.Iadapter");

    public Iadapter OUT_Iadapter;

	private IadapterImp _imp;

    public adapterArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IadapterImp getImplementation(){
        try{
			return new adapterImp();    
        } catch (Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void init(){
        _imp.init();
    }
    
    public void begin(){
        OUT_Iadapter = (Iadapter) MyxUtils.getFirstRequiredServiceObject(this,msg_Iadapter);
        if (OUT_Iadapter == null){
 			System.err.println("Error: Interface umkc.Iadapter returned null");
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
		if (arg0.equals(msg_IresCon)){
			return this;
		}        
		if (arg0.equals(msg_IreqCon)){
			return this;
		}        
		return null;
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