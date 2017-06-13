/**
 * 
 */
package com.ahstu.cles.controller.impl;

import com.ahstu.cles.controller.IController;
import com.ahstu.cles.util.InputUtil;
import com.ahstu.cles.view.IView;
import com.ahstu.cles.view.impl.CommandView;

/**
 * @description
 * @author 何章伟
 * @createDate 2017年6月12日 上午11:12:47
 * @version ver1.0
 * 
 */
public class simpleController implements IController {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ahstu.cles.controller.IController#start()
	 */

	private IView view;// 使用视图

	public simpleController() {
		this.view = new CommandView();
	}

	public void start() {

		// 定义变量
		int choice = -1;// 用来存放用户的选择
		boolean rtnTop = false;// 用来保存是否返回上一级
		boolean exists = false;// 用来保存是否退出的变量
		// 显示欢迎界面
		view.description();
		// 利用do-while循环来展现菜单
		do {
			// 1.显示主菜单
			view.showMainMenu();
			choice = InputUtil.getInt("请选择>");
					
			// 重置rtnTop为false
			rtnTop = false;
			// 2.根据用户的选择进行分支判断
			switch (choice) {
			case 1:
				while (!rtnTop) {
					// 1.进入第一个子菜单【浏览基库】
					view.subShowBaseMenu();
					// 进一步让用户选择
					choice = InputUtil.getInt("请选择>");
					// 进一步分支子菜单处理
					switch (choice) {
					case 1:
						// 浏览单词
						System.out.println("【单词】未完待续......");
						break;
					case 2:
						// 浏览词汇
						System.out.println("【词汇】未完待续......");
						break;
					case 0:
						rtnTop = true;
						break;
					default:
						System.out.println("输入有误");
						break;
					}
				} // end of inner while loop
				break;// end with outer switch csae 1
			case 2:
				while (!rtnTop) {
					// 1.进入第二个子菜单【做游戏学习】
					view.GameMenu();
					// 进一步让用户选择
					choice = InputUtil.getInt("请选择>");
					// 进一步分支子菜单处理
					switch (choice) {
					case 1:
						// 中译英
						System.out.println("【中译英】未完待续......");
						break;
					case 2:
						// 英译中
						System.out.println("【英译中】未完待续......");
						break;
					case 0:
						rtnTop = true;
						break;
					default:
						System.out.println("输入有误");
						break;
					}
				} // end of inner while loop
				break;// end with outer switch csae 2
			case 3:
				while (!rtnTop) {
					// 1.进入第二个子菜单【做游戏学习】
					view.subTestingMenu();
					// 进一步让用户选择
					choice = InputUtil.getInt("请选择>");
					// 进一步分支子菜单处理
					switch (choice) {
					case 1:
						// 开始测试
						System.out.println("【开始测试】未完待续......");
						break;
					case 2:
						// 测试记录
						System.out.println("【测试记录】未完待续......");
						break;
					case 0:
						rtnTop = true;
						break;
					default:
						System.out.println("输入有误");
						break;
					}
				} // end of inner while loop
				break;// end with outer switch csae 3
			case 0:
				System.out.println("已退出");
				exists = true;
				break;
			default:
				break;
			}
		} while (!exists);
	}
}
