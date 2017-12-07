package umkc.loadCataliina;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import org.apache.catalina.startup.Catalina;

import umkc.ICatalinaStringManager;
import umkc.Idigester;
import umkc.IloadCatalina;
import umkc.Ilog;
import umkc.Istop;
import umkc.Iuserinput;

public class loadCatalinaArch extends AbstractMyxSimpleBrick implements IloadCatalina,Iuserinput
{
    public static final IMyxName msg_IloadCatalina = MyxUtils.createName("umkc.IloadCatalina");
    public static final IMyxName msg_Istop = MyxUtils.createName("umkc.Istop");
    public static final IMyxName msg_Ilog = MyxUtils.createName("umkc.Ilog");
    public static final IMyxName msg_ICatalinaStringManager = MyxUtils.createName("umkc.ICatalinaStringManager");
    public static final IMyxName msg_Idigester = MyxUtils.createName("umkc.Idigester");
    public static final IMyxName msg_Iuserinput = MyxUtils.createName("umkc.Iuserinput");

    public Istop OUT_Istop;
    public Ilog OUT_Ilog;
    public ICatalinaStringManager OUT_ICatalinaStringManager;
    public Idigester OUT_Idigester;

	private IloadCatalinaImp _imp;

    public loadCatalinaArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IloadCatalinaImp getImplementation(){
        try{
			return new loadCatalinaImp();    
        } catch (Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void init(){
        _imp.init();
    }
    
    public void begin(){
        OUT_Istop = (Istop) MyxUtils.getFirstRequiredServiceObject(this,msg_Istop);
        if (OUT_Istop == null){
 			System.err.println("Error: Interface umkc.Istop returned null");
			return;       
        }
        OUT_Ilog = (Ilog) MyxUtils.getFirstRequiredServiceObject(this,msg_Ilog);
        if (OUT_Ilog == null){
 			System.err.println("Error: Interface umkc.Ilog returned null");
			return;       
        }
        OUT_ICatalinaStringManager = (ICatalinaStringManager) MyxUtils.getFirstRequiredServiceObject(this,msg_ICatalinaStringManager);
        if (OUT_ICatalinaStringManager == null){
 			System.err.println("Error: Interface umkc.ICatalinaStringManager returned null");
			return;       
        }
        OUT_Idigester = (Idigester) MyxUtils.getFirstRequiredServiceObject(this,msg_Idigester);
        if (OUT_Idigester == null){
 			System.err.println("Error: Interface umkc.Idigester returned null");
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
		if (arg0.equals(msg_IloadCatalina)){
			return this;
		}        
		if (arg0.equals(msg_Iuserinput)){
			return this;
		}        
		return null;
	}
  
    //To be imported: Catalina
    public void sendCatalinatoLoad (Catalina cat)   {
		_imp.sendCatalinatoLoad(cat);
    }    
  
    
    public void senduserinput (String message)   {
		_imp.senduserinput(message);
    }    
}