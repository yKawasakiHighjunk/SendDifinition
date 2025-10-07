package com.highjunk.sendDefinition;

import lombok.Getter;
import lombok.Setter;

/**
 * 送信ファイル・送信グループ指定ファイル読込画面で入力した値を受け取るクラス
 */
public class InputForm {
	
	@Getter
	@Setter
	/**
	 * 名前
	 */
	private String name;
	
	@Getter
	@Setter
	/**
	 * 電話番号
	 */
	private String tel;
	
}
