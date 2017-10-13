package lab0;

public class Variant18 {
	
	public double nummberTaks(double a, double c, double b) {
		if(a>c || b<c) 
			throw new AssertionError("Wron iputt");
		return (a+=c)*(b+=c);
	}
	/*------------------------------------------------------*/
	public   int integerTask(int num) {
		assert  num>999 : "Wrong iput";
		num/=1000;
		while(num>=10) 
			num/=10;
		return num;
	}
	/*------------------------------------------------------*/
	public boolean  strTask (int a, int b, int c) {
		if (a==b ||a==c || b==c)
			return true;
		else return  false;
	}
	/*------------------------------------------------------*/
	public  int indexTask(int a, int b, int c) {
		int index = 0;
			if (a==b && a==c && b==c) throw new AssertionError("Wrong iput");
			else if (a==b || a==c || b==c) {	
				if (a==b) index = 3;
					else if (a==c) index = 2;
					else if (b==c) index = 1;
					return index;
			}
			else  throw new AssertionError("Wron iputt");
			
	}
	/*------------------------------------------------------*/
	public  String numStrTask(int num) {
		String first="", second="", third="", StrToNum="";
		if (num>=100 && num<=999) {
			int a = num%10;
			switch(a) {
			case 1: first = "Один"; break;
			case 2: first = "Два"; break;
			case 3: first = "Три"; break;
			case 4: first = "Четыре"; break;
			case 5: first = "Пять"; break;
			case 6: first = "Шесть"; break;
			case 7: first = "Семь"; break;
			case 8: first = "Восемь"; break;
			case 9: first = "Девять"; break;
			default:break;
			}
			num/=10;
			a = num%10;
			switch(a) {
			case 1: second = "Один"; break;
			case 2: second = "Двадцать"; break;
			case 3: second = "Тридцать"; break;
			case 4: second = "Сорок"; break;
			case 5: second = "Пятьдесят"; break;
			case 6: second = "Шестьдесят"; break;
			case 7: second = "Семьдесят"; break;
			case 8: second = "Восемьдесят"; break;
			case 9: second = "Девяносто"; break;
			default:break;
			}
			num/=10;
			a = num%10;
			switch(a) {
			case 1: third = "Сто"; break;
			case 2: third = "Двести"; break;
			case 3: third = "Триста"; break;
			case 4: third = "Четыреста"; break;
			case 5: third = "Пятьсот"; break;
			case 6: third = "Шестьсот"; break;
			case 7: third = "Семьсот"; break;
			case 8: third = "Восемьсот"; break;
			case 9: third = "Двятьсот"; break;
			default:break;
			}
			if (second.equals("Один")) {
				if(first.equals("Один")) {
					second = "Одиннадцать";
					first = "";
				}
				else if (first.equals("Два")) {
					second = "Двенадцать";
					first = "";
				}
				else if (first.equals("Три")) {
					second = "Тринадцать";
					first = "";
				}
				else if (first.equals("Четыре")) {
					second = "Четырнадцать";
					first = "";
				}
				else if (first.equals("Пять")) {
					second = "Пятнадцать";
					first = "";
				}
				else if (first.equals("Шесть")) {
					second = "Шестнадцать";
					first = "";
				}
				else if (first.equals("Семь")) {
					second = "Семнадцать";
					first = "";
				}
				else if (first.equals("Восемь")) {
					second = "Восемнацдать";
					first = "";
				}
				else if (first.equals("Девять")) {
					second = "Девятнадцать";
					first = "";
				}
				
				else {
					second = "Десять";
					first = "";
				}
			}
			StrToNum=third+" "+second+" "+first;
			return StrToNum;
			
		}
		else  throw new AssertionError("Wron iputt");
		
	}
	/*-----------------------------------------------------------------*/
	public  double forTask(double A, int N) {
		double res=0;
		if (N<=0)  throw new AssertionError("Wron iputt");
		else
			for (int i=1; i<=N; i++) 
				res+= Math.pow((A*=-1), i) ;
		return res;
	}
	/*------------------------------------------------------------------*/
	protected class WhileNumm{
		private int count;
		private int sum;
		
		WhileNumm(){
		count = 0;
		sum = 0;
		}
		WhileNumm(int c, int s)
		{
			count = c;
			sum = s;
		}
		
		@Override
		public boolean equals(Object obj) {
			if(obj==this) {
				return true;
			}
			if(obj==null||obj.getClass()!=this.getClass()) {
				return false;
			}
			
			WhileNumm s =(WhileNumm)obj;
				return (s.count==this.count && s.sum==this.sum);
		}
	}
	
	public WhileNumm calculate(int n) {
		WhileNumm q = new WhileNumm();
		while (n!=0)
		{
			q.sum+=n%10;
			q.count++;
			n/=10;
		}
		return q;
	}
	double arrTask(double[] mas, int n){
		double rez = 0.0;
		for (int i=0; i<n; i++) 
			if(i==n-2) 
				return rez;
			else {
					if(mas[i]<=mas[i+1] && mas[i+1]>=mas[i+2] && rez<=mas[i+1]) 
						rez=mas[i+1];
				}
		return rez;
	}
	/*------------------------------------------------------------------*/
	public int [][] matrixTask(int [][] mas){
		
		int a = mas[0][0];
		int index = 0;
		for (int i= 0; i<mas.length; i++) {
			for (int j=0; j<mas[i].length; j++) {
				if (mas[i][j]>a) {
					a=mas[i][j];
					index = j;
				}
			}
		}
		
		int count=mas[0].length;
		int [][]arr = new int [mas.length][count-1];
		if (index!=count-1)
		for (int i=0, I=0; i<mas.length; i++) {
			for (int j=0, J=0; j<mas[i].length; j++) {
				arr[I][J]=mas[i][j];
					J++;
					if(J==mas[i].length-1) {
						J=0;
						I++;
					}
			}
		}
		else {
			for (int i=0; i<mas.length; i++) {
				for (int j=0; j<mas[i].length-1; j++) {
					arr[i][j]=mas[i][j];
						
					}
			}
		}
		return arr;
	}
	
	public static void main (String[] args) {
	
	}
}

