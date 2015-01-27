package com.zhoujg77;

import java.text.NumberFormat;

public class DoubleFormat {
	/**
	 * 
	 * @param b 输入的double数
	 * @param a 要保留的位数(四舍五入)
	 * @return  返回String类型
	 */
	public static String formatdouble(double b,int a){
		NumberFormat format1 = NumberFormat.getNumberInstance();
		format1.setMaximumFractionDigits(a);
		return format1.format(b);
	}
}
