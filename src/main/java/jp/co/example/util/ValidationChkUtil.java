package jp.co.example.util;

public class ValidationChkUtil {
	
	/**
	 * 未定義の文字列型フィールドを判定するメソッド
	 * @param value
	 * @return boolean
	 *  */
	public static boolean strIsEmpty(String value){
		if (value==null||value.length()== 0){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * 未定義の整数型フィールドを判定するメソッド
	 * @param value
	 * @return boolean
	 *  */
	public static boolean intIsEmpty(Integer value){
		if (value==null){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * 未定義の整数型フィールドを判定するメソッド
	 * @param value
	 * @return boolean
	 *  */
	public static boolean longIsEmpty(Long value){
		if (value==null){
			return true;
		}else{
			return false;
		}
	}
}
