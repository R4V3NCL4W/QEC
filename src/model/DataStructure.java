package model;

public class DataStructure {

	/*
	 * class untuk setiap orang yang menunggu di antrian
	 * time: waktu arrival/departure
	 * status: arrival/departure
	 */
	public class person{
		
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
	
	public class nQueue{
		
		public nQueue(int Q, double time){
			setQ(Q);
			setTime(time);
		}
		
		private int Q;
		private double time;
		
		public void setQ(int Q){
			this.Q = Q;
		}
		
		public int getQ(){
			return Q;
		}
		
		public void setTime(double time){
			this.time = time;
		}
		
		public double getTime(){
			return time;
		}
		
	}
	
}
