package exam.shop.dao;

import java.util.*;

import exam.shop.dto.*;

public interface ItemDAO {
	
	//상품 리스트
	List<Item> findAll();
	
	//상품 상세내용
	Item findByItemId(int itemId);
}
