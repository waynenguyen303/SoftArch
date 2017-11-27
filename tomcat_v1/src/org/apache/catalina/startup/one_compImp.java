package org.apache.catalina.startup;



public class one_compImp implements Ione_compImp
{
	private one_compArch _arch;

    public one_compImp (){
    }

	public void setArch(one_compArch arch){
		_arch = arch;
	}
	public one_compArch getArch(){
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
		
		Bootstrap tom = new Bootstrap();
		try {
			tom.init();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			tom.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void end(){
		//TODO Auto-generated method stub
	}
	public void destroy(){
		//TODO Auto-generated method stub
	}

	/*
  	  Implementation primitives required by the architecture
	*/
}