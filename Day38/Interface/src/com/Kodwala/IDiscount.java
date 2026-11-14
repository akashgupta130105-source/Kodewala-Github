package com.Kodwala;
// java version 1.7 or  7 OR before
public interface IDiscount {
//	public abstract int calculateDiscount
//	public abstract int calculateDiscount
   int  MAX_VAlUE=100;
   public abstract int calculateDiscount(int amount,int rate);
   public abstract void calculateDiscountTax(int tax);
}
