class Pahadi{
	public static void main(String args[]){
		int arr[][];
		arr = new int[2][];
		arr[0]=new int[2];
		arr[1]=new int[2];
		for(int x[]:arr){
			for(int y: x){
				System.out.println(y);
			}
		}
	}
}
