##### File类概述

* File类的对象代表操作系统的文件（文件、文件夹），File类在java.io.File包下。
* File类提供了诸如：创建文件对象代表文件，获取文件信息（大小、修改时间）、删除文件、创建文件（文件夹）等功能

##### IO流

* 用来读写数据的。

##### File类创建对象、

public  File(String pathname) ：根据文件路径创建文件对象 
public  File(String parent, String child)：根据父路径名字符串和子路径名字符串创建文件对象
public  File(File parent, String child)：根据父路径对应文件对象和子路径名字符串创建文件对象 

* File对象可以定位文件和文件夹。
* File封装的对象仅仅是一个路径名，这个路径可以是存在的，也可以是不存在的。

##### 绝对路径和相对路径

* 绝对路径：从盘符开始
* 相对路径：不带盘符，默认直接到当前工程下的目录寻找文件。

##### File类的判断文件类型、获取文件信息功能

public boolean isDirectory()：判断此路径名表示的File是否为文件夹
public boolean isFile()：判断此路径名表示的File是否为文件
public boolean exists() ：判断此路径名表示的File是否存在
public long length()：返回文件的大小（字节数量）
public String getAbsolutePath() | 返回文件的绝对路径
public String getPath()： 返回定义文件时使用的路径 
public String getName()：返回文件的名称，带后缀 
public long lastModified()： 返回文件的最后修改时间（时间毫秒值）

##### File类创建文件的功能

public boolean createNewFile() ：创建一个新的空的文件 
public boolean mkdir()：只能创建一级文件夹 
public boolean mkdirs()：可以创建多级文件夹 

##### File类删除文件的功能

public boolean delete() 删除由此抽象路径名表示的文件或空文件夹 

* delete方法默认只能删除文件和空文件夹，delete方法直接删除不走回收站

##### File类的遍历功能

| public String[] list()          | 获取当前目录下所有的"一级文件名称"到一个字符串数组中去返回。 |
| ------------------------------- | ------------------------------------------------------------ |
| public File[] listFiles()(常用) | 获取当前目录下所有的"一级文件对象"到一个文件对象数组中去返回（重点） |

##### listFiles方法注意事项：

* 当文件不存在时或者代表文件时，返回null
* 当文件对象代表一个空文件夹时，返回一个长度为0的数组
* 当文件对象是一个有内容的文件夹时，将里面所有文件和文件夹的路径放在File数组中返回
* 当文件对象是一个有隐藏文件的文件夹时，将里面所有文件和文件夹的路径放在File数组中返回，包含隐藏文件
* 当没有权限访问该文件夹时，返回null