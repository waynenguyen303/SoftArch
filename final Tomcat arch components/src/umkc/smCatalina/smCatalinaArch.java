package umkc.smCatalina;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import org.apache.catalina.startup.Catalina;

import umkc.ICatalinaStringManager;

public class smCatalinaArch extends AbstractMyxSimpleBrick implements ICatalinaStringManager
{
    public static final IMyxName msg_ICatalinaStringManager = MyxUtils.createName("umkc.ICatalinaStringManager");


	private IsmCatalinaImp _imp;

    public smCatalinaArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IsmCatalinaImp getImplementation(){
        try{
			return new smCatalinaImp();    
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
		if (arg0.equals(msg_ICatalinaStringManager)){
			return this;
		}        
		return null;
	}
  
    //To be imported: Catalina
    public void sendToCatalinaSM (Catalina cat)   {
		_imp.sendToCatalinaSM(cat);
    }    
}