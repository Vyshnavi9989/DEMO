package com.simplilearn.demo;
import java.util.*;
	public class MapCollections {
		public static void main(String args[]) {
			HashMap<Integer,String> vr=new HashMap<Integer,String>();
			vr.put(1, "Vyshna");
			vr.put(2,"Ranga");
			vr.put(3, "Be");
			vr.put(4, "Happy");
			for(Map.Entry r:vr.entrySet()) {
				System.out.println(r.getKey()+":"+r.getValue());
			}
			TreeMap<Integer,String> rv=new TreeMap<Integer,String>();
			rv.put(5,"Keep Smile");
			rv.put(6, "be with me");
			for(Map.Entry v:rv.entrySet()) {
				System.out.println(v.getKey()+":"+v.getValue());
			}
			
			
		}

}
