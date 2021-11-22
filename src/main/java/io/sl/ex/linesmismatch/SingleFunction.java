package io.sl.ex.linesmismatch;

abstract interface SingleFunction<T, R> {
	public abstract R execute(T arg);
}