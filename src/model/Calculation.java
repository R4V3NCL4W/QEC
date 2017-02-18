package model;

import model.QueueData;

import java.text.DecimalFormat;
import java.util.Stack;

import model.DataStructure.person;

public class Calculation extends DataStructure{
	
	private static DecimalFormat df2 = new DecimalFormat(".##");
	
	private person[] queue = new person[24];
	private double stop;
	private String[] TS = new String[24];
	private double[] TAns = new double[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
	private double Ttotal = 0;
	private String TStotal;
	private double q = 0;
	private String qS;
	
	public Calculation(QueueData myData){
		
		queue[0] = new person(myData.getA0(), "arrival");
		queue[1] = new person(myData.getA1(), "arrival");
		queue[2] = new person(myData.getA2(), "arrival");
		queue[3] = new person(myData.getA3(), "arrival");
		queue[4] = new person(myData.getA4(), "arrival");
		queue[5] = new person(myData.getA5(), "arrival");
		queue[6] = new person(myData.getA6(), "arrival");
		queue[7] = new person(myData.getA7(), "arrival");
		queue[8] = new person(myData.getA8(), "arrival");
		queue[9] = new person(myData.getA9(), "arrival");
		queue[10] = new person(myData.getA10(), "arrival");
		queue[11] = new person(myData.getA11(), "arrival");
		queue[12] = new person(myData.getD0(), "departure");
		queue[13] = new person(myData.getD1(), "departure");
		queue[14] = new person(myData.getD2(), "departure");
		queue[15] = new person(myData.getD3(), "departure");
		queue[16] = new person(myData.getD4(), "departure");
		queue[17] = new person(myData.getD5(), "departure");
		queue[18] = new person(myData.getD6(), "departure");
		queue[19] = new person(myData.getD7(), "departure");
		queue[20] = new person(myData.getD8(), "departure");
		queue[21] = new person(myData.getD9(), "departure");
		queue[22] = new person(myData.getD10(), "departure");
		queue[23] = new person(myData.getD11(), "departure");
		stop = myData.getStop();
		
		sorting();
		
	}
	
	public person getPerson(int index){
		return queue[index];
	}
	
	public double getTtotal(){
		return Ttotal;
	}
	
	public String getTStotal(){
		return TStotal;
	}
	
	public double[] getTAns(){
		return TAns;
	}
	
	public String getTS(int idx){
		return TS[idx];
	}
	
	public String getQS(){
		return qS;
	}
	
	public double getT(int idx){
		return TAns[idx];
	}
	
	public void sorting(){
		
		/*
		 * urutkan antrian
		 * dari time terkecil sampai terbesar
		 */
		person temp;
		
		for (int idx1 = 0; idx1 < queue.length-1; idx1++){
			for (int idx2 = idx1+1; idx2 < queue.length; idx2++){
				if ( queue[idx1].getTime() <= 0 || (queue[idx1].getTime() > queue[idx2].getTime() && queue[idx2].getTime() != -1) ){
					temp = queue[idx1];
					queue[idx1] = queue[idx2];
					queue[idx2] = temp;
				}
			}
		}
		
	}
	
	public void averageQueueTime(){
		
		/*
		 * hitung waktu rata-rata per orang di antrian dan return hasilnya
		 */
		
		nQueue[] n = new nQueue[24];
		int Q = 0;
		n[0] = new nQueue(0, 0);
		double[] T = new double[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

		//System.out.println("");
		
		for (int idx = 1; idx < queue.length && queue[idx].getTime() != -1; idx++){
			
			if (queue[idx].getStatus() == "arrival"){
				
				if (queue[idx].getTime() < stop){
					
					if (Q < 0){
						TS[0] += " + ( " + queue[idx].getTime() + " - " + n[idx-1].getTime() + " ) ";
						T[0] += Math.abs(queue[idx].getTime() - n[idx-1].getTime());
						n[idx] = new nQueue(++Q, queue[idx].getTime());
					}else{
						TS[Q] += " + ( " + queue[idx].getTime() + " - " + n[idx-1].getTime() + " ) ";
						T[Q] += Math.abs(queue[idx].getTime() - n[idx-1].getTime());
						//TS[Q] += T[Q];
						n[idx] = new nQueue(++Q, queue[idx].getTime());
					}
				
				}else{
					Q--;
					TS[Q] += " + ( " + queue[idx].getTime() + " - " + n[idx-1].getTime() + " ) = ";
					T[Q] += Math.abs(queue[idx].getTime() - n[idx-1].getTime());
					//System.out.println(T[Q]);
					n[idx] = new nQueue(++Q, queue[idx].getTime());
				}
				
			}else if (queue[idx].getStatus() == "departure"){
				
				if (Q-1 == -1){
					
					TS[Q] += " + ( " + queue[idx].getTime() + " - " + n[idx-1].getTime() + " ) ";
					T[Q] += Math.abs(queue[idx].getTime() - n[idx-1].getTime());
					//System.out.println(T[Q]);
					n[idx] = new nQueue(0, queue[idx].getTime());
					Q--;
				
				}else{
					
					TS[Q] += " + ( " + queue[idx].getTime() + " - " + n[idx-1].getTime() + " ) ";
					T[Q] += Math.abs(queue[idx].getTime() - n[idx-1].getTime());
					//System.out.println(T[Q]);
					n[idx] = new nQueue(--Q, queue[idx].getTime());
				
				}
			}
		}
		
		for (int i = 0; TS[i] != null; i++){
			
			TS[i] = TS[i].replace("null + ", "");
			TS[i] = "T" + i + " = " + TS[i];
		}
		
		for (int i = 0; T[i] != 0; i++){
			TS[i] += " = " + df2.format(T[i]);
		}
		
		for (int i = 0; TS[i] != null; i++){
			
			TStotal += " + " + df2.format(T[i]) + " * " + i;
			Ttotal += T[i] * i;
			
		}
		
		TStotal = TStotal.replace("null + ", "");
		TStotal = "Ttotal = " + TStotal + " = " + df2.format(Ttotal);
		
		q = Ttotal / stop;
		qS = "q = " + df2.format(Ttotal) + " / " + df2.format(stop) + " = " + df2.format(q);
		
	}
	
	public double idleTime(double[] queue){
		
		/*
		 * hitung waktu status operator/server idle/tidak sibuk dan return hasilnya
		 */
		
		return 0;
		
	}
	
}
