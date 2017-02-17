package model;

public class Data extends DataStructure{
	
	private person a0 = new person(0.4, "arrival");
	private person a1 = new person(1.6, "arrival");
	private person a2 = new person(2.1, "arrival");
	private person a3 = new person(3.8, "arrival");
	private person a4 = new person(4.0, "arrival");
	private person a5 = new person(5.6, "arrival");
	private person a6 = new person(5.8, "arrival");
	private person a7 = new person(7.2, "arrival");
	private person a8 = new person(-1, "arrival");
	private person a9 = new person(-1, "arrival");
	private person a10 = new person(-1, "arrival");
	private person a11 = new person(-1, "arrival");
	private person d0 = new person(2.4, "departure");
	private person d1 = new person(3.1, "departure");
	private person d2 = new person(3.3, "departure");
	private person d3 = new person(4.9, "departure");
	private person d4 = new person(8.6, "departure");
	private person d5 = new person(-1, "departure");
	private person d6 = new person(-1, "departure");
	private person d7 = new person(-1, "departure");
	private person d8 = new person(-1, "departure");
	private person d9 = new person(-1, "departure");
	private person d10 = new person(-1, "departure");
	private person d11 = new person(-1, "departure");
	
	
	//Set
	public void setA0(double time){
		a0.setTime(time);
	}
	
	public void setA1(double time){
		a1.setTime(time);
	}
	
	public void setA2(double time){
		a2.setTime(time);
	}
	
	public void setA3(double time){
		a3.setTime(time);
	}
	
	public void setA4(double time){
		a4.setTime(time);
	}
	
	public void setA5(double time){
		a5.setTime(time);
	}
	
	public void setA6(double time){
		a6.setTime(time);
	}
	
	public void setA7(double time){
		a7.setTime(time);
	}
	
	public void setA8(double time){
		a8.setTime(time);
	}
	
	public void setA9(double time){
		a9.setTime(time);
	}
	
	public void setA10(double time){
		a10.setTime(time);
	}
	
	public void setA11(double time){
		a11.setTime(time);
	}
	
	public void setD0(double time){
		d0.setTime(time);
	}
	
	public void setD1(double time){
		d1.setTime(time);
	}
	
	public void setD2(double time){
		d2.setTime(time);
	}
	
	public void setD3(double time){
		d3.setTime(time);
	}
	
	public void setD4(double time){
		d4.setTime(time);
	}
	
	public void setD5(double time){
		d5.setTime(time);
	}
	
	public void setD6(double time){
		d6.setTime(time);
	}
	
	public void setD7(double time){
		d7.setTime(time);
	}
	
	public void setD8(double time){
		d8.setTime(time);
	}
	
	public void setD9(double time){
		d9.setTime(time);
	}
	
	public void setD10(double time){
		d10.setTime(time);
	}
	
	public void setD11(double time){
		d11.setTime(time);
	}
	
	
	//get
	
	public person getA0(){
		return a0;
	}
	
	public person getA1(){
		return a1;
	}
	
	public person getA2(){
		return a2;
	}
	
	public person getA3(){
		return a3;
	}
	
	public person getA4(){
		return a4;
	}
	
	public person getA5(){
		return a5;
	}
	
	public person getA6(){
		return a6;
	}
	
	public person getA7(){
		return a7;
	}
	
	public person getA8(){
		return a8;
	}
	
	public person getA9(){
		return a9;
	}
	
	public person getA10(){
		return a10;
	}
	
	public person getA11(){
		return a11;
	}
	
	public person getD0(){
		return d0;
	}
	
	public person getD1(){
		return d1;
	}
	
	public person getD2(){
		return d2;
	}
	
	public person getD3(){
		return d3;
	}
	
	public person getD4(){
		return d4;
	}
	
	public person getD5(){
		return d5;
	}
	
	public person getD6(){
		return d6;
	}
	
	public person getD7(){
		return d7;
	}
	
	public person getD8(){
		return d8;
	}
	
	public person getD9(){
		return d9;
	}
	
	public person getD10(){
		return d10;
	}
	
	public person getD11(){
		return d11;
	}
	
	
	private double stop = 8.6;
	
	public void setStop(double stop){
		this.stop = stop;
	}
	
	public double getStop(){
		return stop;
	}
	
}
