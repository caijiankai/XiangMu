/**
 * 
 */
package com.spring.bean.scan;

import org.springframework.stereotype.Component;

/**
 * @author caijiankai
 *
 */
//1.Component标注无需指定创建的bean的id值,默认的命名策略类名首字母小写,作为默认的id值
//id为person的bean的实例,如何指定id的值
//2.XML文件中,告知spring自动扫描那些包下面的component修饰的组件
@Component(value="abc")
public class Person {
		public void eat() {
			System.out.println("正在吃饭");
		}
}
