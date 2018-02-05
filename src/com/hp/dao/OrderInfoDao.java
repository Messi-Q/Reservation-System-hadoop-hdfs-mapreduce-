package com.hp.dao;

import java.util.List;

import com.hp.entity.FoodCount;
import com.hp.entity.OrderInfo;

public interface OrderInfoDao {

	/**
	 * �������ж�����¼
	 * 
	 * @return
	 */
	public List<OrderInfo> findAll();

	/**
	 * ����id��ѯ��������
	 * 
	 * @param orderId
	 * @return
	 */
	public OrderInfo findById(Integer orderId);

	/**
	 * ���ݶ���idɾ��һ������
	 * 
	 * @param orderId
	 * @return
	 */
	public int deleteById(Integer orderId);

	/**
	 * ����һ������
	 * 
	 * @param orderInfo
	 * @return
	 */
	public int updateById(OrderInfo orderInfo);

	/**
	 * ���һ������
	 * 
	 * @param orderInfo
	 */
	public int add(OrderInfo orderInfo);

	/**
	 * @param day
	 * @return
	 */
	public List<OrderInfo> findOrderDetailsByOrderTime(String day);

	/**
	 * @param userId
	 * @return
	 */
	public List<OrderInfo> findOrderDetailsByUserId(Integer userId);

	/**
	 * @param foodName
	 * @return
	 */
	public List<OrderInfo> findOrderDetaisByFoodName(String foodName);

	
	/**
	 * @param day ,��'2018-01-05'
	 * @return
	 */
	public List<FoodCount> getDaylyCount(String day);
	
	/**
	 * ��ѯ������ߵ�5�ֲ�Ʒ����
	 * @return
	 */
	public List<FoodCount> getTopSellFoods(int topN);
	
	/**
	 * ȷ�϶���
	 * @param orderId
	 * @param value
	 * @return
	 */
	public int setSend(int orderId,int value);
	
	/**
	 * ��ѯ���ж�����Ϣ
	 * @return
	 */
	public List<OrderInfo> findOrderDetaisAll();
	
	
	public  int addFromCart(int userId);

}
