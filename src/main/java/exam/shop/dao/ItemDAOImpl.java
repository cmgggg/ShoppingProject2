package exam.shop.dao;

import java.sql.*;
import java.util.*;

import org.springframework.jdbc.core.*;

import exam.shop.dto.*;

public class ItemDAOImpl implements ItemDAO {

	private JdbcTemplate jdbcTemplate;
	
	//DataSource 이용해서 DataBase 연결
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public ItemDAOImpl() {
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public List<Item> findAll() {
		// TODO Auto-generated method stub
		
		String sql = "select * from items";
		
		List<Item> list = jdbcTemplate.query(sql, new RowMapper<Item>(){

			@Override
			public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Item item = new Item(rs.getInt("item_id"),
									 rs.getString("item_name"),
									 rs.getString("describtion"),
									 rs.getInt("price"),
									 rs.getString("picture_url"));
				
				return item;
			}
			
		});
		
		return list;
	}

}
