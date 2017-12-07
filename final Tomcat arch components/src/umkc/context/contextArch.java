package umkc.context;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import org.apache.catalina.Host;

import umkc.Icontext;
import umkc.IcontextOut;
import umkc.Ipipeline2;

public class contextArch extends AbstractMyxSimpleBrick implements Icontext
{
    public static final IMyxName msg_Icontext = MyxUtils.createName("umkc.Icontext");
    public static final IMyxName msg_IcontextOut = MyxUtils.createName("umkc.IcontextOut");
    
    public static final IMyxName msg_Ipipeline2 = MyxUtils.createName("umkc.Ipipeline2");

   
    public IcontextOut OUT_IcontextOut;
    public Ipipeline2 OUT_Ipipeline2;

	private IcontextImp _imp;

    public contextArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IcontextImp getImplementation(){
        try{
			return new contextImp();    
        } catch (Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void init(){
        _imp.init();
    }
    
    public void begin(){
        OUT_IcontextOut = (IcontextOut) MyxUtils.getFirstRequiredServiceObject(this,msg_IcontextOut);
        if (OUT_IcontextOut == null){
 			System.err.println("Error: Interface umkc.IcontextOut returned null");
			return;       
        }
        OUT_IcontextOut = (IcontextOut) MyxUtils.getFirstRequiredServiceObject(this,msg_IcontextOut);
        if (OUT_IcontextOut == null){
 			System.err.println("Error: Interface umkc.IcontextOut returned null");
			return;       
        }
        OUT_Ipipeline2 = (Ipipeline2) MyxUtils.getFirstRequiredServiceObject(this,msg_Ipipeline2);
        if (OUT_Ipipeline2 == null){
 			System.err.println("Error: Interface umkc.Ipipeline2 returned null");
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
		if (arg0.equals(msg_Icontext)){
			return this;
		}        
		return null;
	}
  
    //To be imported: Host
    public void sendhostTocontext (Host host)   {
		_imp.sendhostTocontext(host);
    }    
}