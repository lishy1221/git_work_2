package java8Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//重复注解
public class RepeatableTest{

		@Target( ElementType.TYPE )

		@Retention( RetentionPolicy.RUNTIME )

		public @interface Filters {//Filters是存放Filter注解的容器

		Filter[] value();

		}

		@Target( ElementType.TYPE )

		@Retention( RetentionPolicy.RUNTIME )

		@Repeatable( Filters.class )

		public @interface Filter {

		String value();

		};

		@Filter( "filter1" )

		@Filter( "filter2" )

		public interface Filterable {

		}

		public static void main(String[] args) {
        //反射API提供了一个新的方法：getAnnotationsByType()，可以返回某个类型的重复注解
		for( Filter filter: Filterable.class.getAnnotationsByType( Filter.class ) ) {

		System.out.println( filter.value() );

		     }

		  }

		}
