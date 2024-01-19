//Merge 2 sorted array in sorted 
package POG;
public class Ass1 {
	private int a1[]= {3,5,9,12,16,17,22,26,30,35,40,45},	
			a2[]= {2,4,7,11,23,29,34,36};
	int l1=a1.length,l2=a2.length;
	private int a3[]=new int [l1+l2];
	public void merge() {
		int i=0,j=0,k=-1;
		while(i<l1 &&j<l2) {
			if(a1[i]<a2[j]) {
				k++;
				a3[k]=a1[i];
				i++;
			}
			else if(a1[i]>a2[j]) {
				k++;
				a3[k]=a2[j];
				j++;
			}
			else {
				k++;
				a3[k]=a1[i];
				i++;j++;
			}
			
		}
		while(i<l1) {
			k++;
			a3[k]=a1[i];
			i++;
		}
		while(j<l2) {
			k++;
			a3[k]=a2[j];
			j++;
		}
		
	}
	public void print() {
		for(int t:a3)
			System.out.print(t+" ");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ass1 a=new Ass1();
		a.merge();
		a.print();
	}

}
