package java8Test;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/*Nashorn JavaScript引擎是javax.script.ScriptEngine的另一个实现版本，
这类Script引擎遵循相同的规则，允许Java和JavaScript交互使用*/
public class NashornTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName( "JavaScript" );

		System.out.println( engine.getClass().getName() );
		try {
			System.out.println( "Result:" + engine.eval( "function f() { return 1; }; f() + 1;" ) );
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
