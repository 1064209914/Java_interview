package com.hxd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *输入一组不重复的字符串 打印出所有可能的组合
 *如 输入 abc 打印 
 *abc acb  bac bca cab cba
 *
 */
public class ListAll {
		  public ArrayList<String> Permutation(String str) {  
		        ArrayList<String> list = new ArrayList<String>();  
		        char[] ch = str.toCharArray();  
		        Permu(ch, 0, list);  
		        Collections.sort(list);  
		        return  list;  
		    }  
		  
		    public void Permu(char[] str, int i, ArrayList<String> list) {  
		        if (str == null) {  
		            return;  
		        }  
		        if (i == str.length - 1) {  
		            if(list.contains(String.valueOf(str))){  
		                return;  
		            }  
		            list.add(String.valueOf(str));  
		        } else {   
		            for (int j = i; j < str.length; j++) {  
		                char temp = str[j];  
		                str[j] = str[i];  
		                str[i] = temp;  
		  
		                Permu(str, i + 1, list);  
	
		                temp = str[j];  
		                str[j] = str[i];   
		                str[i] = temp;  
		            }  
		        }  
		  
		    }  
			public static void main(String[] args) {
				ListAll listAll=new ListAll();
				String string="12";
			ArrayList<String> list=listAll.Permutation(string);
			System.out.println(list);
	}
}
