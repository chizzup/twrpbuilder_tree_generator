package mkTree;

import java.io.File;
import util.ShellExecuter;
import util.FWriter;
import util.GetBuildInfo;

public class MkAndroidProducts {

	private String idata;
	
	public MkAndroidProducts() {
		System.out.println("Making AndroidProducts.mk");
		new FWriter("AndroidProducts.mk",getData());

	}
	
	private String getData() {
		idata =ShellExecuter.CopyRight();
		idata+="LOCAL_PATH := device/"+GetBuildInfo.getBrand()+File.separator+GetBuildInfo.getCodename()+"\n" + 
				"\n" + 
				"PRODUCT_MAKEFILES := $(LOCAL_PATH)/omni_"+GetBuildInfo.getCodename()+".mk";
		return idata;
	}
	
}