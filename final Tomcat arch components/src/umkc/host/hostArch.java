package umkc.host;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import org.apache.catalina.Container;

import org.apache.catalina.connector.Connector;

import umkc.Icontext;
import umkc.Iengine;
import umkc.Iexecutorservice;
import umkc.Ifile;
import umkc.IgetAndsetHost;
import umkc.Ihost;
import umkc.IhostLife;
import umkc.Ipattern;
import umkc.Ipipeline1;

public class hostArch extends AbstractMyxSimpleBrick implements Ihost,Iengine
{
    public static final IMyxName msg_Ihost = MyxUtils.createName("umkc.Ihost");
    public static final IMyxName msg_Icontext = MyxUtils.createName("umkc.Icontext");
    public static final IMyxName msg_Iengine = MyxUtils.createName("umkc.Iengine");
    public static final IMyxName msg_IhostLife = MyxUtils.createName("umkc.IhostLife");
    public static final IMyxName msg_Ipattern = MyxUtils.createName("umkc.Ipattern");
    public static final IMyxName msg_Iexecutorservice = MyxUtils.createName("umkc.Iexecutorservice");
    public static final IMyxName msg_Ifile = MyxUtils.createName("umkc.Ifile");
    public static final IMyxName msg_IgetAndsetHost = MyxUtils.createName("umkc.IgetAndsetHost");
    public static final IMyxName msg_Ipipeline1 = MyxUtils.createName("umkc.Ipipeline1");

    public Icontext OUT_Icontext;
    public IhostLife OUT_IhostLife;
    public Ipattern OUT_Ipattern;
    public Iexecutorservice OUT_Iexecutorservice;
    public Ifile OUT_Ifile;
    public IgetAndsetHost OUT_IgetAndsetHost;
    public Ipipeline1 OUT_Ipipeline1;

	private IhostImp _imp;

    public hostArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IhostImp getImplementation(){
        try{
			return new hostImp();    
        } catch (Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void init(){
        _imp.init();
    }
    
    public void begin(){
        OUT_Icontext = (Icontext) MyxUtils.getFirstRequiredServiceObject(this,msg_Icontext);
        if (OUT_Icontext == null){
 			System.err.println("Error: Interface umkc.Icontext returned null");
			return;       
        }
        OUT_IhostLife = (IhostLife) MyxUtils.getFirstRequiredServiceObject(this,msg_IhostLife);
        if (OUT_IhostLife == null){
 			System.err.println("Error: Interface umkc.IhostLife returned null");
			return;       
        }
        OUT_Ipattern = (Ipattern) MyxUtils.getFirstRequiredServiceObject(this,msg_Ipattern);
        if (OUT_Ipattern == null){
 			System.err.println("Error: Interface umkc.Ipattern returned null");
			return;       
        }
        OUT_Iexecutorservice = (Iexecutorservice) MyxUtils.getFirstRequiredServiceObject(this,msg_Iexecutorservice);
        if (OUT_Iexecutorservice == null){
 			System.err.println("Error: Interface umkc.Iexecutorservice returned null");
			return;       
        }
        OUT_Ifile = (Ifile) MyxUtils.getFirstRequiredServiceObject(this,msg_Ifile);
        if (OUT_Ifile == null){
 			System.err.println("Error: Interface umkc.Ifile returned null");
			return;       
        }
        OUT_IgetAndsetHost = (IgetAndsetHost) MyxUtils.getFirstRequiredServiceObject(this,msg_IgetAndsetHost);
        if (OUT_IgetAndsetHost == null){
 			System.err.println("Error: Interface umkc.IgetAndsetHost returned null");
			return;       
        }
        OUT_Ipipeline1 = (Ipipeline1) MyxUtils.getFirstRequiredServiceObject(this,msg_Ipipeline1);
        if (OUT_Ipipeline1 == null){
 			System.err.println("Error: Interface umkc.Ipipeline1 returned null");
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
		if (arg0.equals(msg_Ihost)){
			return this;
		}        
		if (arg0.equals(msg_Iengine)){
			return this;
		}        
		return null;
	}
  
    //To be imported: Connector
    public void sendconToHost (Connector con)   {
		_imp.sendconToHost(con);
    }    
  
    //To be imported: Container
    public void sendcontainerTohost (Container container)   {
		_imp.sendcontainerTohost(container);
    }    
}