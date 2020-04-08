package _03_Advanced._04_Data_Structue._05_Class_Properties;

import java.util.Properties;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB02_put_getProperty_Methods {
    
    public static void main(String[] args) {
        
        Properties defaultNumbers = new Properties();
        
        defaultNumbers.put("٠", "Zero");
        defaultNumbers.put("١", "One");
        defaultNumbers.put("٢", "Two");
        defaultNumbers.put("٣", "Three");
        defaultNumbers.put("٤", "Four");
        defaultNumbers.put("٥", "Five");
        defaultNumbers.put("٦", "Six");
        defaultNumbers.put("٧", "Seven");
        defaultNumbers.put("٨", "Eight");
        defaultNumbers.put("٩", "Nine");
        
        Properties arabicNumbers = new Properties(defaultNumbers);
        
        arabicNumbers.put("0", "صفر");
        arabicNumbers.put("1", "واحد");
        arabicNumbers.put("2", "اثنان");
        arabicNumbers.put("3", "ثلاثة");
        arabicNumbers.put("4", "أربعة");
        arabicNumbers.put("5", "خمسة");
        arabicNumbers.put("6", "ستة");
        arabicNumbers.put("7", "سبعة");
        arabicNumbers.put("8", "ثمانية");
        arabicNumbers.put("9", "تسع");
        
        System.out.println(arabicNumbers.getProperty("1"));
        System.out.println(arabicNumbers.getProperty("١"));
        
    }
    
}
