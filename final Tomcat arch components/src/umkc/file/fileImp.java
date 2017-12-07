package umkc.file;


import java.io.File;

import org.apache.catalina.Host;

public class fileImp implements IfileImp
{
	private fileArch _arch;

	File file,file1,file2,file3,file4;	
	
    public fileImp (){
    }

	public void setArch(fileArch arch){
		_arch = arch;
	}
	public fileArch getArch(){
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
	public void sendhostTofile(Host host) {
		// TODO Auto-generated method stub
		file = host.getAppBaseFile();
		file1 =host.getCatalinaBase();
		file2= host.getCatalinaHome();
		file3= host.getConfigBaseFile();
	}

	/*
  	  Implementation primitives required by the architecture
	*/
  

}