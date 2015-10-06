/** Класс реализует операции сложения, умножения, деления и возведения 
	в степень двух заданных при запуске чисел. *********************/

public class Calculate 
{
	public static void main(String[] arg) 
	{
	/** Программа принимает два заданных аргумента */
	int first=Integer.valueOf(arg[0]);
	int second=Integer.valueOf(arg[1]);
	/** Вычисление суммы */
	int summ=first+second;
	/** Вычисление произведения */
	int mult=first*second;
	/** Вычисление частного с предварительным преобразованием типа данных */
	double div=((double) first)/((double)second);
	/** Вычисление степени */
	double degree=Math.pow(first,second);		
	/** Вывод результатов */
	System.out.println("Summ of "+first+" and "+second+" is "+summ);				
	System.out.println("Multiplication of "+ first+" and "+second+" is "+mult);				
	System.out.println("Division of "+first+" and "+second+" is "+div);				
	System.out.println(first+" to the "+second+" degree is "+degree);		
	}
}