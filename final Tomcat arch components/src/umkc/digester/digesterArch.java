package umkc.digester;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import org.apache.catalina.startup.Catalina;

import umkc.Idigester;
import umkc.IdigesterOut;

public class digesterArch extends AbstractMyxSimpleBrick implements Idigester
{
    public static final IMyxName msg_Idigester = MyxUtils.createName("umkc.Idigester");
    public static final IMyxName msg_IdigesterOut = MyxUtils.createName("umkc.IdigesterOut");

    public IdigesterOut OUT_IdigesterOut;

	private IdigesterImp _imp;

    public digesterArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IdigesterImp getImplementation(){
        try{
			return new digesterImp();    
        } catch (Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void init(){
        _imp.init();
    }
    
    public void begin(){
        OUT_IdigesterOut = (IdigesterOut) MyxUtils.getFirstRequiredServiceObject(this,msg_IdigesterOut);
        if (OUT_IdigesterOut == null){
 			System.err.println("Error: Interface umkc.IdigesterOut returned null");
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
		if (arg0.equals(msg_Idigester)){
			return this;
		}        
		return null;
	}
  
    //To be imported: Catalina
    public void sendTodigester (Catalina cat)   {
		_imp.sendTodigester(cat);
    }    
}