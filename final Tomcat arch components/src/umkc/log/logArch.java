package umkc.log;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import org.apache.catalina.startup.Bootstrap;
import org.apache.catalina.startup.Catalina;

import umkc.Ilog;

public class logArch extends AbstractMyxSimpleBrick implements Ilog
{
    public static final IMyxName msg_Ilog = MyxUtils.createName("umkc.Ilog");


	private IlogImp _imp;

    public logArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IlogImp getImplementation(){
        try{
			return new logImp();    
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
		if (arg0.equals(msg_Ilog)){
			return this;
		}        
		return null;
	}
  
    //To be imported: Bootstrap,Catalina
    public void sendlog (Bootstrap b)   {
		_imp.sendlog(b);
    }    
    public void sendcatlog (Catalina cat)   {
		_imp.sendcatlog(cat);
    }    
}