package umkc.servletResponse;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import javax.servlet.ServletResponse;

import umkc.IservletResponse;

public class servletResponseArch extends AbstractMyxSimpleBrick implements IservletResponse
{
    public static final IMyxName msg_IservletResponse = MyxUtils.createName("umkc.IservletResponse");


	private IservletResponseImp _imp;

    public servletResponseArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IservletResponseImp getImplementation(){
        try{
			return new servletResponseImp();    
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
		if (arg0.equals(msg_IservletResponse)){
			return this;
		}        
		return null;
	}
  
    //To be imported: ServletResponse
    public void sendresToServletres (ServletResponse res)   {
		_imp.sendresToServletres(res);
    }    
}