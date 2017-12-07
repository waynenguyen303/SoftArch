package umkc.serverLife;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import org.apache.catalina.Server;

import umkc.IserverLife;

public class serverLifeArch extends AbstractMyxSimpleBrick implements IserverLife
{
    public static final IMyxName msg_IserverLife = MyxUtils.createName("umkc.IserverLife");


	private IserverLifeImp _imp;

    public serverLifeArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IserverLifeImp getImplementation(){
        try{
			return new serverLifeImp();    
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
		if (arg0.equals(msg_IserverLife)){
			return this;
		}        
		return null;
	}
  
    //To be imported: Server
    public void sendToServerLife (Server serve)   {
		_imp.sendToServerLife(serve);
    }    
}