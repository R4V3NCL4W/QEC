package model;

import model.DataStructure.person;

public class Calculation {
	
	private person[] queue = new person[23];
	
	public Calculation(Data myData){
		queue[0] = myData.getA0();
		queue[1] = myData.getA1();
		queue[2] = myData.getA2();
		queue[3] = myData.getA3();
		queue[4] = myData.getA4();
		queue[5] = myData.getA5();
		queue[6] = myData.getA6();
		queue[7] = myData.getA7();
		queue[8] = myData.getA8();
		queue[9] = myData.getA9();
		queue[10] = myData.getA10();
		queue[11] = myData.getA11();
		queue[12] = myData.getD0();
		queue[13] = myData.getD1();
		queue[14] = myData.getD2();
		queue[15] = myData.getD3();
		queue[16] = myData.getD4();
		queue[17] = myData.getD5();
		queue[18] = myData.getD6();
		queue[19] = myData.getD7();
		queue[20] = myData.getD8();
		queue[21] = myData.getD9();
		queue[22] = myData.getA10();
		queue[23] = myData.getD11();
		
		sorting();
	}
	
	public person getPerson(int index){
		return queue[index];
	}
	
	public void sorting(){
		
		/*
		 * urutkan antrian
		 * dari time terkecil sampai terbesar
		 */
		person temp = null;
		int idx;
		
		for(idx = 0; idx <= queue.length; idx++){
			if (queue[idx].getTime() >= 0){
				temp = queue[idx];
				queue[idx] = queue[0];
				queue[0] = temp;
			}
		}
		
		for (int idx1 = 0; idx1 <= queue.length-1; idx++){
			for (int idx2 = 1; idx2 <= queue.length; idx++){
				if (queue[idx1].getTime() > queue[idx2].getTime() && queue[idx2].getTime() >= 0){
					temp = queue[idx2];
					queue[idx1] = queue[idx2];
					queue[idx2] = temp;
				}
			}
		}
		
	}
	
	public double averageQueueTime(person[] queue){
		
		/*
		 * hitung waktu rata-rata per orang di antrian dan return hasilnya
		 */
		
		return 0;
		
	}
	
	public double idleTime(person[] queue){
		
		/*
		 * hitung waktu status operator/server idle/tidak sibuk dan return hasilnya
		 */
		
		return 0;
		
	}
	
}
