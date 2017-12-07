package umkc.stopCatalina;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import org.apache.catalina.startup.Catalina;

import umkc.IserverCatalina;
import umkc.Istop;
import umkc.Iuserinput;

public class stopCatalinaArch extends AbstractMyxSimpleBrick implements Istop,Iuserinput
{
    public static final IMyxName msg_Istop = MyxUtils.createName("umkc.Istop");
    public static final IMyxName msg_Iuserinput = MyxUtils.createName("umkc.Iuserinput");
    public static final IMyxName msg_IserverCatalina = MyxUtils.createName("umkc.IserverCatalina");

    public IserverCatalina OUT_IserverCatalina;

	private IstopCatalinaImp _imp;

    public stopCatalinaArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IstopCatalinaImp getImplementation(){
        try{
			return new stopCatalinaImp();    
        } catch (Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void init(){
        _imp.init();
    }
    
    public void begin(){
        OUT_IserverCatalina = (IserverCatalina) MyxUtils.getFirstRequiredServiceObject(this,msg_IserverCatalina);
        if (OUT_IserverCatalina == null){
 			System.err.println("Error: Interface umkc.IserverCatalina returned null");
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
		if (arg0.equals(msg_Istop)){
			return this;
		}        
		if (arg0.equals(msg_Iuserinput)){
			return this;
		}        
		return null;
	}
  
    //To be imported: Catalina
    public void sendstopcatalina (Catalina cat)   {
		_imp.sendstopcatalina(cat);
    }    
  
    
    public void senduserinput (String message)   {
		_imp.senduserinput(message);
    }    
}