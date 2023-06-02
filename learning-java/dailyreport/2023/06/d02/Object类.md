##### Object类

* 一个类要么默认继承了Object类，要么间接继承了Object类，Object类是Java中的祖宗类。
* Object作为所有类的父类，提供了很多常用的方法给每个子类对象拿来使用。

###### Object类的常用方法：

* public String toString()：默认是返回当前对象在堆内存中的地址信息:类的全限名@内存地址
* public boolean equals(Object o)：默认是比较当前对象与另一个对象的地址是否相同，相同返回true，不同返回false

###### toString()方法:

* public String toString():默认是返回当前对象在堆内存中的地址信息:类的全限名@内存地址

  ###### toString存在的意义

  * 父类toString()方法存在的意义就是为了被子类重写，以便返回对象的内容信息，而不是地址信息

###### equals()方法：

* public boolean equals(Object o)：默认是比较当前对象与另一个对象的地址是否相同，相同返回true，不同返回false

  ###### equals存在的意义

  * 为了被子类重写，以便子类自己来定制比较规则。

##### StringBuffer类

* StringBuffer类用于操作字符串时，不生成新的对象，在内存使用上要优于String类。

StringBuffer append(String str)：向StringBuffer追加内容str。

StringBuffer append(StringBuffer sb)：向StringBuffer追加内容sb。

StringBuffer append(char c)：向StringBuffer追加内容c。

StringBuffer delete(int start,int end)：删除指定范围的字符串。

StringBuffer insert(int offset,String str)：在指定位置上指定字符串。

StringBuffer reverse()：将字符串内容反转

##### StringBuilder类

* StringBuilder是一个可变的字符串的操作类，我们可以把它看成是一个对象容器。
* 使用StringBuilder的核心作用：操作字符串的性能比String要更高（如拼接、修改等）。

public StringBuilder append(任意类型)：添加数据并返回StringBuilder对象本身

public StringBuilder reverse()：将对象的内容反转

public int length()：返回对象内容长度

public String toString()：通过toString()就可以实现把StringBuilder转换为String