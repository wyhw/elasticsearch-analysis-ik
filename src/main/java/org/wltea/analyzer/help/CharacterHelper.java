
package org.wltea.analyzer.help;

public class CharacterHelper {

	public static boolean isSpaceLetter(char input){
		return input == 8 || input == 9 
				|| input == 10 || input == 13 
				|| input == 32 || input == 160;
	}
	
	public static boolean isEnglishLetter(char input){
		return (input >= 'a' && input <= 'z') 
				|| (input >= 'A' && input <= 'Z');
	}
	
	public static boolean isArabicNumber(char input){
		return input >= '0' && input <= '9';
	}
	
	public static boolean isCJKCharacter(char input){
		Character.UnicodeBlock ub = Character.UnicodeBlock.of(input);
		if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS  
				|| ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS  
				|| ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A

				|| ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS
				//韩文字符集
				//|| ub == Character.UnicodeBlock.HANGUL_SYLLABLES 
				//|| ub == Character.UnicodeBlock.HANGUL_JAMO
				//|| ub == Character.UnicodeBlock.HANGUL_COMPATIBILITY_JAMO
				//日文字符集
				//|| ub == Character.UnicodeBlock.HIRAGANA 
				//|| ub == Character.UnicodeBlock.KATAKANA
				//|| ub == Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS//火星文
                || ub == Character.UnicodeBlock.ENCLOSED_ALPHANUMERICS //③⑶⒊
                || ub == Character.UnicodeBlock.DINGBATS //❸
                || ub == Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS //㊂㋂
                || ub == Character.UnicodeBlock.NUMBER_FORMS //ⅲ
                || ub == Character.UnicodeBlock.LETTERLIKE_SYMBOLS //№
                || ub == Character.UnicodeBlock.CJK_COMPATIBILITY //㏢
                || ub == Character.UnicodeBlock.MISCELLANEOUS_SYMBOLS //♥
                || ub == Character.UnicodeBlock.CJK_COMPATIBILITY_FORMS //︼
                || ub == Character.UnicodeBlock.ARROWS //↑
                || ub == Character.UnicodeBlock.MATHEMATICAL_OPERATORS //⊙
                || ub == Character.UnicodeBlock.BOX_DRAWING //●
                //|| ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION //〇
                || ub == Character.UnicodeBlock.GEOMETRIC_SHAPES //◎
                || ub == Character.UnicodeBlock.GREEK //Ψ
                || ub == Character.UnicodeBlock.GENERAL_PUNCTUATION //※
                || ub == Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS //㊣
                || ub == Character.UnicodeBlock.MISCELLANEOUS_TECHNICAL //⌒
                || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS //卐
                || ub == Character.UnicodeBlock.BOPOMOFO //ㄨ
                || ub == Character.UnicodeBlock.BLOCK_ELEMENTS //▂ 
                || ub == Character.UnicodeBlock.CYRILLIC //щ 
                || ub == Character.UnicodeBlock.COMBINING_DIACRITICAL_MARKS //щ 
                || ub == Character.UnicodeBlock.MISCELLANEOUS_SYMBOLS//♪ 
                || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS//曱 
				) {  
			return true;
		}else{
			return false;
		}

	}
	
	public static char regularize(char input){
        if (input == 12288) {
            input = (char) 32;
            
        }else if (input > 65280 && input < 65375) {
            input = (char) (input - 65248);
            
        }else if (input >= 'A' && input <= 'Z') {
        	input += 32;
		}
        
        return input;
	}

}
