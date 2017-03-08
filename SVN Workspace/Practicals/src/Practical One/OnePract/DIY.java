package OnePract;

public class DIY {
	
	//DIY ONE
	
	private int area, sideLength;
	
		public DIY(int iLength){
			
			sideLength = iLength;
			area = sideLength * sideLength;
		
			}
	
	
	public int getArea(){
		return area;
		
	}
	
	public void grow(){
		
		sideLength = 2 * sideLength;
	}
}
	
