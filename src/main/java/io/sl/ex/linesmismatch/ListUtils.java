package io.sl.ex.linesmismatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ListUtils {

	public static <T> List<T> where(Collection<T> items, SingleFunction<T, Boolean> predicate){
		if (items == null)
			return null;
		
		List<T> results = new ArrayList<T>();
		
		for (T item : items) {
			if (predicate.execute(item))
			{
				results.add(item);
			}
		}
		
		return results;
	}
	
	public static <T> List<T> where(T[] items, SingleFunction<T, Boolean> predicate) {
		List<T> list = Arrays.asList(items);
		List<T> result = where(list, predicate);
		return result;
	}
	
	public static <T> T firstOrDefault(Collection<T> list, SingleFunction<T, Boolean> predicate){
		if (list == null)
			return null;
		
		for (T item : list) {
			if (predicate.execute(item))
			{
				return item;
			}
		}
		
		return null;
	}

	
	
}
