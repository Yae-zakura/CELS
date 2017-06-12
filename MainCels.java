package com.ahstu.cles;

import com.ahstu.cles.controller.IController;
import com.ahstu.cles.controller.impl.simpleController;

public class MainCels {
	// 程序入口
	public static void main(String[] args) {
		// 创建对象
		IController c = new simpleController();
		// 启动控制器
		c.start();
	}

}
