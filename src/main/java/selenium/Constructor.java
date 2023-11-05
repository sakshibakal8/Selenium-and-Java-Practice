package selenium;

import java.awt.image.SampleModel;
import java.lang.ref.Reference;

import javax.crypto.ShortBufferException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import net.bytebuddy.agent.builder.AgentBuilder.CircularityLock.Default;

public class Constructor {
	//Only method and variable have static and non-static
	//To access that non-static method or variable should access it by objectname.variablename or objectname.methodname
	//object should be created from the current class
	String S;
	String D;
	
	public Constructor() {
		// TODO Auto-generated constructor stub
		System.out.println("bat");
	}
	public Constructor(String R,String D)
	{
		S=R;
		this.D=D;
		System.out.println("ground");
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor objConstructor = new Constructor();
		Constructor chappal= new Constructor("Sakshi","Bakal");
		
		Constructor shoe= new Constructor("Sashi","kal");

	
		System.out.println("chappal S"+chappal.S);
		System.out.println("chappal D"+chappal.D);
		System.out.println("shoe S"+shoe.S);
		System.out.println("show D"+shoe.D);

	}

	

}


