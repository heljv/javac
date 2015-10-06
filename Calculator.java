/** Класс реализует калькулятор * */

public class Calculator {
	// Поле класса
	int result;
	
	/** Метод, суммирующий аргументы. */
	public void add(int param1, int param2) {
		this.result=param1+param2;
	}
	
	/** Метод, возвращающий результат */
	public int getResult() {
		return this.result;
	}
	
	/** Метод, очищающий результат */
	public void cleanResult() {
		this.result=0;
	}
}
