-----------------------
MySQL-入门				|
-----------------------
	# C/S结构的软件
	# 关系型数据库管理系统

-----------------------
MySQL-登录服务器		|
-----------------------
	# mysql -hIP地址 -P端口 -u用户名 -p密码
		* 要注意的是,端口的P是大写,密码的p是小写
		* 如果是登录本地,可以无视-h参数
		* 默认3306也可以无视-P参数
	# exit
		* 关闭连接,释放资源
		* \q	也是可以的
		* quit	也是可以的

-----------------------
MySQL-服务器对象		|
-----------------------
	# 没辙了解完全服务器内部的内容,只能粗略分析数据库服务器内部的结构
	# MYSQL服务内部对象为四层	
		系统(DBMS)
			数据库(DB)
				数据表(TABLE)
					字段(FIELD)
						数据()

-----------------------
MySQL-代码注释			|
-----------------------
	--	单行注释(注意,俩横线后面必须要有一个空格)
	#	单行注释


-----------------------
MySQL-需要注意的地方	|
-----------------------
	# mysql中是不允许使用已经定义的关键字
		* 但是可以通过 `关键字`,这种方式来完成使用
		* 该方法对,中文命名也有效

	# 创建了数据库之后,会在data目录下创建一个同名的文件夹
		* 如果是中文名称的数据库,那么会以一种编码格式的字符来显示
		* 该文件夹中会有一个:db.opt文件
		* 该文件中保存了数据库的字符编码,和校验规则

	# 关于MYSQL中的'匹配表达式'
		* %:表示匹配多个字符
		* _:表示匹配单个字符

-----------------------
MySQL-字符集设置		|
-----------------------
	# show variables like '%character%'
		* 查看数据库服务器的字符集设置
		+--------------------------+---------------------------------------------------------+
		| Variable_name            | Value                                                   |
		+--------------------------+---------------------------------------------------------+
		| character_set_client     | utf8                                                    |
		| character_set_connection | utf8                                                    |
		| character_set_database   | utf8                                                    |
		| character_set_filesystem | binary                                                  |
		| character_set_results    | utf8                                                    |
		| character_set_server     | utf8                                                    |
		| character_set_system     | utf8                                                    |
		| character_sets_dir       | C:\Program Files\MySQL\MySQL Server 5.5\share\charsets\ |
		+--------------------------+---------------------------------------------------------+
		character_set_client		:客户端传递过来的数据是utf8格式
		character_set_connection	:连接层字符集
			* 字符集转变的中间者,如果统一了.效率更高.不统一,其实也没问题
		character_set_database		:当前所在数据库的字符集
		character_set_results		:服务器给外部数据的字符集

	# 设置服字符集(快捷方式)
		set names gbk;
			* 该操作会把client,connection,results一次性的设置为指定的字符集
		

	# 使用命令修改参数
		set [参数] [字符集];
		set character_set_client utf8;
	
-----------------------
MySQL-WEB项目乱码问题	|
-----------------------
	动态网站由三部分组成
		1,浏览器
		2,Tomcat服务器
		3,数据库服务器

-----------------------
MySQL-一些基本命令		|
-----------------------
	show variables like '[表达式]';
		* 查看系统变量,根据匹配的参数来
			show variables like '%character%'

	SELECT @@变量名
		* 也是一种查询系统变量的方式

	set [变量名] = [值];
	set @@变量名 = [值];
		* 修改系统变量,仅仅对当前用户/会话有效

	set global [变量名] = [值];
		* 修改系统变量,全局.一次修改终生受益,对所有用户都有效

	show warnings;
		* 查看警告


