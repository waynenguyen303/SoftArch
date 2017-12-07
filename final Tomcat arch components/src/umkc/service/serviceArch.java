package umkc.service;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import org.apache.catalina.Server;

import org.apache.catalina.startup.Catalina;

import org.apache.coyote.Adapter;

import umkc.Iadapter;
import umkc.Iconnector;
import umkc.Imapper;
import umkc.Iservice;
import umkc.IserviceLife;

public class serviceArch extends AbstractMyxSimpleBrick implements Iservice,Iadapter
{
    public static final IMyxName msg_Iservice = MyxUtils.createName("umkc.Iservice");
    public static final IMyxName msg_IserviceLife = MyxUtils.createName("umkc.IserviceLife");
    public static final IMyxName msg_Iconnector = MyxUtils.createName("umkc.Iconnector");
    public static final IMyxName msg_Iadapter = MyxUtils.createName("umkc.Iadapter");
    public static final IMyxName msg_Imapper = MyxUtils.createName("umkc.Imapper");

    public IserviceLife OUT_IserviceLife;
    public Iconnector OUT_Iconnector;
    public Imapper OUT_Imapper;

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
        OUT_IserviceLife = (IserviceLife) MyxUtils.getFirstRequiredServiceObject(this,msg_IserviceLife);
        if (OUT_IserviceLife == null){
 			System.err.println("Error: Interface umkc.IserviceLife returned null");
			return;       
        }
        OUT_Iconnector = (Iconnector) MyxUtils.getFirstRequiredServiceObject(this,msg_Iconnector);
        if (OUT_Iconnector == null){
 			System.err.println("Error: Interface umkc.Iconnector returned null");
			return;       
        }
        OUT_Imapper = (Imapper) MyxUtils.getFirstRequiredServiceObject(this,msg_Imapper);
        if (OUT_Imapper == null){
 			System.err.println("Error: Interface umkc.Imapper returned null");
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
		if (arg0.equals(msg_Iservice)){
			return this;
		}        
		if (arg0.equals(msg_Iadapter)){
			return this;
		}        
		return null;
	}
  
    //To be imported: Server,Catalina
    public void sendToService (Server serve)   {
		_imp.sendToService(serve);
    }    
    public void sendCatToService (Catalina cat)   {
		_imp.sendCatToService(cat);
    }    
  
    //To be imported: Adapter
    public void sendadapterToservice (Adapter adapter)   {
		_imp.sendadapterToservice(adapter);
    }    
}