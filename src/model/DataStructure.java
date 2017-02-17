package model;

public abstract class DataStructure {

	/*
	 * class untuk setiap orang yang menunggu di antrian
	 * time: waktu arrival/departure
	 * status: arrival/departure
	 */
	class person{
		
		private double time;
		private String status;
		
		public person(double time, String status){
			setTime(time);
			setStatus(status);
		}
		
		public void setTime(double time){
			this.time = time;
		}
		
		public double getTime(){
			return time;
		}
		
		public void setStatus(String status){
			this.status = status;
		}
		
		public String getStatus(){
			return status;
		}
		
	}
	
}
