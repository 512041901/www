package cn.et.ITest;

import java.util.Calendar;
import java.util.Date;

public class Main {
	
		public static class TestDemo {
			 
			static String name;
		    TestDemo(String name){
		        this.name = name;
		    }
		     
		     
		    @Override
		    public String toString() {
		        return "TestDemo [name=" + name + "]";
		    }
		 
		 
		 
		    public static void main(String[] args) {
		        TestDemo testDemo = new TestDemo("Ð¡Ã÷");
		        System.out.println(testDemo.toString());
		        TestDemo testDemo1 = new TestDemo("Ð¡ºì");
		        System.out.println(testDemo.name);
		        System.out.println(testDemo1.name);
		    }
		}



}
