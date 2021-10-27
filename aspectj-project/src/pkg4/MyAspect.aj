/*
 * @(#) MyAspect.aj
 *
 */
package pkg4;

import java.lang.reflect.Field;

public aspect MyAspect {
	pointcut myField(): get(@MyInject Service *);

	before(): myField() {
		String fieldName = thisJoinPoint.getSignature().getName();
		System.out.println("\t[DBG]Read Field: " + fieldName);
		Object obj = thisJoinPoint.getThis();
		try {
			Field field = obj.getClass().getDeclaredField(fieldName);
			field.setAccessible(true);
			if (field.get(obj) == null) {
				System.out.println("\t[DBG] Dependency Injection: " + field.getName() + " is NULL.");
				System.out.println("\t[DBG] Dependency Injection: Updated.");
				field.set(obj, new Service("Hello Field"));
			}
		} catch (IllegalAccessException | NoSuchFieldException e) {
			e.printStackTrace();
		}
	}

	pointcut myMethod(Service service) : 
		call(@MyExecute void *(Service)) && args(service);

	void around(Service service): myMethod(service) {
		String methodName = thisJoinPoint.getSignature().getName();
		System.out.println("\t[DBG]Read Method: " + methodName);
		if (service == null) {
			System.out.println("\t[DBG] Dependency Injection: Parameter is NULL.");
			System.out.println("\t[DBG] Dependency Injection: Updated.");
			proceed(new Service("Hello Method"));
		} else {
			proceed(service);
		}
	}
}
