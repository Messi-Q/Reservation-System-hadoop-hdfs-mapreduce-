package com.hp.entity;

import java.util.Date;

//������Ϣ��
public class OrderInfo {
//	CREATE TABLE OrderInfo(
//			OrderId  INT PRIMARY KEY AUTO_INCREMENT,
//			FoodId INT,
//			UserId INT,
//			OrderNum INT,
//			OrderTime DATETIME,
//			Send SMALLINT,
//			FOREIGN KEY(FoodId)REFERENCES FoodInfo(FoodId),
//			FOREIGN KEY(UserId)REFERENCES UserInfo(UserId)
//		)AUTO_INCREMENT=1,CHARSET=utf8;
	
	//����id,����
	private Integer orderId;
	
	//��Ʒid--���foodInfo
	private Integer foodId;
	
	//�û�id--��� userinfo
	private Integer userId;
	
	//��������
	private Integer orderNum;
	
	//����ʱ��
	private Date orderTime;
	
	//�Ƿ��ʹ�
	private Integer send;
	
	//�û���Ϣ 
	private UserInfo userInfo;
	
	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public Food getFoodInfo() {
		return foodInfo;
	}

	public void setFoodInfo(Food foodInfo) {
		this.foodInfo = foodInfo;
	}

	//��Ʒ��Ϣ
	private Food foodInfo;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getFoodId() {
		return foodId;
	}

	public void setFoodId(Integer foodId) {
		this.foodId = foodId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}

	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public Integer getSend() {
		return send;
	}

	public void setSend(Integer send) {
		this.send = send;
	}

	public OrderInfo() {
	}

	public OrderInfo(Integer orderId, Integer foodId, Integer userId, Integer orderNum, Date orderTime, Integer send,
			UserInfo userInfo, Food foodInfo) {
		super();
		this.orderId = orderId;
		this.foodId = foodId;
		this.userId = userId;
		this.orderNum = orderNum;
		this.orderTime = orderTime;
		this.send = send;
		this.userInfo = userInfo;
		this.foodInfo = foodInfo;
	}

	

	


	
}



