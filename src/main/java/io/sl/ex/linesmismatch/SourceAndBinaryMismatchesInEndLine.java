package io.sl.ex.linesmismatch;

import java.lang.reflect.Method;
import java.util.List;

import lombok.Data;

public class SourceAndBinaryMismatchesInEndLine {
	private static int CONST_1 = 1;
	private static int CONST_2;
	private static String STR_1 = "STR_1";
	
	/**
	 * The method demonstrates complex multi-line return statement in anonymous class
	 */
    public List<Method> getProperties(Object obj) {
        Method[] declaredMethods = obj.getClass().getDeclaredMethods();
        List<Method> properties = ListUtils.where(declaredMethods, new SingleFunction<Method, Boolean>() {
            @Override
            public Boolean execute(Method method) {
                return (method.getName().startsWith("get") || method.getName().startsWith("is"))
                		&& !method.getName().equals("getSystemProperty");
            }
        });

        return properties;
    }
    
    /**
     * The method demonstrates return with multi-line method call 
     */
    public Iterable<? extends Object> getSegments() {
    	Object uniqueId = Helper.getUniqueId(
    			"getUniqueId", "Failed to get unique id for test");
    	if (uniqueId == null) {
    		return null;
    	}
    	return (Iterable<? extends Object>) Helper.getUniqueId(
    			"getSegments", "Failed to get segments from unique id.");
    }

    public boolean isValid_1(Integer value) {
    	return STR_1.isEmpty() && 
    			value != null && value > CONST_1;
    }
    
    public boolean isValid_2(Integer value) {
    	return STR_1.isEmpty() && 
    			value != null 
    			&& value > CONST_1;
    }
    
    public boolean isValid_3(Integer value) {
    	return STR_1.isEmpty() 
    			|| STR_1.contains("1") 
    			&& value != null && value > CONST_1;
    }
    
    public boolean isValid_4(Integer value) {
    	return value != null && value > CONST_1
    			|| value == CONST_2;
    }
    
    public boolean isValid_4_1() {
    	int value = 2;
    	return value > CONST_1
    			|| value == CONST_2 ;
    }

    public boolean isValid_5(Integer value) {
    	return 1 > CONST_1
    			|| 2 == CONST_2;
    }

    public boolean isNull(Integer value) {
    	return this != null 
    			&& value != null;
    }
    
    static class Helper {
    	static Object getUniqueId(String property, String error) {
    		return "";
    	}
    	
    	static boolean isValid() {
    		return true;
    	}
    }
    
    @Data
    static class Book {
		String title;
    	String author;
    	String subtitle;
    	
		String toString1() {
			return "Book [title=" + title 
					+ ", author=" + author 
					+ ", subtitle=" + subtitle + "]";
		}

		/*
		 * Here is documentation
		 */
		String toString2() {
			StringBuilder builder = new StringBuilder();
			builder.append("Book [title=").append(title).append(", author=").append(author).append(", subtitle=")
			.append(subtitle).append("]");
			return builder.toString();
		}
		
    }
    
    
}

