##### Math类

* 包含执行基本数字运算的方法，Math类没有提供公开的构造器。

###### 常用方法：

static int abs(int a)：返回绝对值。

static double ceil(double a)：返回大于或等于参数的最小整数。

static double floor (double a)：返回大于或等于参数的最大整数。

static int max(int q,int b)：返回两个参数的较大值。

static int min (int a,int b)：返回两个参数的较大值。

random ()：返回0.0~1.0的·double类型的随机数，包括0.0，不包括1.0

static long round(double a)：返回四舍五入的整数值。

static double sqrt(double a)：平方根函数。

static double pow(double a,double b)：幂运算。

##### System类

* System的功能是通用的，都是直接用类名调用，不能实例化。

###### 常用方法：

static long currentTimeMillis ():返回以毫秒为单位的当前时间。

static void exit (int status)：终止当前正在运行的Java虚拟机。

static void gc()：运行垃圾回收器。

 static void arraycopy(数据源数组，起始索引，目的地数组，起始索引，拷贝个数)：数组拷贝。

##### BigDecimal作用

* 用于解决浮点型运算精度失真的问题

* public static BigDecimal valueOf(double val):包装浮点数成为BigDecimal对象。

###### 常用方法

BigDecimal add(BigDecimal b)：加法。

BigDecimal subtract(BigDecimal b)：减法。

BigDecimal multiply(BigDecimal b)：乘法。

BigDecimal divide(BigDecimal b)：除法。

BigDecimal divide(另一个BigDecimal对象，精确几位，舍入模式)：除法。

##### Date类

* Date类代表当前所在系统的日期时间信息。

Date的构造器

* public Date()

常用方法：

* public long getTime()

当前获取时间的方式：

```
public static void main(String[] args) {
      Date d = new Date();
      System.out.println(d);
      long time = d.getTime();
      System.out.println(time);
}
```

##### SimpleDateFormat类

* 代表简单日期格式化，可以用来把日期时间格式化成为我们想要的形式。

构造器：

* public SimpleDateFormat (String pattern)：创建简单日期格式化对象，并封装格式化的形式信息。

格式化方法：

* public final String format(Date date)：将日期格式化成日期/时间字符串。
* public final String format(Object time)：将时间毫秒值式化成日期/时间字符串。

解析方法：

* public Date parse(String source)：从给定字符串的开始解析文本以生成日期

##### Calendar概述

* Calendar代表了系统此刻日期对应的日历对象。
* Calendar是一个抽象类，不能直接创建对象。

Calendar日历类创建日历对象的方法：

* public static Calendar getInstance()：获取当前日历对象。

常用方法：

* public int get(int field)：取日期中的某个字段信息。
* public void set(int field,int value)：修改日历的某个字段信息。
* public void add(int field,int amount）：为某个字段增加/减少指定的值。
* public final Date getTime()：拿到此刻日期对象。
* public long getTimeInMillis()：拿到此刻时间毫秒值。