/**
 * 
 */
package com.zw.service.impl;

import java.util.List;

import com.zw.dao.IAssetDao;
import com.zw.dao.IBankDao;
import com.zw.dao.impl.AssetDaoImpl;
import com.zw.dao.impl.BankDaoImpl;
import com.zw.po.Asset;
import com.zw.po.AssetInfo;
import com.zw.po.Bank;
import com.zw.service.IAssetService;

/** 
 * 	类描述：资产业务层实现类
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月6日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class AssetServiceImpl implements IAssetService {
	
	private IAssetDao assetDao = new AssetDaoImpl();
	
	private IBankDao bankDao = new BankDaoImpl();

	/* (non-Javadoc)
	 * @see com.zw.service.IAssetService#selectAssetInfo(int)
	 * 根据用户id查询用户资产
	 */
	@Override
	public List<AssetInfo> selectAssetInfo(int userId) {
		
		return assetDao.selectAssetInfo(userId);
	}

	/* (non-Javadoc)
	 * @see com.zw.service.IAssetService#addAsset(com.zw.po.Asset)
	 */
	@Override
	public int addAsset(Asset asset) {
		
		//根据银行编号查询
		Bank bank = bankDao.selectBankID(asset.getBankId());
		//根据银行编号和卡号查询
		Asset asset2 = assetDao.selectAssetBankIDAndCardNum(asset);
		//判断该银行是否存在
		if (bank == null) {
			return -1;//该银行不存在
		} else if(asset2 != null) {
			return -2;//该银行已经有该卡号
		} else {
			return assetDao.addAsset(asset);//添加成功
		}
		
	}

	/* (non-Javadoc)
	 * @see com.zw.service.IAssetService#extractAsset(com.zw.po.Asset, double)
	 * 	取钱
	 */
	@Override
	public int extractAsset(Asset asset, double extractMoney) {
		//先查询该用户是否有此资产
		Asset asset1 = assetDao.selectBankidAndUserIdAndCardNum(asset);
		//查询该用户该资产
		//double cardmoney = assetDao.selectBankidAndUserIdAndCardNum(asset);
		if (asset1 == null) {
			return -1; //数据库中没有此资产
		} else if(asset1.getCardMoney() < extractMoney) {
			return -2; //账户余额不足
		} else {
			return assetDao.extractAsset(asset, extractMoney); //取钱成功
		}
	}

	/* (non-Javadoc)
	 * @see com.zw.service.IAssetService#depositAsset(com.zw.po.Asset, double)
	 * 	存款
	 */
	@Override
	public int depositAsset(Asset asset, double depositMoney) {
		//先查询该用户是否有该资产
		Asset asset1 = assetDao.selectBankidAndUserIdAndCardNum(asset);
		//判断
		if (asset1 == null) {
			return -1; // 数据库中没有此资产
		} else {
			return assetDao.depositAsset(asset, depositMoney);
		}
	}

	/* (non-Javadoc)
	 * @see com.zw.service.IAssetService#sumAssetMoney(int)
	 */
	@Override
	public double sumAssetMoney(int userId) {

		return assetDao.sumAssetMoney(userId);
	}
	
	

}
