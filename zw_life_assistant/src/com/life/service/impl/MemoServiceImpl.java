/**
 * 
 */
package com.life.service.impl;

import java.util.List;

import com.life.dao.IMemoDao;
import com.life.dao.impl.MemoDaoImpl;
import com.life.po.Memo;
import com.life.service.IMemoService;

/** 
 * 	类描述：
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月11日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class MemoServiceImpl implements IMemoService {
	
	private static IMemoDao memodao = new MemoDaoImpl();

	/* (non-Javadoc)
	 * @see com.life.service.IMemorandumService#selectUserId(com.life.po.Users)
	 * 根据用户id查看备忘录
	 */
	@Override
	public List<Memo> selectMemo(Memo memo) {
		
		return memodao.selectMemo(memo);
	}

	/* (non-Javadoc)
	 * @see com.life.service.IMemoService#insertMemo(com.life.po.Memo)
	 */
	@Override
	public int insertMemo(Memo memo) {
		
		return memodao.insertMemo(memo);
	}

	/* (non-Javadoc)
	 * @see com.life.service.IMemoService#updateMemo(com.life.po.Memo, int)
	 * 修改备忘录
	 */
	@Override
	public int updateMemo(Memo memo, int mid) {
		Memo memo1 = memodao.selectMemoMid(mid);
		if (memo1 == null) {
			return -1; // 修改前查询结果为空
		} else {
			return memodao.updateMemo(memo);
		}
	}

	/* (non-Javadoc)
	 * @see com.life.service.IMemoService#delete(int)
	 * 删除备忘录
	 */
	@Override
	public int delete(int mid) {
		Memo memo = memodao.selectMemoMid(mid);
		if (memo == null) {
			return -1; // 不存在备忘录
		} else {
			return memodao.delete(mid);
		}
		
	}

}
