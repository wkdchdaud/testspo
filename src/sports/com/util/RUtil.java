package sports.com.util;

import java.util.List;

import org.rosuda.JRI.REXP;
import org.rosuda.JRI.Rengine;

import sports.com.dto.R_testDTO;;

public class RUtil {
 public double R_list(List<R_testDTO> list){
	 Rengine re = new Rengine(new String[] {"--vanilla"}, false, null);
	 System.out.println("R 연동 ");

	 if (!re.waitForR()){
	 	System.out.println("R 연동 안되고 있어 .");
	 }
	 int[] R_Array =  new int[list.size()];
	 
	 	for(int i = 0; i<list.size(); i++){
	 		R_Array[i]=list.get(i).getPrice();
	 		re.eval("a"+i +"<-" + R_Array[i],true);
	 		re.eval("a"+i +"<-" + R_Array[i],true);
	 		re.eval("a"+i +"<-" + R_Array[i],true);
	 	}
//	 re.eval("a <- " ,true);
//	 re.eval("b <- 4.5 " ,true);
	 re.eval("c <- a0+a1+a2" ,true);
	 REXP x = re.eval("c",true);
	 System.out.println(x.asDouble());
	 return x.asDouble();
 }
 }
