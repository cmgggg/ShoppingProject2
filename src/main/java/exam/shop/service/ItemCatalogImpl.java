package exam.shop.service;

import java.util.*;

import exam.shop.dao.*;
import exam.shop.dto.*;

public class ItemCatalogImpl implements ItemCatalog {

	private ItemDAOImpl itemDAOImpl;
	
	public void setItemDAOImpl(ItemDAO itemDAOImpl) {
		this.itemDAOImpl = itemDAOImpl;
	}
	
	@Override
	public List<Item> getItemList() {
		// TODO Auto-generated method stub
		
		List<Item> list = itemDAOImpl.findAll();
		
		return null;
	}

	@Override
	public Item getItemByItemId(int itemId) {
		// TODO Auto-generated method stub
		return null;
	}	

}
