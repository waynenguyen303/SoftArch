package umkc.server;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import org.apache.catalina.Container;

import org.apache.catalina.startup.Catalina;

import umkc.Icontainer;
import umkc.IserverCatalina;
import umkc.IserverLife;
import umkc.Iservice;

public class serverArch extends AbstractMyxSimpleBrick implements IserverCatalina,Icontainer
{
    public static final IMyxName msg_IserverCatalina = MyxUtils.createName("umkc.IserverCatalina");
    public static final IMyxName msg_IserverLife = MyxUtils.createName("umkc.IserverLife");
    public static final IMyxName msg_Iservice = MyxUtils.createName("umkc.Iservice");
    public static final IMyxName msg_Icontainer = MyxUtils.createName("umkc.Icontainer");

    public IserverLife OUT_IserverLife;
    public Iservice OUT_Iservice;

	private IserverImp _imp;

    public serverArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IserverImp getImplementation(){
        try{
			return new serverImp();    
        } catch (Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void init(){
        _imp.init();
    }
    
    public void begin(){
        OUT_IserverLife = (IserverLife) MyxUtils.getFirstRequiredServiceObject(this,msg_IserverLife);
        if (OUT_IserverLife == null){
 			System.err.println("Error: Interface umkc.IserverLife returned null");
			return;       
        }
        OUT_Iservice = (Iservice) MyxUtils.getFirstRequiredServiceObject(this,msg_Iservice);
        if (OUT_Iservice == null){
 			System.err.println("Error: Interface umkc.Iservice returned null");
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
		if (arg0.equals(msg_IserverCatalina)){
			return this;
		}        
		if (arg0.equals(msg_Icontainer)){
			return this;
		}        
		return null;
	}
  
    //To be imported: Catalina
    public void sendCatToServer (Catalina cat)   {
		_imp.sendCatToServer(cat);
    }    
  
    //To be imported: Container
    public void sendcontainer (Container container)   {
		_imp.sendcontainer(container);
    }    
}