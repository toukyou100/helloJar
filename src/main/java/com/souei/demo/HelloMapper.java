package com.souei.demo;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HelloMapper {

	List<HelloBean> selectEmpAll();
}
