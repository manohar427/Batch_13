package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void main(String[] args) {
       List<Integer> l = new ArrayList<Integer>();
       
       
       Stream ps = l.parallelStream();
       
       Stream ss = l.stream();
       
       ps.filter( s -> );
       
	}

}
