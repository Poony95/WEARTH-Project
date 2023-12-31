package com.example.demo.repository;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.db.MainDBManager;
import com.example.demo.db.ShopDBManager;
import com.example.demo.vo.GoodsCategoryVO;
import com.example.demo.vo.GoodsVO;
@Repository
public class GoodsMybatisRepository {
	
	//전체 상품목록 조회
	public static List<GoodsVO> findGoods(HashMap<Object, Object> map) {
		return ShopDBManager.findGoods(map);
	}
	
	//카테고리별 상품목록 조회
	public static List<GoodsVO> findByCategoryNo(HashMap<Object, Object> map){
		return ShopDBManager.findByCategoryNo(map);
	}
	
	//상품 상세목록 조회
	public static GoodsVO detailGoods(int goodsNo) {
		return ShopDBManager.detailGoods(goodsNo);
	}

	public static int getTotalRecord(Integer categoryNo) {
		return ShopDBManager.getTotalRecord(categoryNo);
	}
	
	//카테고리 조회
	public static GoodsCategoryVO findCategory(Integer goodsNo) {
		return ShopDBManager.findCategory(goodsNo);
	}
	// 인기 상품 조회
	public List<GoodsVO> getPopularGoods(){
		return MainDBManager.getPopularGoods();
	}
	
	
	
}
