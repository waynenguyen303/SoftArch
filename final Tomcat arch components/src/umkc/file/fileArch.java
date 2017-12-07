package umkc.file;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import org.apache.catalina.Host;

import umkc.Ifile;

public class fileArch extends AbstractMyxSimpleBrick implements Ifile
{
    public static final IMyxName msg_Ifile = MyxUtils.createName("umkc.Ifile");


	private IfileImp _imp;

    public fileArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IfileImp getImplementation(){
        try{
			return new fileImp();    
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
		if (arg0.equals(msg_Ifile)){
			return this;
		}        
		return null;
	}
  
    //To be imported: Host
    public void sendhostTofile (Host host)   {
		_imp.sendhostTofile(host);
    }    
}