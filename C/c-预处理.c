--------------------------------
#include						|
--------------------------------
	# 头文件的本质其实就是把指定的文件'copy'到当前文件的include处
	# 头文件的导入
		#include<xx.h>
	
	# 系统标准的头文件
		Windows 
			C:\MinGW\include

		Linux
			/usr/include
	
	# #include<xxx.h> 和 #include "xxx.h" 的区别
		* <> 用的是编译器的类库路径里面的头文件
		* 一般是引用自带的一些头文件

		* "" 引用的是程序目录的相对路径中的头文件
		* 一般是用来引用自己写的一些头文件
		* 它会先在你项目的当前目录查找是否有对应头文件,如果没有,它还是会去path(编译)环境中寻找
	
	# 多个文件(#include<xx>)中,函数名称不能重复(静态函数除外)

	# 防止头文件重复包含,有两种方式
		1,头文件添加 #pragma once
			* 你希望哪个头文件进制被其他文件重复包含,添加到哪个头文件顶部
			* 顶部添加了该代码的文件,在被重复包含时,也仅仅只有一次生效
		
		2,条件编译(老版本)
			#ifndef _NAME_.H
			#define _NAME_.H
				//函数声明
			#endif

			* 以上是 name.h 这个头文件的条件编译
		
		
--------------------------------
#define							|
--------------------------------
	# 编译时替换常量
		#define name value

		* 在编译程序的时候,程序中的所有 name 都会被替换为 value
		* 这个过程称为编译时替换,在运行程序的时候,所有替换都已经完成
		* 这样定义的常量也被称为明示常量

		* 末尾不需要添加;,而且名称要大写(非强制约束)

-------------------------------
#pragma							|
--------------------------------
	# 比较复杂的一个指令
	# 保证头文件只被编译一次(用的比较多)
		#pragma once
	
