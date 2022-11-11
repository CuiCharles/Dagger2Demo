package com.teld.testdagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.teld.testdagger.test.A;
import com.teld.testdagger.test.C;
import com.teld.testdagger.test.DaggerMainComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

	/***
	 * 第二步  使用Inject 注解，获取到A 对象的实例
	 */
	@Inject
	A a;

	@Inject
	C c;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		/***
		 * 第一步 添加依赖关系
		 */
		//第一种方式
		DaggerMainComponent.create().inject(this);

		//第二种方式
		DaggerMainComponent.builder().build().inject(this);

		/***
		 * 第三步  调用A 对象的方法
		 */

		a.eat();

		c.doSth();

	}
}