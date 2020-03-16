package datalab;
/*
 * Arrays of objects
 */

import core.data.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SAT_List {
   public static void main(String[] args) {
	   
      DataSource ds = DataSource.connect("https://data.cityofnewyork.us/api/views/zt9s-n5aj/rows.xml").load();
      ArrayList<School> allschools = ds.fetchList(School.class, "row/row/school_name", 
             "row/row/dbn", "row/row/number_of_test_takers",
             "row/row/critical_reading_mean", "row/row/mathematics_mean", "row/row/writing_mean");
      
      double difference = 0;
      String temp = "";
      
      for (int i = 0; i < allschools.size()-1; i++) {
    	  if (Math.abs((allschools.get(i).getReading() - allschools.get(i).getWriting())) > Math.abs((allschools.get(i+1).getReading() - allschools.get(i+1).getWriting()))) {
    		  difference = Math.abs(allschools.get(i).getReading() - allschools.get(i).getWriting());
    		  temp = allschools.get(i).getName();
    	  }
      }
      
      System.out.println("School with largest difference between mean reading and writing scores: " + temp);
      System.out.println("Difference: " + difference);
      
   }   
}