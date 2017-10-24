package cn.e3mall.search.mapper;

import java.util.List;

import cn.e3mall.common.pojo.SearchItem;

public interface ItemMapper {

	SearchItem getItemById(long itemId);
	List<SearchItem> getItemList();
}
