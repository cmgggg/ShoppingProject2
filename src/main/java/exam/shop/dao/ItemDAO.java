package exam.shop.dao;

import java.util.*;

import exam.shop.dto.*;

public interface ItemDAO {
	
	//��ǰ ����Ʈ
	List<Item> findAll();
	
	//��ǰ �󼼳���
	Item findByItemId(int itemId);
}
