package cn.jdmall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jdmall.service.ItemService;
import cn.jdmmall.mapper.TbItemMapper;
import cn.jdmmall.pojo.TbItem;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper tbItemMapper;

	@Override
	public TbItem getItemById(long id) {
		TbItem item = tbItemMapper.selectByPrimaryKey(id);
		return item;
	}

}
