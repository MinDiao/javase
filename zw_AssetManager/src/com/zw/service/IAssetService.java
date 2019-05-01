/**
 * 
 */
package com.zw.service;

import java.util.List;

import com.zw.po.Asset;
import com.zw.po.AssetInfo;

/** 
 * 	类描述：
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月6日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public interface IAssetService {

	/**
	 * 
	 * 	方法描述：根据用户id查询用户资产
	 * 	@param userId 用户id
	 * 	@return 用户资产信息
	 */
	List<AssetInfo> selectAssetInfo(int userId);
	
	/**
	 * 
	 * 	方法描述：添加资产
	 * 	@param asset 资产实体类
	 * 	@return 执行的行数
	 */
	int addAsset(Asset asset);
	
	/**
	 * 
	 * 	方法描述：取款
	 * 	@param asset 资产实体类
	 * 	@param extractMoney 取的金额
	 * 	@return
	 */
	int extractAsset(Asset asset, double extractMoney);
	
	/**
	 * 
	 * 	方法描述：存款
	 * 	@param asset 资产实体
	 * 	@param depositMoney 存的金额
	 * 	@return
	 */
	int depositAsset(Asset asset, double depositMoney);
	
	/**
	 * 
	 * 	方法描述：查询个人总资产
	 * 	@param userid 用户id
	 * 	@return 个人总资产
	 */
	double sumAssetMoney(int userId);
}
