package umkc.conCatLife;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import org.apache.catalina.Container;

import umkc.Iengine;

public class conCatLifeArch extends AbstractMyxSimpleBrick implements Iengine
{
    public static final IMyxName msg_Iengine = MyxUtils.createName("umkc.Iengine");


	private IconCatLifeImp _imp;

    public conCatLifeArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IconCatLifeImp getImplementation(){
        try{
			return new conCatLifeImp();    
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
		if (arg0.equals(msg_Iengine)){
			return this;
		}        
		return null;
	}
  
    //To be imported: Container
    public void sendcontainerTohost (Container container)   {
		_imp.sendcontainerTohost(container);
    }    
}