package jp.vn.yuanyuan.dao;

import java.util.List;

import jp.vn.yuanyuan.mapper.RowMapper;

public interface GenericDAO<T>{

	
	//@SuppressWarnings("hiding")
	<T> List<T> query(String sql,RowMapper<T> rowMapper,Object...parameters);
	void update(String sql,Object...parameters); // cap nhat va xoa
	Long insert(String sql,Object...parameters); //them moi
	int count(String sql,Object...parameters);
}
