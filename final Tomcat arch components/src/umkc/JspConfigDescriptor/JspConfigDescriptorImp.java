package umkc.JspConfigDescriptor;



public class JspConfigDescriptorImp implements IJspConfigDescriptorImp
{
	private JspConfigDescriptorArch _arch;

    public JspConfigDescriptorImp (){
    }

	public void setArch(JspConfigDescriptorArch arch){
		_arch = arch;
	}
	public JspConfigDescriptorArch getArch(){
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

	/*
  	  Implementation primitives required by the architecture
	*/
}