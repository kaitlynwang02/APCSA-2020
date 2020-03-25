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
      
      int temp = 0;
      School largest = new School(null, null, 0, 0, 0, 0);
      for (School schl : allschools) {
          if (schl.difference() > temp) {
        	  temp = (int) schl.difference();
        	  largest = schl;
          }
       }
      
      System.out.println("School with largest difference between mean reading and writing scores: " + largest.getName());
      System.out.println("Difference: " + temp);
      
   }   
}