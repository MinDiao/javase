/**
 * 
 */
package com.zw.dao;

import java.util.List;

import com.zw.po.Asset;
import com.zw.po.AssetInfo;

/** 
 * 	类描述：资产数据处理层
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月5日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public interface IAssetDao {
	
	/**
	 * 
	 * 	方法描述：根据银行编号删除
	 * 	@param bankId 银行编号
	 * 	@return 影响的行数
	 */
	int deleteAsset(int bankId);
	
	/**
	 * 
	 * 	方法描述：根据用户编号查询个人所有资产
	 * 	@param userId 用户编号
	 * 	@return 用户资产信息
	 */
	List<AssetInfo> selectAssetInfo(int userId);
	
	/**
	 * 
	 * 	方法描述：根据实体类添加资产
	 * 	@param asset资产信息
	 * 	@return 影响的行数
	 */
	int addAsset(Asset asset);
	
	/**
	 * 
	 * 	方法描述：根据银行编号和卡号查询
	 * 	@param asset 银行编号和卡号
	 * 	@return 资产信息
	 */
	Asset selectAssetBankIDAndCardNum(Asset asset);
	
	/**
	 * 
	 * 	方法描述：查询自己某个银行的账户余额
	 * 	@param asset 用户编号和银行编号
	 * 	@return 账户余额
	 */
	//double selectCardMoney(Asset asset);
	
	/**
	 * 
	 * 	方法描述：根据用户编号,银行编号,卡号查询
	 * 	@param asset 用户编号,银行编号,卡号
	 * 	@return 资产信息
	 */
	Asset selectBankidAndUserIdAndCardNum(Asset asset);
	
	/**
	 * 
	 * 	方法描述：取钱
	 * 	@param asset 取钱条件
	 * 	@param extractMoney 取款金额
	 * 	@return 影响的行数
	 */
	int extractAsset(Asset asset, double extractMoney);
	
	/**
	 * 
	 * 	方法描述：存钱
	 * 	@param asset 存钱条件
	 * 	@param depositMoney 存钱金额
	 * 	@return 影响的行数
	 */
	int depositAsset(Asset asset, double depositMoney);
	
	/**
	 * 
	 * 	方法描述：查询个人总资产
	 * 	@param userId 用户编号
	 * 	@return 个人总资产
	 */
	double sumAssetMoney(int userId);
	
}
