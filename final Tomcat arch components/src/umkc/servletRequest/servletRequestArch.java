package umkc.servletRequest;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import javax.servlet.ServletRequest;

import umkc.IservletRequest;

public class servletRequestArch extends AbstractMyxSimpleBrick implements IservletRequest
{
    public static final IMyxName msg_IservletRequest = MyxUtils.createName("umkc.IservletRequest");


	private IservletRequestImp _imp;

    public servletRequestArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IservletRequestImp getImplementation(){
        try{
			return new servletRequestImp();    
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
		if (arg0.equals(msg_IservletRequest)){
			return this;
		}        
		return null;
	}
  
    //To be imported: ServletRequest
    public void sendreqToservletreq (ServletRequest req)   {
		_imp.sendreqToservletreq(req);
    }    
}