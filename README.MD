# 简介
该项目是基于Java开发的TFRecord读写库。<br>
TFRecord是Tensorflow框架推荐的数据库，为了获得更好的导出性能，可以使用本框架进行数据导出。
# 如何安装
该项目暂未上传Maven中央仓库，暂时只支持源码安装。(之后Star多了会上传Maven中央库) <br> <br>
在Bash中执行以下命令：
```bash
> git clone https://github.com/thtTNT/TFRecordUtil.git
> cd TFRecordUtil
> mvn clean install
```
在Maven支持库中导入以下依赖：
```xml
<dependency>
    <groupId>com.github.thttnt</groupId>
    <artifactId>tfrecord-util</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```
# 如何使用
该项目提供了一个TFRecordWriter类，用于写入TFRecord文件。<br>
```java
// 创建一个TFRecordWriter对象，参数为文件路径和是否压缩
TFRecordWriter tfRecordWriter = new TFRecordWriter("test.tfrecord",true);

// 创建一个Example对象，用于存储数据
Example example = new Example();

// 向Example对象中添加数据
example.setFeature("byte_array_test",new byte[]{1,2,3,4,5});
example.setFeature("int_test",1);
example.setFeature("boolean_test",false);
example.setFeature("float_test",1.0f);
example.setFeature("double_test",1.0);
example.setFeature("string_test","test");

// 将Example对象写入TFRecord文件
tfRecordWriter.write(example);

// 关闭TFRecordWriter对象
tfRecordWriter.close();
```
# 注意
该项目暂未经过严格测试，可能存在一些Bug，如果发现Bug请提交Issue。<br>
读取TFRecord文件的功能暂未实现，后续会实现。 <br>
如果你觉得这个项目还不错，欢迎Star。