package exam.shop.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import exam.shop.service.*;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ItemController {
	
	private ShopService shopService;
	
	public void setShopService(ShopService shopService) {
		this.shopService = shopService;
	}
	//��ǰ ��ü ���
	@RequestMapping(value="/listItem.shop")
	public ModelAndView listItem() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("listItem");
		mav.addObject("listItem", shopService.getItemList());
		
		return mav;
	}
	
	//��ǰ �� ������
	@RequestMapping(value="/detailItem.shop")
	public ModelAndView detailItem() {
		
		return null;
	}
	
}
