##### String

###### String 概述

* java.lang.String 类代表字符串，String类定义的变量可以用于指向字符串对象，然后操作该字符串。
* Java 程序中的所有字符串文字（例如“abc”）都为此类的对象。

###### String类的特点详解

+ String其实常被称为不可变字符串类型，它的对象在创建后不能被更改。

###### String类的常用方法-字符串内容比较

+ 使用String提供的equals方法。
+ 只关心内容一样就返回true。

###### String常用API

| 方法名                                                       | 说明                                                     |
| ------------------------------------------------------------ | -------------------------------------------------------- |
| public int length()                                          | 返回此字符串的长度                                       |
| public char charAt(int index)                                | 获取某个索引位置处的字符                                 |
| public char[] toCharArray()：                                | 将当前字符串转换成字符数组返回                           |
| public String substring(int beginIndex, int endIndex)        | 根据开始和结束索引进行截取，得到新的字符串（包前不包后） |
| public String substring(int beginIndex)                      | 从传入的索引处截取，截取到末尾，得到新的字符串           |
| public String replace(CharSequence target, CharSequence replacement) | 使用新值，将字符串中的旧值替换，得到新的字符串           |
| public String[] split(String regex)                          | 根据传入的规则切割字符串，得到字符串数组返回             |

###### String类创建对象的2种方式

+ 直接使用“”定义。
+ 通过String类的构造器创建对象。