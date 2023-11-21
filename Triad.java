package tride;
import java.util.*;

public class Triad{
	public static void main(String[] args){
		for(int j=3;j<=100;j++) {
			for(int i=0;i<=100;i++) {
				float s1 =(float) Math.sqrt(j*j+(i+1)*(i+1));
				int s2 =(int) s1;
				if(s1-s2==0) {
					System.out.println("("+j+","+i+1+","+s2+") is a triad");
				}
			}
		}
	}
}