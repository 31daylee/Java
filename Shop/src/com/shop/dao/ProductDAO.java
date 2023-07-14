package com.shop.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shop.db.DBHelper;
import com.shop.db.SQL;
import com.shop.vo.ProductVO;

public class ProductDAO extends DBHelper {

	private static ProductDAO instance = new ProductDAO();
	public static ProductDAO getInstance() {
		return instance;
	}
	
	private ProductDAO () {};
	
	
	public int insertProduct (ProductVO vo) {
		return 0;
	}	
	public ProductVO selectProduct (int prodNo) {
		
		ProductVO vo = null;
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_PRODUCT);
			psmt.setInt(1, prodNo);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				vo = new ProductVO();
				vo.setProdNo(rs.getInt("prodNo"));
				vo.setProdName(rs.getString(2));
				vo.setStock(rs.getInt(3));
				vo.setPrice(rs.getInt(4));
				vo.setCompany(rs.getString(5));
			}
			close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return vo; 
	}	
	
	
	
	public List<ProductVO> selectProducts () {
		
		List<ProductVO> products = new ArrayList<>();
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL.SELECT_PRODUCTS);
			
			
			
			while(rs.next()) {
				
				ProductVO vo = new ProductVO();
				vo.setProdNo(rs.getInt(1)); //vo.setProdNo(rs.getInt("prodNo")); 과 동일
				vo.setProdName(rs.getString(2));
				vo.setStock(rs.getInt(3));
				vo.setPrice(rs.getInt(4));
				vo.setCompany(rs.getString(5));
				
				products.add(vo); //객체들을 리스트 안에 저장 
				
			}
			close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return products; //return 을 해줘야지 블록 안에서만 존재하던 products가 블록밖에서 사용가능함
		
	}	
	
	
	
	
	public int updateProduct (int prodNo) {
		return 0;
	}	
	
	public void updateProductStock(int prodNo, int prodCount) {
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.UPDATE_PRODUCT_STOCK);
			psmt.setInt(1, prodCount);
			psmt.setInt(2, prodNo);
			
			
			psmt.executeUpdate();
			close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	public int delectProduct (int prodNo) {
		return 0;
	}	
}
