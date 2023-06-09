



##### IO流概述

* I表示intput，把硬盘文件中的数据读入到内存的过程，称之输入，负责读。
* O表示output，把内存中的数据写出到硬盘文件的过程，称之输出，负责写。

##### IO流的分类

| 输入流 | InputStream  | Reader |
| ------ | ------------ | ------ |
| 输出流 | OutputStream | Writer |

###### 总结流的四大类:

* 字节输入流：以内存为基准，来自磁盘文件/网络中的数据以字节的形式读入到内存中去的流称为字节输入流。
* 字节输出流：以内存为基准，把内存中的数据以字节写出到磁盘文件或者网络中去的流称为字节输出流。
* 字符输入流：以内存为基准，来自磁盘文件/网络中的数据以字符的形式读入到内存中去的流称为字符输入流。
* 字符输出流：以内存为基准，把内存中的数据以字符写出到磁盘文件或者网络介质中去的流称为字符输出流。

##### 文件字节输入流：FileInputStream

* 作用：以内存为基准，把磁盘文件中的数据以字节的形式读取到内存中去。

构造器：

| public FileInputStream(File file)       | 创建字节输入流管道与源文件对象接通 |
| --------------------------------------- | ---------------------------------- |
| public FileInputStream(String pathname) | 创建字节输入流管道与源文件路径接通 |

方法：

| public int read()              | 每次读取一个字节返回，如果字节已经没有可读的返回-1     |
| ------------------------------ | ------------------------------------------------------ |
| public int read(byte[] buffer) | 每次读取一个字节数组返回，如果字节已经没有可读的返回-1 |

| public int read()              | 每次读取一个字节返回，如果字节已经没有可读的返回-1           |
| ------------------------------ | ------------------------------------------------------------ |
| public int read(byte[] buffer) | 每次使用字节数组来读取数据，返回读取的字节个数，如果没有可读返回-1 |

###### 如何使用字节输入流读取中文内容输出不乱码

* 一次性读取完全部字节。
* 可以定义与文件一样大的字节数组读取，也可以使用官方API。
* 如果文件过大，定义的字节数组可能引起内存溢出。

##### 文件字节输出流：FileOutputStream

* 作用：以内存为基准，把内存中的数据以字节的形式写出到磁盘文件中去的流。

构造器：

| public FileOutputStream(File file)                       | 创建字节输出流管道与源文件对象接通             |
| -------------------------------------------------------- | ---------------------------------------------- |
| public FileOutputStream(File file，boolean append)       | 创建字节输出流管道与源文件对象接通，可追加数据 |
| public FileOutputStream(String filepath)                 | 创建字节输出流管道与源文件路径接通             |
| public FileOutputStream(String filepath，boolean append) | 创建字节输出流管道与源文件路径接通，可追加数据 |

##### 文件字节输出流（FileOutputStream）写数据出去的API

方法：

| public void write(int a)                             | 写一个字节出去               |
| ---------------------------------------------------- | ---------------------------- |
| public void write(byte[] buffer)                     | 写一个字节数组出去           |
| public void write(byte[] buffer , int pos , int len) | 写一个字节数组的一部分出去。 |

##### 流的关闭与刷新

方法：

| flush() | 刷新流，还可以继续写数据                                     |
| ------- | ------------------------------------------------------------ |
| close() | 关闭流，释放资源，但是在关闭之前会先刷新流。一旦关闭，就不能再写数据 |

