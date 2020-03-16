package datalab;


public class School {
   private String name;
   private String dbn;
   private int takers;
   private int reading;
   private int math;
   private int writing;
   
   School(String name, String dbn, int takers, int reading, int math, int writing) {
      this.name = name;
      this.dbn = dbn;
      this.takers = takers;
      this.reading = reading;
      this.math = math;   
      this.writing = writing;
   }
   
   public String getDbn() { 
      return dbn;
   }
   
   public String getName() { 
      return name;
   }
   
   public double getReading() {
	   return reading;
   }
   
   public double getWriting() {
	   return writing;
   }
   
   public double difference() {
	      return Math.abs(this.getReading() - this.getWriting());
	   }
   
}