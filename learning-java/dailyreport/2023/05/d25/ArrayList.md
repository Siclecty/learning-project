##### ArrayList

###### 集合概述

* 集合是与数组类似，也是一种容器，用于装数据的。

###### 数组的特点

+ 数组定义完成并启动后，类型确定、长度固定。
+ 在个数不能确定，且要进行增删数据操作的时候，数组是不太合适的。
+ 集合的大小不固定，启动后可以动态变化，类型也可以选择不固定。
+ 集合非常适合做元素个数不确定，且要进行增删操作的业务场景。
+ 集合还提供了许多丰富、好用的功能，而数组的功能很单一。

###### 适合的场景

- 数组适合做数据个数和类型确定的场景
- 集合适合做数据个数不确定，且要做增删元素的场景

###### ArrayList集合

* ArrayList是集合中的一种，它支持索引。

###### ArrayList集合的对象的创建

* public ArrayList()//创建一个空的集合对象 

###### ArrayList集合的添加元素的方法

* public boolean add(E e)//将指定的元素追加到此集合的末尾
* public void add(int index,E element)//在此集合中的指定位置插入指定的元素

###### 泛型概述

* ArrayList<E>：其实就是一个泛型类，可以在编译阶段约束集合对象只能操作某种数据类型。

例：

* ArrayList<String> ：此集合只能操作字符串类型的元素。
* ArrayList<Integer>：此集合只能操作整数类型的元素。

注意：泛型只能支持引用数据类型，不支持基本数据类型。

###### ArrayList集合常用方法

| public E get(int index)           | 返回指定索引处的元素                   |
| --------------------------------- | -------------------------------------- |
| public int size()                 | 返回集合中的元素的个数                 |
| public E remove(int index)        | 删除指定索引处的元素，返回被删除的元素 |
| public boolean remove(Object o)   | 删除指定的元素，返回删除是否成功       |
| public E set(int index,E element) | 修改指定索引处的元素，返回被修改的元素 |

注：从集合后面遍历然后删除，可以避免漏掉元素。