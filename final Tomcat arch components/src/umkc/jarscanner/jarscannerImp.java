package umkc.jarscanner;


import org.apache.catalina.Context;
import org.apache.tomcat.JarScanner;

public class jarscannerImp implements IjarscannerImp
{
	private jarscannerArch _arch;
	
	JarScanner JS;

    public jarscannerImp (){
    }

	public void setArch(jarscannerArch arch){
		_arch = arch;
	}
	public jarscannerArch getArch(){
		return _arch;
	}

	/*
  	  Myx Lifecycle Methods: these methods are called automatically by the framework
  	  as the bricks are created, attached, detached, and destroyed respectively.
	*/	
	public void init(){
	    //TODO Auto-generated method stub
	}
	public void begin(){
		//TODO Auto-generated method stub
	}
	public void end(){
		//TODO Auto-generated method stub
	}
	public void destroy(){
		//TODO Auto-generated method stub
	}

	@Override
	public void sendcontextToOut(Context context) {
		// TODO Auto-generated method stub
		
		JS= context.getJarScanner();
		
	}

	/*
  	  Implementation primitives required by the architecture
	*/

}